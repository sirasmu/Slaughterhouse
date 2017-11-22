package tier3;

import org.omg.PortableServer.AdapterActivatorOperations;

import common.model.Animal;
import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;
public class DataController
{
	private IDataAdapter adapter;
	private View view;
	
	public DataController ()
	{
		adapter = new DatabaseAdapter();
		view = new View();
	}
	
	public void saveAnimals(AnimalCollection animals)
	{
		view.printLog("Saving animals...");
		adapter.saveAnimals(animals);
		view.printLog("Animals saved");
	}
	
	public void saveTrays(TrayCollection trays)
	{
		view.printLog("Saving trays...");
		adapter.saveTrays(trays);
		view.printLog("Trays saved");
	}
	
	public void savePackages(PackageCollection packages)
	{
		view.printLog("Saving packages...");
		adapter.savePackages(packages);
		view.printLog("Packages saved");
	}
	
	public void saveBadPackages(PackageCollection packages)
	{
		view.printLog("Saving bad packages...");
		adapter.saveBadPackages(packages);
		view.printLog("Bad packages saved");
	}
	
	public PackageCollection getBadPackages(Package p)
	{
		view.printLog("Retrieving other bad packages...");
		return adapter.getBadPackages(p);
	}	
}
