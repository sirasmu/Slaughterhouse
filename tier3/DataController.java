package tier3;

import org.omg.PortableServer.AdapterActivatorOperations;

import common.model.Animal;
import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;
public class DataController
{
	private IDataAdapter adapter;
	private IView view;
	
	public DataController ()
	{
		adapter = new DatabaseAdapter();
		view = new View();
	}
	
	public void saveAnimals(AnimalCollection animals)
	{
		view.displayMessage("Saving animals...");
		adapter.saveAnimals(animals);
	}
	
	public void saveTrays(TrayCollection trays)
	{
		view.displayMessage("Saving trays...");
		adapter.saveTrays(trays);
	}
	
	public void savePackages(PackageCollection packages)
	{
		view.displayMessage("Saving packages...");
		adapter.savePackages(packages);
	}
	
	public void saveBadPackages(PackageCollection packages)
	{
		view.displayMessage("Saving bad packages...");
		adapter.saveBadPackages(packages);
	}
	
	public PackageCollection getBadPackages(Package p)
	{
		view.displayMessage("Retrieving other bad packages...");
		return adapter.getBadPackages(p);
	}	
}
