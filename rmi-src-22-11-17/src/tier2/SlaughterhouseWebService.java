package tier2;

import common.model.AbstractPackage;
import common.model.Animal;
import common.model.AnimalCollection;
import common.model.PackageByType;
import common.model.PartType;
import common.model.Tray;
import common.model.TrayCollection;

public interface SlaughterhouseWebService
{
	void registerAnimal(Animal animal);
	AnimalCollection getUncutAnimals();
	void addPartToTrayType(PartType type, double weight, Animal animal);
	TrayCollection getTraysForPacaking();
	void registerPackage(AbstractPackage pack);
}
