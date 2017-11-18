package tier3;

import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;

public interface IDataAdapter
{
	void saveAnimals(AnimalCollection animals);
	void saveTrays(TrayCollection trays);
	void savePackages(PackageCollection packages);
	void saveBadPackages(PackageCollection packages);
	PackageCollection getBadPackages(PackageCollection packages);
}
