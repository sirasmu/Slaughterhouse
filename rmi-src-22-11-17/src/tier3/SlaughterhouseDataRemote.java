package tier3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import common.ISlaughterhouseDataRemote;
import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;

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
	
	public void saveBadPackages(PackageCollection packages) throws RemoteException 
	{
		controller.saveBadPackages(packages);
	}
	
	public PackageCollection getBadPackages(Package p) throws RemoteException 
	{
		return controller.getBadPackages(p);
	}
}
