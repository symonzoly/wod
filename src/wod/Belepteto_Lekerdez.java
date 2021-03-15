package wod;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.*;
import java.sql.ResultSet;
import java.sql.*;

import wod.Adatbazis;

public class Belepteto_Lekerdez extends Adatbazis {
	
	public ResultSet rs;
	
	public Belepteto_Lekerdez(int user_ID, String password, String jog) throws ClassNotFoundException, SQLException  {
		
		kapcsolat();
		
        rs = st.executeQuery("SELECT a_ID, passw FROM user_login WHERE a_ID = " +user_ID);
	     

}
}
