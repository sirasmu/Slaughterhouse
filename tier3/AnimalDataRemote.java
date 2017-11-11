package tier3;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import common.IAnimalDataRemote;

public class AnimalDataRemote implements IAnimalDataRemote{
	
	Connection conn;

	@Override
	public void saveAnimal() throws SQLException {
		Statement stmt = conn.createStatement();
		stmt.execute("alter system flush shared_pool");
		stmt.close();
		
		//INSERT INTO table_name (column1, column2, column3, ...)
		//VALUES (value1, value2, value3, ...);
	}
}
