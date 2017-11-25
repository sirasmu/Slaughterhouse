package tier3.RMIAdaptor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import common.ISlaughterhouseDataRemote;
import common.model.*;
import tier3.Controller.*;

public class SlaughterhouseDataRemote extends UnicastRemoteObject implements ISlaughterhouseDataRemote
{
	
	private DataController controller;
	
	public SlaughterhouseDataRemote() throws RemoteException 
	{
		controller = new DataController();
	}
	
	public void saveAnimals(AnimalCollection animals) throws RemoteException 
	{
		controller.saveAnimals(animals);
	}
	
	public void saveTrays(TrayCollection trays) throws RemoteException 
	{
		controller.saveTrays(trays);
	}
	
	public void savePackages(PackageCollection packages) throws RemoteException 
	{
		controller.savePackages(packages);
	}
	
	public ArrayList<String> getBadPackages(String p) throws RemoteException 
	{
		return controller.getBadPackages(p);
	}


}
