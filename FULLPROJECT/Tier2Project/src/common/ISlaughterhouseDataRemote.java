package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;
/**
 * This is the interface declaring the methods that can be invoked on the remote object 
 * @author SIR
 *
 */
public interface ISlaughterhouseDataRemote extends Remote
{
	void saveAnimals(AnimalCollection animals) throws RemoteException;
	void saveTrays(TrayCollection trays) throws RemoteException;
	void savePackages(PackageCollection packages) throws RemoteException;
	ArrayList<String> getBadPackages(Package p) throws RemoteException;
}
