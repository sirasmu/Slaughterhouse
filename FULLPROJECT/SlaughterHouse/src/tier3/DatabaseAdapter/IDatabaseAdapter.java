package tier3.DatabaseAdapter;

import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;

/**
 * This is the adapter for storing persistent data
 * @author SIR
 * 
 */
public interface IDatabaseAdapter
{
	void saveAnimals(AnimalCollection animals);
	void saveTrays(TrayCollection trays);
	void savePackages(PackageCollection packages);
	void saveBadPackages(PackageCollection packages);
	PackageCollection getBadPackages(Package p);
}
