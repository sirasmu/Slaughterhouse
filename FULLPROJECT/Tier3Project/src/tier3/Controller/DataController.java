package tier3.Controller;

import java.sql.SQLException;

import org.omg.PortableServer.AdapterActivatorOperations;

import tier3.DatabaseAdapter.DatabaseAdapter;
import tier3.DatabaseAdapter.IDatabaseAdapter;
import tier3.view.View;
import common.model.Animal;
import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;
public class DataController
{
	private IDatabaseAdapter adapter;
	private View view;
	
	public DataController ()
	{
		adapter = new DatabaseAdapter();
		view = new View();
	}
	
	public void saveAnimals(AnimalCollection animals)
	{
		view.printLog("Saving animals...");
		try {
			adapter.saveAnimals(animals);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveTrays(TrayCollection trays)
	{
		view.printLog("Saving trays...");
		try {
			adapter.saveTrays(trays);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void savePackages(PackageCollection packages)
	{
		view.printLog("Saving packages...");
		try {
			adapter.savePackages(packages);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveBadPackages(PackageCollection packages)
	{
		view.printLog("Saving bad packages...");
		try {
			adapter.saveBadPackages(packages);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PackageCollection getBadPackages(Package p)
	{
		view.printLog("Retrieving other bad packages...");
		try {
			return adapter.getBadPackages(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	
}
