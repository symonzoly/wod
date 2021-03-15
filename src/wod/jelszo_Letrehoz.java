package wod;
import java.sql.*;

public class jelszo_Letrehoz extends Adatbazis {

	int rs;
	
	public jelszo_Letrehoz(int azon, String jelsz, String jog) throws ClassNotFoundException, SQLException {
		kapcsolat();
		
		rs=st.executeUpdate("INSERT INTO `user_login` (a_ID, passw, jogosultsag) VALUES ("+azon+", MD5('"+jelsz+"'), '"+jog+"')");
	}
}
