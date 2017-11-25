package tier3.DatabaseAdapter;

import java.sql.SQLException;
import java.util.ArrayList;

import common.model.*;

/**
 * This is the adapter for storing persistent data
 * @author SIR
 * 
 */
public interface IDatabaseAdapter
{
	void saveAnimals(AnimalCollection animals) throws SQLException;
	void saveTrays(TrayCollection trays) throws SQLException;
	void savePackages(PackageCollection packages) throws SQLException;
	ArrayList<String> getBadPackages(String p) throws SQLException;
}
