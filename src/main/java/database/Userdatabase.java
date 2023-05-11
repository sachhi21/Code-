package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.SQLException;

import user.Userlogin;

public class Userdatabase {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/userdb";
	private String dbUname = "root";
	private String dbPassword = "0000";
	private String dbDriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
    public Connection getConnection() {
    	
    	Connection con = null ;
	     try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (java.sql.SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return con;
    }
	
	public boolean validate(Userlogin userlogin) {
		loadDriver(dbDriver);
		Connection con=getConnection();
		boolean status= false;
		
		String sql = "select * from user where username = ? and password = ? ";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userlogin.getUsername());
			ps.setString(2, userlogin.getPassword());
			
			ResultSet rs= ps.executeQuery();
			status = rs.next();
		} catch (java.sql.SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
		
	}

}
