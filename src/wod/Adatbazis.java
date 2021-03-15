package wod;

import java.sql.*;

public class Adatbazis {
	
	protected Statement st;
	
	public void kapcsolat() throws ClassNotFoundException, SQLException{
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/wod", "root", "");
		
		if (con==null) {
			System.out.println("Nincs kapcsolat!");
		} else {
			System.out.println("Van kapcsolat!");
		}
		st=con.createStatement();
		
	}

}
