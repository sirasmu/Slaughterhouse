package test;

import java.net.InetAddress;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;

import common.ISlaughterhouseDataRemote;
import tier3.DataController;
import tier3.SlaughterhouseDataRemote;

public class ServerTest
{
	public static void main(String[] args)
	{
		try
		{
			LocateRegistry.createRegistry(1099);

			ISlaughterhouseDataRemote remote = new SlaughterhouseDataRemote();

			Naming.rebind(Config.TIER_3_SERVICE, remote);

			System.out.println("Tier 3 server listening on " + InetAddress.getLocalHost().getHostAddress());
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
