package tier3.DatabaseAdapter;


/*   Main class. Handles creation and disposal of a connection to Oracle */
/*   The individual case to be run is instantiated and passed the        */
/*   connection                                                          */

import java.io.FileNotFoundException;
import java.sql.*;
import java.util.GregorianCalendar;

import common.model.Animal;
import common.model.AnimalCollection;
import common.model.PartType;
import common.model.Tray;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;


public class DatabaseConnection {

	private static Connection conn;

	/* connection details */
	/* connects via TNS */

	final static String connectString = "jdbc:oracle:thin:@localhost:1521:assignment";
	final static String userName = "sdj3";
	final static String password = "sdj3";

	/*
	 * BUILDS A DATABASE CONNECTION TO AN ORACLE DATABASE
	 */
	
	public static Connection requestConnection(){
		
		//generated data
//		@SuppressWarnings("deprecation")
//		Animal animal1=new Animal(101.5,new Date(12,12,2017));
//		Animal animal2=new Animal(102.5,new Date(13,12,2017));
//		Animal animal3=new Animal(103.5,new Date(14,12,2017));
//		Animal animal4=new Animal(104.5,new Date(15,12,2017));
//		Animal animal5=new Animal(105.5,new Date(16,12,2017));
//		
//		AnimalCollection animalCollection= new AnimalCollection();
//		animalCollection.add(animal1);
//		animalCollection.add(animal2);
//		animalCollection.add(animal3);
//		animalCollection.add(animal4);
//		animalCollection.add(animal5);
	

		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			conn = DriverManager.getConnection(connectString, userName, password);
			conn.setAutoCommit(false);
			System.out.println("connection established, autocommit off");


		} catch (SQLException e) {
			System.out.println("error establishing connection");
			System.out.println("Connection string in use: "+connectString + "(user/pwd " + userName + "/" + password + ")" );
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

		return conn;
		
	}
	
	
	public static void closeConnection(){
		try {
			conn.close();
			System.out.println("connection closed");
		

		} catch (SQLException e) {
			System.out.println("error closing connection");
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.exit(0);

		}
	}
	
	
}
