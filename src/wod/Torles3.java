package wod;

import java.sql.*;

public class Torles3 extends Adatbazis {

	public Torles3(int azonosito) throws SQLException, ClassNotFoundException {
		kapcsolat();
		st.execute("DELETE FROM user_login WHERE a_ID LIKE "+azonosito+"");
	}
	
}
