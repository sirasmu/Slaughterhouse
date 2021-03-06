package tier2.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import common.ISlaughterhouseDataRemote;
import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;
import tier2.adaptors.MyFileIO;

public class ModelAdministratorController {
	MyFileIO fileSys;

	public ModelAdministratorController() {
		fileSys = new MyFileIO();
	}

	/*
	 * METHOD retrieves local data in case the system crashes before writing to
	 * the server
	 */
	@SuppressWarnings("unchecked")
	public void fetchDataFromLocalStorage(
			RegisterSystemController controller) throws FileNotFoundException,
			ClassNotFoundException, IOException {
		HashMap<String, Object> allCollections = null;

		allCollections = (HashMap<String, Object>) fileSys
				.readObjectFromFile("tempTier2Data.bin");

		if (allCollections != null) {
			controller.setAnimals((AnimalCollection) allCollections
					.get("AnimalCollection"));
			controller.setTraysHam((TrayCollection) allCollections
					.get("TrayCollectionHam"));
			controller.setTraysLeg((TrayCollection) allCollections
					.get("TrayCollectionLeg"));
			controller.setPackages((PackageCollection) allCollections
					.get("PackageCollection"));
		}
	}

	/*
	 * Saves all temp data to local storage for backup reasons
	 */
	public void saveAlltoLocalStorage(HashMap<String, Object> allCollections) {
		try {
			fileSys.writeToFile("tempTier2Data.bin", allCollections);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	/*
	 * METHOD to fetch all available data on T3Server Database Should be
	 * triggered by system administrator if needed
	 */
	public void fetchAllFromT3Server(ISlaughterhouseDataRemote dataRemote) {

	}
	
	
	
	/*
	 * METHOD to save all available data on T3Server Database
	 */
	public void saveAllToT3Server(ISlaughterhouseDataRemote dataRemote) {

	}


}
