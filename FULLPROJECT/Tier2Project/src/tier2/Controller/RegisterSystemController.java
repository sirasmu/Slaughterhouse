package tier2.Controller;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import common.ISlaughterhouseDataRemote;
import common.model.*;
import tier2.view.View;


public class RegisterSystemController {

	private View view;	
	private ModelAdministratorController modelController;
	private AnimalCollection animals;
	private TrayCollection traysHam;
	private TrayCollection traysLeg;
	private PackageCollection packages;
	private ISlaughterhouseDataRemote databaseRemote;
	
	public RegisterSystemController(ISlaughterhouseDataRemote databaseRemote){
		this.view = new View();
		this.modelController= new ModelAdministratorController();
		this.animals= new AnimalCollection();
		this.traysHam= new TrayCollection();
		this.traysLeg= new TrayCollection();
		this.packages= new PackageCollection();
		this.databaseRemote = databaseRemote;
	}
	
	/*
	 * Constructor without connection to the tier 3 
	 */
	public RegisterSystemController(){
		this.view = new View();
		this.modelController= new ModelAdministratorController();
		this.animals= new AnimalCollection();
		this.traysHam= new TrayCollection();
		this.traysLeg= new TrayCollection();
		this.packages= new PackageCollection();
	}
	
	/*
	 * Split an animal when available in the registered animals list and put the parts 
	 * inside a tray (new tray or already created tray)
	 */
	public void splitAnimal(Animal animal, ArrayList<Double> partsWeight)
	{
		if(animal.isAnimalSplit()){
		view.printLog("Animal already split!!");
		}
			//ArrayList<Integer> partsWeight=client.getPartsWeight();
			for(int i=0; i<partsWeight.size(); i++){
				if(i==0) 
				{
					/*Find and existing tray type of part that is not filled completely*/
					Tray temp1= traysHam.getAvailableTray(partsWeight.get(i), PartType.HAM);
					
					/*Add the extra weight to the tray and the animal reference*/
					temp1.addPartFromAnimal(animal, partsWeight.get(i));
					view.printLog("Animal part ham added to trayId " + temp1.getId()+ " weight "+partsWeight.get(i)+".");
				}
				else{
					/*Find and existing tray with type of part that is not filled completely*/
					Tray temp2= traysLeg.getAvailableTray(partsWeight.get(i), PartType.LEG);
					
					/*Add the extra weight to the tray and the animal reference*/
					temp2.addPartFromAnimal(animal, partsWeight.get(i));
					view.printLog("Animal part leg added to trayId " + temp2.getId()+ " weight "+partsWeight.get(i)+".");
				}
			}
			
			animal.setSplit(true);
			//SAVE BACKUP TO LOCAL STORAGE
			modelController.saveAlltoLocalStorage(getCollectionOfAllData());
	}
	
	
	/*
	 * Register a new animal
	 */
	public void registerAnimal(Animal animal){
		animals.add(animal);
		view.printLog("Animal registered: "+ animal.getAnimalId());
		
		//SAVE BACKUP TO LOCAL STORAGE
		modelController.saveAlltoLocalStorage(getCollectionOfAllData());
	}
	
	/*
	 * Register a new package
	 */
	public void registerPackage(AbstractPackage pk){
		packages.add(pk);
		view.printLog("Package registered: "+ pk.getId());
	
		//SAVE BACKUP TO LOCAL STORAGE
		modelController.saveAlltoLocalStorage(getCollectionOfAllData());
	}

	/*
	 * Recovers all temporary working data that the server uses each day
	 * in case the server stops unexpected
	 */
	public void recoverFromFile(){
		try {
			modelController.fetchDataFromLocalStorage(this);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public TrayCollection getHamTraysReadyForPackaging(){
		ArrayList<Tray> all= traysHam.getTrayCollection();
		TrayCollection returnCollection= new TrayCollection();
		for(Tray tr: all){
			if(tr.isReadyForPackaging()){
				returnCollection.add(tr);
			}
		}
		return returnCollection;
	}
	
	
	public TrayCollection getLegTraysReadyForPackaging(){
		ArrayList<Tray> all= traysLeg.getTrayCollection();
		TrayCollection returnCollection= new TrayCollection();
		for(Tray tr: all){
			if(tr.isReadyForPackaging()){
				returnCollection.add(tr);
			}
		}
		return returnCollection;
	}
	
	
	/*
	 * SETTERS AND GETTERS REGION BENEATH
	 */
	
	
	/*
	 * BUILD COLLECTION OF ALL DYNAMIC DATA
	 */
	
	public HashMap<String, Object> getCollectionOfAllData() {
		HashMap<String, Object> allCollections = new HashMap<String, Object>();
		allCollections.put("AnimalCollection", animals);
		allCollections.put("TrayCollectionHam", traysHam);
		allCollections.put("TrayCollectionLeg", traysLeg);
		allCollections.put("PackageCollection", packages);
		return allCollections;
	}
	
	public AnimalCollection getAnimals() {
		return animals;
	}

	public void setAnimals(AnimalCollection animals) {
		this.animals = animals;
	}

	public TrayCollection getTraysHam() {
		return traysHam;
	}

	public void setTraysHam(TrayCollection traysHam) {
		this.traysHam = traysHam;
	}

	public TrayCollection getTraysLeg() {
		return traysLeg;
	}

	public void setTraysLeg(TrayCollection traysLeg) {
		this.traysLeg = traysLeg;
	}

	public PackageCollection getPackages() {
		return packages;
	}

	public void setPackages(PackageCollection packages) {
		this.packages = packages;
	}
	
	
	
}
