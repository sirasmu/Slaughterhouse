package tier2.webservice;

public interface WebServiceConfig
{
//	void registerAnimal(Animal animal);
	public static final String REGISTER_ANIMAL = "REGISTER_ANIMAL";
//	AnimalCollection getUncutAnimals();
	public static final String REQUEST_UNCUT_ANIMALS = "REQUEST_UNCUT_ANIMALS";
//	void addPartToTrayType(PartType type, double weight, Animal animal);
	public static final String ADD_PART_TO_TRAY = "ADD_PART_TO_TRAY";	
//	TrayCollection getTraysForPacaking();
	public static final String REQUEST_TRAYS_READY_FOR_PACKAGING = "REQUEST_TRAYS_READY_FOR_PACKAGING";	
//	void registerPackage(AbstractPackage pack);	
	public static final String REGISTER_PACKAGE = "REGISTER_PACKAGE";	
}
