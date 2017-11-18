package tier3;

import java.sql.Statement;

import com.sun.corba.se.pept.transport.Connection;

import common.ISlaughterhouseRemote;
import common.model.Animal;
import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;

public class SlaughterhouseRemote implements ISlaughterhouseRemote
{
	
	private DataController controller;
	
	public SlaughterhouseRemote()
	{
		controller = new DataController();
	}
	
	public void saveAnimals(AnimalCollection animals)
	{
		controller.saveAnimals(animals);
	}
	
	public void saveTrays(TrayCollection trays)
	{
		controller.saveTrays(trays);
	}
	
	public void savePackages(PackageCollection packages)
	{
		controller.savePackages(packages);
	}
	
	public void saveBadPackages(PackageCollection packages)
	{
		controller.saveBadPackages(packages);
	}
	
	public PackageCollection getBadPackages(Package p)
	{
		return controller.getBadPackages(p);
	}
}
