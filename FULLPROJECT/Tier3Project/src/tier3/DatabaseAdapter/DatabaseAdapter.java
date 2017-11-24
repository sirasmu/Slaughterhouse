package tier3.DatabaseAdapter;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
		for (Tray tr : listTray) {

			String query = "INSERT INTO Tray (" + " trayID,"
					+ " typeOfParts ) VALUES ( ?, ?)";

			// set all the preparedstatement parameters
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, tr.getId());
			st.setString(2, tr.getType());
			

			// execute the preparedstatement insert
			st.executeUpdate();
			st.close();

		}
		DatabaseConnection.closeConnection();
	}

	@Override
	public void savePackages(PackageCollection packages) throws SQLException {
		Connection conn = DatabaseConnection.requestConnection();
		ArrayList<AbstractPackage> listPackages = packages.getPackageCollection();
		for (AbstractPackage pack : listPackages) {

			String query = "INSERT INTO AbstractPackage (" + " productPackageID,"
					+ " productPackageDate," + " productPackageType ) VALUES ( ?, ?, ?)";

			// set all the preparedstatement parameters
			PreparedStatement st = conn.prepareStatement(query);
			st.setString(1, pack.getId());
			st.setDate(2, pack.getProductPackageDate());
			st.setString(3, pack.getType());
			
			

			// execute the preparedstatement insert
			st.executeUpdate();
			st.close();

		}
		DatabaseConnection.closeConnection();
	}

	@Override
	public void saveBadPackages(PackageCollection packages) {
		// TODO Auto-generated method stub

	}

	@Override
	public PackageCollection getBadPackages(Package p) {
		// TODO Auto-generated method stub
		return null;
	}

}
