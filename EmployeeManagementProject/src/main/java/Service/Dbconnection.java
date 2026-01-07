package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
public static Connection getConnection() throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oracle","Username","Username");
	  return con; 
}
}
