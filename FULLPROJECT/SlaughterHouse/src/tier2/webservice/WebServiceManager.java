package tier2.webservice;

public class WebServiceManager
{
	private static final WebServiceManager instance = new WebServiceManager();
	
	private WebServiceManager()
	{
		
	}
	
	public static WebServiceManager getInstance()
	{
		return instance;
	}
	
	public String readIncomingMessage(String message)
	{
		String messageType = getMessageType(message);
		switch(messageType)
		{
			case WebServiceConfig.REGISTER_ANIMAL:
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
	
	private String getMessageType(String message)
	{
		return message;
		
	}
	
	
}
