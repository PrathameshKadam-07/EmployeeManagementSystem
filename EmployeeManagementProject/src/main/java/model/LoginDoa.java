package model;
import java.sql.*;
import Bean.LoginBean;
import Service.Dbconnection;

public class LoginDoa {
	
public String authentication(LoginBean lb) throws ClassNotFoundException, SQLException{
	Connection con = Dbconnection.getConnection();
	PreparedStatement ps = con.prepareStatement("select username from emptb where Username =? AND Password =?");
	ps.setString(1, lb.getUname());
	ps.setString(2, lb.getUpwd());
	ResultSet rs = ps.executeQuery();
	  
if(rs.next()) {
	return "success";
}
return "Invalid login";
}
}
