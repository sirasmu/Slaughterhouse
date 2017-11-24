package tier2.webservice;

import common.model.Animal;
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
			case WebServiceConfig.REGISTER_ANIMAL:
				Animal animal = parseToAnimal(message);
				controller.registerAnimal(animal);
				return "Animal registered: " + animal;
			case WebServiceConfig.REQUEST_UNCUT_ANIMALS:
			case WebServiceConfig.ADD_PART_TO_TRAY:
			case WebServiceConfig.REQUEST_TRAYS_READY_FOR_PACKAGING:
			case WebServiceConfig.REGISTER_PACKAGE:
				//Translate message into animal object;
				//Pass object to controller....... wait does the controller need to be a singleton?
				return "";

			default: 
				return "You contacted the server, but it could not intepret the content";
		}
	}
	
	private Animal parseToAnimal(String message)
	{
		// TODO Auto-generated method stub
		return null;
	}

	private String getMessageType(String message)
	{
		String[] splitMessage = message.split(" ");
		return splitMessage[0];	
	}


	
	
}
