package tier3;

import org.omg.PortableServer.AdapterActivatorOperations;

import common.model.Animal;
import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;

public class DataController
{
	IDataAdapter adapter;
	
	public DataController (IDataAdapter adapter)
	{
		this.adapter = adapter;
	}
	
	public void saveAnimals(AnimalCollection animals)
	{
		adapter.saveAnimals(animals);
	}
	
	public void saveTrays(TrayCollection trays)
	{
		adapter.saveTrays(trays);
	}
	
	public void savePackages(PackageCollection packages)
	{
		adapter.savePackages(packages);
	}
	
	public void saveBadPackages(PackageCollection packages)
	{
		adapter.saveBadPackages(packages);
	}
	
	public PackageCollection getBadPackages(Package p)
	{
		return adapter.getBadPackages(p);
	}	
}
