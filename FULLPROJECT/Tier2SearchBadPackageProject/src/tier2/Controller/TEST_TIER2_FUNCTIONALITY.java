package tier2.Controller;

import java.rmi.Naming;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import common.Config;
import common.ISlaughterhouseDataRemote;
import common.model.*;

public class TEST_TIER2_FUNCTIONALITY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			//Contact address Server
			String tier3IP = JOptionPane.showInputDialog( null, "Tier 3 IP" ); //This gives local host IP I think???? I forgot
			String tier3URL = "rmi://" + tier3IP + "/" + Config.TIER_3_SERVICE;
			
			ISlaughterhouseDataRemote dataRemote = (ISlaughterhouseDataRemote) Naming.lookup( tier3URL );	
						
			//AnimalCollection myAnimals = new AnimalCollection();			
			//myAnimals.add(new Animal(10.0));
			
			//dataRemote.saveAnimals(myAnimals);
			
			//START CONTROLLER
			
			ArrayList<String> list= dataRemote.getBadPackages("770baf9a-c20c-4832-9cb1-7a9385c7b78b");
			
			System.out.println("List of bad packages is:");
			try{
			for(String el: list){
				System.out.println(el);
			}
			}
			catch(Exception e){
				System.out.println("Nothing to show");
			}
			
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		

		
}
}
