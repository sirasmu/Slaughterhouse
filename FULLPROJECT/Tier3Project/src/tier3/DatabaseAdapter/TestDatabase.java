package tier3.DatabaseAdapter;

import common.model.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("deprecation")
		Animal animal1=new Animal(101.5,new Date(2017,12,12));
		Animal animal2=new Animal(102.5,new Date(2017,12,12));
		Animal animal3=new Animal(103.5,new Date(2017,12,12));
		Animal animal4=new Animal(104.5,new Date(2017,12,12));
		Animal animal5=new Animal(105.5,new Date(2017,12,12));
		
		AnimalCollection animalCollection= new AnimalCollection();
		animalCollection.add(animal1);
		animalCollection.add(animal2);
		animalCollection.add(animal3);
		animalCollection.add(animal4);
		animalCollection.add(animal5);
		
		TrayCollection traysHam = new TrayCollection();
		TrayCollection traysLegs = new TrayCollection();
		
	//ADD PARTS FROM AN ANIMAL TO SOME TRAYS
		/////////////////1
		traysHam.getAvailableTray(50, "HAM").addPartFromAnimal(animal1, 50);
		traysLegs.getAvailableTray(10, "LEG").addPartFromAnimal(animal1, 10);
		traysLegs.getAvailableTray(10, "LEG").addPartFromAnimal(animal1, 10);
		traysLegs.getAvailableTray(10, "LEG").addPartFromAnimal(animal1, 10);
		traysLegs.getAvailableTray(10, "LEG").addPartFromAnimal(animal1, 10);
	
		PackageCollection packages1 = new PackageCollection();
		
		AbstractPackage pack1 = new PackageByType(traysLegs,"LEG");
		packages1.add(pack1);
		
		AbstractPackage pack2 = new PackageByType(traysLegs,"LEG");
		packages1.add(pack2);
		
		AbstractPackage pack3 = new PackageByType(traysLegs,"LEG");
		packages1.add(pack3);
		
		/////////////////2
		traysHam.getAvailableTray(50, "HAM").addPartFromAnimal(animal2, 50);
		traysLegs.getAvailableTray(10, "LEG").addPartFromAnimal(animal2, 10);
		traysLegs.getAvailableTray(10, "LEG").addPartFromAnimal(animal2, 10);
		traysLegs.getAvailableTray(10, "LEG").addPartFromAnimal(animal2, 10);
		traysLegs.getAvailableTray(10, "LEG").addPartFromAnimal(animal2, 10);
	
		PackageCollection packages2 = new PackageCollection();
		
		AbstractPackage pack21 = new PackageByType(traysLegs,"LEG");
		packages2.add(pack21);
		
		AbstractPackage pack22 = new PackageByType(traysLegs,"LEG");
		packages2.add(pack22);
		
		AbstractPackage pack23 = new PackageByType(traysLegs,"LEG");
		packages2.add(pack23);
		
		
		
		
		
		IDatabaseAdapter adapter = new DatabaseAdapter();
		
		
		//ADD ANIMALS
		try {
			adapter.saveAnimals(animalCollection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("BROKEN AT ADD animals");
			e.printStackTrace();
		}
		
		//ADD TRAYS
		try {
			adapter.saveTrays(traysHam);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("BROKEN AT ADD traysHam");
			e.printStackTrace();
		}
		
		
		try {
			adapter.saveTrays(traysLegs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("BROKEN AT ADD traysLegs");
			e.printStackTrace();
		}
		
		//ADD PACKAGES
		try {
			adapter.savePackages(packages1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("BROKEN AT ADD packages1");
			e.printStackTrace();
		}
		
		try {
			adapter.savePackages(packages2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("BROKEN AT ADD packages2");
			e.printStackTrace();
		}
		
		
		///RETURN BAD PACKAGES
		
		String id= "770baf9a-c20c-4832-9cb1-7a9385c7b78b";
		ArrayList<String> badPackageCollection=null; 
		
		try {
		badPackageCollection = adapter.getBadPackages(id);
		} catch (SQLException e) {
			System.out.println("BROKEN AT ADD getBadPackage");
			e.printStackTrace();
		}
		catch( Exception e1){
			System.out.println("NO PACKAGES RETRIEVED");
		}
		System.out.println("List of bad packages is:");
		try{
		for(String el: badPackageCollection){
			System.out.println(el);
		}
		}
		catch(Exception e){
			System.out.println("Nothing to show");
		}
	}

}