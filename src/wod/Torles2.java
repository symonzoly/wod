package wod;

import java.sql.*;

public class Torles2 extends Adatbazis {
	
	public Torles2(int azonosito) throws SQLException, ClassNotFoundException {
		kapcsolat();
		st.execute("DELETE FROM beosztas WHERE a_ID LIKE "+azonosito+"");
	}

}
