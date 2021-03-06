package tier2.Controller;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

import common.ISlaughterhouseDataRemote;
import common.model.*;
import tier2.view.View;


public class BadPackageController {

	private View view;	
	
	/*
	 * Constructor without connection to the tier 3 
	 */
	public BadPackageController(){
		this.view = new View();
	}

	
	public ArrayList<String> getAllBadPackages(String id){
		try {
			
			//ESTABLISH CONNECTION WITH TIER 3 AND EXECUTE
			String tier3URL= "rmi://192.168.255.1/tier3";
			ISlaughterhouseDataRemote dataRemote = (ISlaughterhouseDataRemote) Naming.lookup( tier3URL );	
	
			ArrayList<String> temp= dataRemote.getBadPackages(id);
			view.printLog(temp.toString());
			
			return temp;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
