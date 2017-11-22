package tier3;

import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;

public class DatabaseAdapter implements IDataAdapter
{
	
	public DatabaseAdapter()
	{
		
	}

	@Override
	public void saveAnimals(AnimalCollection animals)
	{
		System.out.println("Saving animals to adapter to databse...");
		System.out.println("The adapter has not been implemented");
		//System.out.print("You tried to save the following animals:\n" + animals.get(0).toString());
	}

	@Override
	public void saveTrays(TrayCollection trays)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void savePackages(PackageCollection packages)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void saveBadPackages(PackageCollection packages)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public PackageCollection getBadPackages(Package p)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
