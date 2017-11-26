package tier2.webservice;

import java.util.ArrayList;

import common.model.AbstractPackage;
import common.model.Animal;
import common.model.AnimalCollection;
import common.model.PackageByType;
import common.model.PackageHalfAnAnimal;
import common.model.PartType;
import common.model.Tray;
import common.model.TrayCollection;
import tier2.Controller.RegisterSystemController;

public class WebServiceManager implements ISlaughterhouseWebService
{
	private static final WebServiceManager instance = new WebServiceManager(); // On second thought it is stupid to make this a singleton. I don't know what I was thinking
	private RegisterSystemController controller;
	
	private WebServiceManager()
	{
		controller = new RegisterSystemController();
	}
	
	public static WebServiceManager getInstance()
	{
		return instance;
	}
	
	/**
	 * This method is used by the webservice
	 * @param message
	 * @return the response to the webservice
	 */
	public String readIncomingMessage(String message)
	{
		controller.getView().printLog("Incoming message: \"" + message + "\"");
		String messageType = getMessageType(message);
		switch(messageType)
		{
			/* Animal client */
			case WebServiceConfig.REGISTER_ANIMAL: // REGISTER_ANIMAL 14.0
				controller.registerAnimal(parseMessageToAnimal(message));
				return "Animal registered";
			/* Tray Client */
			case WebServiceConfig.REQUEST_UNCUT_ANIMALS: //REQUEST_UNCUT_ANIMALS
				return responseWithUncutAnimals(controller.getNotSplitAnimals());
			case WebServiceConfig.SPLIT_ANIMAL: // SPLIT_ANIMAL 97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a weights:2.0,3.3,9.5
				controller.splitAnimal(parseMessageToAnimalById(message), parseMessageToPartsWeights(message));
				return "Animal was split into parts of different weights";
			/* PackClient */
			case WebServiceConfig.REQUEST_TRAYS_READY_FOR_PACKAGING: // REQUEST_TRAYS_READY_FOR_PACKAGING HAM
				return responseWithTraysById(getReadyTraysByType(message)); // RESPONSE_TRAYS_READY_FOR_PACKAGING trays:97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a,97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a
			case WebServiceConfig.REGISTER_PACKAGE: // REGISTER_PACKAGE type trays:97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a,97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a
				TrayCollection trays = getReadyTraysById(message); // REGISTER_PACKAGE half_an_animal trays:97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a,97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a			
				AbstractPackage pk = packageByProductType(message, trays);
				controller.registerPackage(pk); 
				return "Registered package";
			default: 
				return "You contacted the server, but it could not intepret the content";
		}
	}
	
	private String responseWithUncutAnimals(AnimalCollection notSplitAnimals)
	{
		String response = WebServiceConfig.RESPONSE_UNCUT_ANIMALS;
		response += " animals:"; //Don't have it hardcoded!!!
		for(int i = 0; i < notSplitAnimals.getAnimalCollection().size(); i++){
			if(i < notSplitAnimals.getAnimalCollection().size() -1){
				response += notSplitAnimals.getAnimalCollection().get(i).getAnimalId() + ",";
			}
			else
			{
				response += notSplitAnimals.getAnimalCollection().get(i).getAnimalId();
			}
		}
		return response;
	}
	
	/* Could probably be refactored */
	private AbstractPackage packageByProductType(String message, TrayCollection trays)
	{
		String[] splitMessage = message.split(" ");
		String packageProductType = splitMessage[1];
		AbstractPackage pk; 
		if(packageProductType.equals(WebServiceConfig.PACKAGE_BY_TYPE))
		{
			pk = new PackageByType(new TrayCollection(), trays.getTrayCollection().get(0).getType()); // Bad refactor
		}
		else if (packageProductType.equals(WebServiceConfig.PACKAGE_HALF_ANIMAL))
		{
			pk = new PackageHalfAnAnimal(new TrayCollection());
		}
		return null;
	}

	private TrayCollection getReadyTraysById(String message)
	{
		String[] splitMessage = message.split(":");
		String[] trayIdArray = splitMessage[1].split(",");	
		TrayCollection returnCollection = new TrayCollection();
		for(String id: trayIdArray){
			Tray foundTray = controller.getAllTraysReadyForPackaging().findTrayById(id);
			if( foundTray != null)
			{
				returnCollection.add(foundTray);
			}			
		}
		return returnCollection;
	}

	private String responseWithTraysById(TrayCollection trays)
	{
		String response = WebServiceConfig.RESPONSE_TRAYS_READY_FOR_PACKAGING;
		response += " trays:"; //Don't have it hardcoded!!!
		for(int i = 0; i < trays.getTrayCollection().size(); i++){
			if(i < trays.getTrayCollection().size() -1){
				response += trays.getTrayCollection().get(i).getId() + ",";
			}
			else
			{
				response += trays.getTrayCollection().get(i).getId();
			}
		}
		
		return response;
	}
	
	private TrayCollection getReadyTraysByType(String message)
	{
		String[] splitMessage = message.split(" ");
		String type = splitMessage[1];
		switch(type)
		{
			case PartType.HAM:
				return controller.getHamTraysReadyForPackaging();
			case PartType.LEG:
				return controller.getLegTraysReadyForPackaging();
			default:
				throw new IllegalArgumentException();
		}		
	}

	private ArrayList<Double> parseMessageToPartsWeights(String message)
	{
		String[] splitMessage = message.split(":");
		String[] weightArray = splitMessage[1].split(",");
		ArrayList<Double> list = new ArrayList<>();
		for(String weight: weightArray){
			list.add(Double.parseDouble(weight));
		}
		return list;
	}

	private Animal parseMessageToAnimalById(String message)
	{
		String[] splitMessage = message.split(" ");
		String id = splitMessage[1];
		return controller.getAnimals().findAnimalById(id);
	}

	private Animal parseMessageToAnimal(String message)
	{
		String[] splitMessage = message.split(" ");
		double weight = Double.parseDouble(splitMessage[1]);
		return new Animal(weight);
	}

	private String getMessageType(String message)
	{
		String[] splitMessage = message.split(" ");
		return splitMessage[0];	
	}	
}
