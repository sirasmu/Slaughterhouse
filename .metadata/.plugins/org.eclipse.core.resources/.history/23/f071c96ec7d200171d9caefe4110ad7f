package tier2.RMIClient;

import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import common.ISlaughterhouseDataRemote;
import common.model.*;
import common.*;
import tier2.Controller.*;

public class ClientTest
{

	public static void main(String[] args)
	{
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
			//BadPackageController sysController = new BadPackageController(dataRemote);
			
			
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
