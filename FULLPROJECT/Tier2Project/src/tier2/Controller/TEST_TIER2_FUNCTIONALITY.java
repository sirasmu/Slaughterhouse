package tier2.Controller;

import java.util.ArrayList;

import common.model.*;

public class TEST_TIER2_FUNCTIONALITY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RegisterSystemController sysController = new RegisterSystemController();
		
		//PIGS
		Animal pig1 = new Animal(80.5);
		Animal pig2 = new Animal(90);
		Animal pig3 = new Animal(100.2);
		Animal pig4 = new Animal(110);
		Animal pig5 = new Animal(115.2);
		Animal pig6 = new Animal(120);
		
		ArrayList<Double> pig1Parts = new ArrayList<Double>();
		pig1Parts.add(40.3);
		pig1Parts.add(2.3);
		pig1Parts.add(2.4);
		pig1Parts.add(1.8);
		pig1Parts.add(1.7);
		
		
		//SPLIT PIGS
		System.out.println("SPLIT PIGS PROCEDURE");
		sysController.registerAnimal(pig1);
		sysController.splitAnimal(pig1, pig1Parts);
		
		ArrayList<Animal> listAnimal = sysController.getAnimals().getAnimalCollection();
		System.out.println("Animal id: "+listAnimal.get(0).getAnimalId()+
				"\nAnimal weight: "+listAnimal.get(0).getWeight());
		
		//SHOW HAM TRAY
		System.out.println("SHOW Ham TRAY PROCEDURE");
		TrayCollection allHamTrays = sysController.getTraysHam();
		ArrayList<Tray> tempHamTrays = allHamTrays.getTrayCollection();
		int count1 = 1;
		for (Tray tr : tempHamTrays) {
			System.out.println("Tray " + count1 + " id:" + tr.getId());
			System.out.print("Tray " + count1 + " animals: ");
			for (Animal an : tr.getAnimals().getAnimalCollection()) {
				System.out.print(an.getAnimalId() + " | ");
			}
			System.out.println();
		}
		
		// SHOW HAM TRAY
		System.out.println("SHOW Leg TRAY PROCEDURE");
		TrayCollection allLegTrays = sysController.getTraysLeg();
		ArrayList<Tray> tempLegTrays = allLegTrays.getTrayCollection();
		int count2 = 1;
		for (Tray tr : tempLegTrays) {
			System.out.println("Tray " + count2 + " id:" + tr.getId());
			System.out.print("Tray " + count2 + " animals: ");
			for (Animal an : tr.getAnimals().getAnimalCollection()) {
				System.out.print(an.getAnimalId() + " | ");
			}
		}
		System.out.println();
		
		
		//LOAD FROM FILE
		sysController.setAnimals(null);
		sysController.setPackages(null);
		sysController.setTraysHam(null);
		sysController.setTraysLeg(null);
		
		sysController.recoverFromFile();
		
		// SHOW HAM TRAY
				System.out.println("SHOW Leg TRAY PROCEDURE FROM FILE");
				TrayCollection allLegTrays1 = sysController.getTraysLeg();
				ArrayList<Tray> tempLegTrays1 = allLegTrays.getTrayCollection();
				int count3 = 1;
				for (Tray tr : tempLegTrays1) {
					System.out.println("Tray " + count3 + " id:" + tr.getId());
					System.out.print("Tray " + count3 + " animals: ");
					for (Animal an : tr.getAnimals().getAnimalCollection()) {
						System.out.print(an.getAnimalId() + " | ");
					}
				} 
				System.out.println();
	}

}
