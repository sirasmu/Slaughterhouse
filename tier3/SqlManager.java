package tier3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlManager {
	
	Connection conn;
	
	public SqlManager(Connection conn)
	{
		this.conn = conn;
	}
	//INSERT INTO table_name (column1, column2, column3, ...)
	//VALUES (value1, value2, value3, ...);
	
	//STEP 4: Execute a query

	public void query(String specificsql) throws SQLException {
		Statement stmt = conn.createStatement();
		sql = "INSERT INTO Registration " +"VALUES (100, 'Zara', 'Ali', 18)";
		stmt.executeUpdate(sql);
		stmt.close();	      
	    System.out.println("Inserted records into the table...");
	}
	
//	Create table animal(
//		    AnimalID numeric not null,
//		    DateArrived Date,
//		    FarmId numeric not null,
//		    Weight number(4,1),
//		    PRIMARY KEY (AnimalID)
//		     );
	public void insertIntoAnimal(String animalId, String dateArrived, String farmId, String weight)
	{
		String sql = "INSERT INTO Animal " +"VALUES (" + animalId +"," + dateArrived + "," + farmId + "," + weight + ")";
		try {
			query(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
