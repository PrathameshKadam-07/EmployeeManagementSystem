package model;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
import Bean.EmpBean;
import Service.Dbconnection;

public class EmpDoa {
	public int insertEmp(EmpBean eb) throws ClassNotFoundException, SQLException {
	Connection con = Dbconnection.getConnection();
	PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?)");
	ps.setInt(1, eb.getEno());
	ps.setString(2, eb.getEname());
	ps.setInt(3, eb.getEsal());
	
	int rs = ps.executeUpdate();
	con.close();
	ps.close();
	return rs;
}
	
	public int editEmp(EmpBean eb) throws ClassNotFoundException, SQLException {
		Connection con = Dbconnection.getConnection();
		PreparedStatement ps = con.prepareStatement("update emp set esal = ? where ename = ? AND eid = ?");
		ps.setInt(1, eb.getEsal());
		ps.setString(2, eb.getEname());
		ps.setInt(3, eb.getEno());
		
		int rs = ps.executeUpdate();
		con.close();
		ps.close();
	return rs;
	}
	
	public void searchEmp(EmpBean eb) throws ClassNotFoundException, SQLException {
		Connection con = Dbconnection.getConnection();
		PreparedStatement ps = con.prepareStatement("select eno,ename,esal from emp where eid = ?");
		ps.setInt(1, eb.getEno());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			eb.setSearch(rs.getInt(1) +" " + rs.getString(2)+ " "+ rs.getInt(3));
		}
		else {
			eb.setSearch(null);
		}
	}
	
	public List<EmpBean> viewAll() throws ClassNotFoundException, SQLException {
		List<EmpBean> list = new ArrayList<>();
		
		Connection con = Dbconnection.getConnection();
		PreparedStatement ps = con.prepareStatement("select * from emp");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			EmpBean eb = new EmpBean(rs.getInt(1),rs.getString(2),rs.getInt(3));
			list.add(eb);
		}
		
		return list;
	}
}