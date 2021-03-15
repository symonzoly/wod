 package wod;

import java.sql.*;

public class Ujbelepo extends Adatbazis {
	
	public Ujbelepo(/*int id,*/ String veznev, String kernev, String varos, String utca, String hazszam, String taj, 
			String szigszam, String ado, String telszam)throws ClassNotFoundException, SQLException {
		
		kapcsolat();
		
		st.executeUpdate("INSERT INTO alkalmazottak(veznev, kernev, varos, utca, hazszam, taj, szigszam, ado, telszam)"
				+ " VALUES('"+veznev+"', '"+kernev+"', '"+varos+"', '"+utca+"', '"+hazszam+"',"
						+ " '"+taj+"', '"+szigszam+"', '"+ado+"', '"+telszam+"')");
	}
	

}
