package tier3.DatabaseAdapter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tier3.view.View;
import common.model.*;

public class DatabaseAdapter implements IDatabaseAdapter {

	// Connection conn;
	View view;

	public DatabaseAdapter() {
		 this.view= new View();
		// this.conn= DatabaseConnection.requestConnection();
	}

	@Override
	public void saveAnimals(AnimalCollection animals) throws SQLException {

		Connection conn = DatabaseConnection.requestConnection();
		int index = 0;
		ArrayList<Animal> listAnimal = animals.getAnimalCollection();
		for (Animal an : listAnimal) {
			view.printLog("Saving animal with id: " + an.getAnimalId());
			String query = "INSERT INTO Animal (" + " animalId,"
					+ " dateArrived," + " farmId,"
					+ " weight ) VALUES (?, ?, ?, ?)";

			// set all the preparedstatement parameters
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, an.getAnimalId());
			st.setDate(2, an.getDateArrived());
			st.setString(3, an.getFarmID());
			st.setDouble(4, an.getWeight());
			index++;

			// execute the preparedstatement insert
			st.executeUpdate();
			st.close();

		}

		DatabaseConnection.closeConnection();

	}

	public void saveTrays(TrayCollection trays) throws SQLException {
		Connection conn = DatabaseConnection.requestConnection();
			ArrayList<Tray> listTray = trays.getTrayCollection();
			
			
			String query = "INSERT INTO Tray (" + " trayID,"
					+ " typeOfParts ) VALUES ( ?, ?)";
			
			String query2= "INSERT INTO TrayAnimal (" + " trayID,"
					+ " animalID ) VALUES ( ?, ?)";
			
			for (Tray tr : listTray) {
				
				// set all the preparedstatement parameters
				PreparedStatement st = conn.prepareStatement(query);
				PreparedStatement st1 = conn.prepareStatement(query2);
				st.setString(1, tr.getId());
				st.setString(2, tr.getType());
				st.executeUpdate();
				
				for (Animal an: tr.getAnimals().getAnimalCollection()){
					st1.setString(1,  tr.getId());
					st1.setString(2, an.getAnimalId());
					st1.executeUpdate();
					}

				// execute the preparedstatement insert

				st.close();
				st1.close();

			}
			DatabaseConnection.closeConnection();
		}

		@Override
		public void savePackages(PackageCollection packages) throws SQLException {
			Connection conn = DatabaseConnection.requestConnection();
			ArrayList<AbstractPackage> listPackages = packages.getPackageCollection();
			
			String query = "INSERT INTO PRODUCTPACKAGE (" + " productPackageID,"
					+ " productPackageDate," + " productPackageType ) VALUES ( ?, ?, ?)";
			
			String query2= "INSERT INTO TRAYPRODUCTPACKAGE (" + " trayID,"
					+ " productpackageId ) VALUES ( ?, ?)";
			
			for (AbstractPackage pack : listPackages) {

				
				// set all the preparedstatement parameters
				PreparedStatement st = conn.prepareStatement(query);
				PreparedStatement st1 = conn.prepareStatement(query2);
				
				st.setString(1, pack.getId());
				st.setDate(2, pack.getProductPackageDate());
				st.setString(3, pack.getType());
				st.executeUpdate();
				
				for (Tray tr: pack.getTrays().getTrayCollection()){
					st1.setString(1, tr.getId());
					st1.setString(2, pack.getId());
					st1.executeUpdate();
					}
				

				// execute the preparedstatement insert
				
				st.close();
	            st1.close();
			}
			DatabaseConnection.closeConnection();
		}



public ArrayList<String> getBadPackages(String stringPackageId) throws SQLException{
		
		Connection conn= DatabaseConnection.requestConnection();

			String query = "select tp.productpackageID,tp.TRAYID,ta.AnimalID"
					+" from  TRAYANIMAL ta"
					+" inner join TRAYPRODUCTPACKAGE tp"
					+" on ta.TRAYID=tp.TRAYID"
					+" where tp.PRODUCTPACKAGEID= ?"
					+" order by tp.PRODUCTPACKAGEID";
			
			String query2 = "select ta.AnimalID,tp.TRAYID,tp.productpackageID"
					+" from  TRAYANIMAL ta"
					+" inner join TRAYPRODUCTPACKAGE tp"
                    +" on ta.TRAYID=tp.TRAYID"
                    +" where ta.ANIMALID= ? "
                    +" order by tp.PRODUCTPACKAGEID";

			// set all the preparedstatement parameters
			PreparedStatement st = conn.prepareStatement(query);
			PreparedStatement st1 = conn.prepareStatement(query2);
			st.setString(1, stringPackageId);
			
			
			ResultSet animalIdSet= st.executeQuery();
			ResultSet badPackageSetRez=null; 
			
		 while(animalIdSet.next()){
			    st1.setString(1, animalIdSet.getString("AnimalID"));
			    badPackageSetRez = st1.executeQuery();
		 }

		 ArrayList<String> allBadPackageId = new ArrayList<String>();
		 //execute any caption from the result set 
		 try{
		 while (badPackageSetRez.next()){
			 allBadPackageId.add(badPackageSetRez.getString("PRODUCTPACKAGEID"));
		 }
		 }
		 catch(Exception e){
			 view.printLog("Error fetching data. Data not found."); 
		 }
		 
		 view.printLog("Get bad packages QUERY RESULT: "+allBadPackageId);
		 
		 ///closing all elements
		 	animalIdSet.close();
		 	badPackageSetRez.close();
			st.close();
			st1.close();
			return allBadPackageId;	
	}

}
