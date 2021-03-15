package wod;

import java.sql.*;

public class Beosztas extends Adatbazis {
	int rs;
	
	public Beosztas(int azon, 
			String n1, String n2,String n3,String n4,String n5,
			String n6, String n7,String n8,String n9,String n10,
			String n11, String n12,String n13,String n14,String n15,
			String n16, String n17,String n18,String n19,String n20,
			String n21, String n22,String n23,String n24,String n25,
			String n26, String n27,String n28,String n29,String n30, String n31
			) throws ClassNotFoundException, SQLException {
		kapcsolat();
		
		rs=st.executeUpdate("INSERT INTO beosztas (a_ID, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18, d19, d20, d21, d22, d23, d24, d25, d26, d27, d28, d29, d30, d31) VALUES ("+azon+", '"+n1+"', '"+n2+"', '"+n3+"', '"+n4+"',  '"+n5+"', '"+n6+"', '"+n7+"', '"+n8+"', '"+n9+"',  '"+n10+"', '"+n11+"', '"+n12+"', '"+n13+"', '"+n14+"',  '"+n15+"', '"+n16+"', '"+n17+"', '"+n18+"', '"+n19+"',  '"+n20+"', '"+n21+"', '"+n22+"', '"+n23+"', '"+n24+"',  '"+n25+"', '"+n26+"', '"+n27+"', '"+n28+"', '"+n29+"',  '"+n30+"', '"+n31+"')");
		
	}

}
