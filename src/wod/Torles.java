package wod;

import java.sql.*;

public class Torles extends Adatbazis {
	
	public Torles(int azonosito) throws SQLException, ClassNotFoundException {
		kapcsolat();
		st.execute("DELETE FROM alkalmazottak WHERE a_ID LIKE "+azonosito+"");
	}

}
