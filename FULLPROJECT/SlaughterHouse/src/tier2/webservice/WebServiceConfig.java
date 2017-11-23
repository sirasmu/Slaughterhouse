package tier2.webservice;

public interface WebServiceConfig
{
//	void registerAnimal(Animal animal);
	public static final String REGISTER_ANIMAL = "a";
//	AnimalCollection getUncutAnimals();
	public static final String REQUEST_UNCUT_ANIMALS = "b";
//	void addPartToTrayType(PartType type, double weight, Animal animal);
	public static final String ADD_PART_TO_TRAY = "c";	
//	TrayCollection getTraysForPacaking();
	public static final String REQUEST_TRAYS_READY_FOR_PACKAGING = "d";	
//	void registerPackage(AbstractPackage pack);	
	public static final String REGISTER_PACKAGE = "e";	
}
