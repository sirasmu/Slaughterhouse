package tier3.DatabaseAdapter;
/*
 * Abstract class
 *  
 *  This class handles common functionality for all questions
 *    - getting pre-statistics
 *    - clearing shared pool
 *    - getting post-statistics
 *    - calculating and reporting resource consumption
 *
 * Individual questions inherit from this and
 *  only need to implement the runCase() method, which will 
 *  contain the database code for that particular case
 *
 */

import java.io.FileNotFoundException;
import java.sql.*;

import common.model.AnimalCollection;
import common.model.PackageCollection;
import common.model.TrayCollection;

abstract class QuestionRunner {

	Connection conn;

	final int consistentGets = 0;
	final int hardParses = 1;
	final int totalParses = 2;
	final int sessionCPU = 3;
	final int parseTimeCPU = 4;
	final int parseTimeElapsed = 5;
	final int executeCount = 6;
	final int recursiveCalls = 7;

	public void execute() throws SQLException, FileNotFoundException {
/*
		try {
			int[] before;
			int[] after;
			long startTime = 0;
			long endTime = 0;

			clearSharedPool();

			before = getStats();
			startTime = System.currentTimeMillis();

			runCase();

			endTime = System.currentTimeMillis();
			after = getStats();

			report(before, after, startTime, endTime);
		} catch (SQLException e) {
			throw e;
		}*/
	}

	abstract void runCase() throws SQLException, FileNotFoundException;
    abstract void saveAnimals(AnimalCollection animals)throws SQLException, FileNotFoundException;
    abstract void saveTrays(TrayCollection trays)throws SQLException, FileNotFoundException;
    abstract void savePackages(PackageCollection packages)throws SQLException, FileNotFoundException;
    abstract void saveBadPackages(PackageCollection packages)throws SQLException, FileNotFoundException;
    abstract  PackageCollection getBadPackages(Package p)throws SQLException, FileNotFoundException;
}
