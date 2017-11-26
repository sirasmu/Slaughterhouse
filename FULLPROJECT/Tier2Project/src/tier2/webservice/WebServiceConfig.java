package tier2.webservice;

public interface WebServiceConfig
{
//	void registerAnimal(Animal animal);
	public static final String REGISTER_ANIMAL = "REGISTER_ANIMAL";
//	AnimalCollection getUncutAnimals();
	public static final String REQUEST_UNCUT_ANIMALS = "REQUEST_UNCUT_ANIMALS";
//	void addPartToTrayType(PartType type, double weight, Animal animal);
	/* Rename several parts will be added, So what is happening is the animal is being cut up and the parts will each have weights than will be dealt with*/
	public static final String SPLIT_ANIMAL = "SPLIT_ANIMAL";	
//	TrayCollection getTraysForPacaking();
	public static final String REQUEST_TRAYS_READY_FOR_PACKAGING = "REQUEST_TRAYS_READY_FOR_PACKAGING";	
	public static final String RESPONSE_TRAYS_READY_FOR_PACKAGING = "RESPONSE_TRAYS_READY_FOR_PACKAGING";	
//	void registerPackage(AbstractPackage pack);	
	public static final String REGISTER_PACKAGE = "REGISTER_PACKAGE";
	public static final String PACKAGE_BY_TYPE = "PACKAGE_BY_TYPE";	
	public static final String PACKAGE_HALF_ANIMAL = "PACKAGE_HALF_ANIMAL";
	public static final String RESPONSE_UNCUT_ANIMALS = "RESPONSE_UNCUT_ANIMALS";	

}
