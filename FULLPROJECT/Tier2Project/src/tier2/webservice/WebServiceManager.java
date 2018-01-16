package tier2.webservice;

import java.util.ArrayList;
import common.model.Animal;
import common.model.PartType;
import common.model.TrayCollection;
import tier2.Controller.RegisterSystemController;

public class WebServiceManager implements ISlaughterhouseWebService
{
	private static final WebServiceManager instance = new WebServiceManager();
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
		String messageType = getMessageType(message);
		switch(messageType)
		{
			/* Animal client */
			case WebServiceConfig.REGISTER_ANIMAL: // REGISTER_ANIMAL 14.0
				controller.registerAnimal(parseMessageToAnimal(message));
				return "\nAnimal registered";
			/* Tray Client */
			case WebServiceConfig.REQUEST_UNCUT_ANIMALS:
				
			case WebServiceConfig.ADD_PART_TO_TRAY: // ADD_PART_TO_TRAY 97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a weights:2.0,3.3,9.5
				controller.splitAnimal(parseMessageToAnimalById(message), parseMessageToPartsWeights(message));
				return "\nAnimal was split into parts of different weights";
			/* PackClient */
			case WebServiceConfig.REQUEST_TRAYS_READY_FOR_PACKAGING: // REQUEST_TRAYS_READY_FOR_PACKAGING HAM
				TrayCollection trays = getReadyTraysByType(message);
				return responseWithTraysById(trays); // RESPONSE_TRAYS_READY_FOR_PACKAGING trays:97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a,97c5134f-13e7-4d0c-8bd3-1d5cf5e0036a
			case WebServiceConfig.REGISTER_PACKAGE: // REGISTER_PACKAGE trays:
				//AbstractPackage pk = getReadyTraysByType(message)
				//AbstractPackage pk = new PackageHalfAnAnimal(new TrayCollection());
				//AbstractPackage pk = new PackageByType(new TrayCollection(), "type");
				//controller.registerPackage(pk); 
				return "";
			default: 
				return "You contacted the server, but it could not intepret the content";
		}
	}
	
	private String responseWithTraysById(TrayCollection trays)
	{
		String response = WebServiceConfig.RESPONSE_TRAYS_READY_FOR_PACKAGING;
		response += " trays:";
		for(int i = 0; i < trays.getTrayCollection().size(); i++){
			if(i < trays.getTrayCollection().size() -1){
				response += trays.getTrayCollection().get(i) + ",";
			}
			else
			{
				response += trays.getTrayCollection().get(i);
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
