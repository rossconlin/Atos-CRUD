package qa.com.garage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDqueries {

	
	
	private Connection conn;
	private Statement stmt;
	///OPEN CONNECTION TO MYSQL
	public CRUDqueries() {
		try {
			conn = DriverManager.getConnection(DBconfig.URL, DBconfig.USER, DBconfig.PASS);
			this.stmt = conn.createStatement();
			System.out.println("Connection Succesfull");
		}catch(SQLException e) {
			System.out.println("Incorrect Credintials");
			e.printStackTrace();
			
		}
	}
	
	//CLOSE CONNECTION TO MYSQL
	public void CloseConn() {
		try {
			conn.close();
			System.out.println("Connection Closed");
		}catch(SQLException e) {
			System.out.println("Closing Connection...");
			e.printStackTrace();
		}
	}
}
