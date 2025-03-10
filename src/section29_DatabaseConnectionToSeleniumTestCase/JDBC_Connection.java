package section29_DatabaseConnectionToSeleniumTestCase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {

	public static void main(String[] args) throws SQLException {

		String dbHost = "localhost";
		String dbPort = "3306";
		String dbName = "world";
		String dbConnectionURL = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName;
		
		Connection con = DriverManager.getConnection(dbConnectionURL, "root", "rootuser");
		
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from country where name='Vietnam'");
		
		while(rs.next()) {
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("Continent"));
			System.out.println(rs.getString("SurfaceArea"));
		}
		
		con.close(); 
	}

}
