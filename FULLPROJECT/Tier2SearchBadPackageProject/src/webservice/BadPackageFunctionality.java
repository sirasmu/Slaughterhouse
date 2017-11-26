package webservice;

import java.io.Console;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import tier2.Controller.BadPackageController;

public class BadPackageFunctionality {

	
	public static String getBadPackages(String pk){
		BadPackageController controller = new BadPackageController();
		ArrayList<String> allPackages= controller.getAllBadPackages(pk);
		
		if(allPackages==null)
			return "nothing found";
		
		String ready=""; 
		for(String el: allPackages){
			ready+= el+":";
		}
		ready= ready.substring(0, ready.length()-1);
		return ready;
		
	}
	
}
