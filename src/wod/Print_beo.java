package wod;

import java.util.Vector;
import java.awt.Color;
import java.awt.Component;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;

import wod.Adatbazis;

public class Print_beo extends Adatbazis {
	//1
	ResultSet rs0;
	public JTable tabla0;
	Vector oszlopnevek0 = new Vector();
	ResultSetMetaData rsdata0;
	int oszlopszam0;
	Vector sorok0;
	Vector sor0;

	//2
	ResultSet rs1;
	public JTable tabla1;
	Vector oszlopnevek1 = new Vector();
	ResultSetMetaData rsdata1;
	int oszlopszam1;
	Vector sorok1;
	Vector sor1;
	
	//3
	ResultSet rs2;
	public JTable tabla2;
	Vector oszlopnevek2 = new Vector();
	ResultSetMetaData rsdata2;
	int oszlopszam2;
	Vector sorok2;
	Vector sor2;
	
	//4
	ResultSet rs3;
	public JTable tabla3;
	Vector oszlopnevek3 = new Vector();
	ResultSetMetaData rsdata3;
	int oszlopszam3;
	Vector sorok3;
	Vector sor3;
	
	//5
	ResultSet rs4;
	public JTable tabla4;
	Vector oszlopnevek4 = new Vector();
	ResultSetMetaData rsdata4;
	int oszlopszam4;
	Vector sorok4;
	Vector sor4;
	
	
	
	
	public Print_beo(int azon) throws ClassNotFoundException, SQLException {
		
		kapcsolat();
		
//1 eleje
		rs0=st.executeQuery("SELECT d1,d2,d3,d4,d5,d6,d7 FROM beosztas "
				+ "JOIN alkalmazottak ON beosztas.a_ID LIKE alkalmazottak.a_ID WHERE alkalmazottak.a_ID LIKE "+azon+"");
		
		rsdata0 = rs0.getMetaData();
		oszlopszam0=rsdata0.getColumnCount();
		
		for(int i=0;i<oszlopszam0;i++) {
			oszlopnevek0.addElement(rsdata0.getColumnName(i+1));
		}
		
		sorok0=new Vector();
		
		while(rs0.next()) {
			
			sor0=new Vector();
		
			for(int i=0;i<oszlopszam0;i++) {
				sor0.addElement(rs0.getObject(i+1));
			}
			sorok0.addElement(sor0);
		}
		
		tabla0=new JTable(sorok0,oszlopnevek0);
		
		tabla0.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabla0.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabla0.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabla0.getColumnModel().getColumn(3).setPreferredWidth(200);
		tabla0.getColumnModel().getColumn(4).setPreferredWidth(200);
		tabla0.getColumnModel().getColumn(5).setPreferredWidth(200);
		tabla0.getColumnModel().getColumn(6).setPreferredWidth(200);
// 1vége
		
		
//2 eleje
		rs1=st.executeQuery("SELECT d8,d9,d10,d11,d12,d13,d14 FROM beosztas "
				+ "JOIN alkalmazottak ON beosztas.a_ID LIKE alkalmazottak.a_ID WHERE alkalmazottak.a_ID LIKE "+azon+"");
		
		rsdata1 = rs1.getMetaData();
		oszlopszam1=rsdata1.getColumnCount();
		
		for(int i=0;i<oszlopszam1;i++) {
			oszlopnevek1.addElement(rsdata1.getColumnName(i+1));
		}
		
		sorok1=new Vector();
		
		while(rs1.next()) {
			
			sor1=new Vector();
		
			for(int i=0;i<oszlopszam1;i++) {
				sor1.addElement(rs1.getObject(i+1));
			}
			sorok1.addElement(sor1);
		}
		
		tabla1=new JTable(sorok1,oszlopnevek1);
		
		tabla1.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabla1.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabla1.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabla1.getColumnModel().getColumn(3).setPreferredWidth(200);
		tabla1.getColumnModel().getColumn(4).setPreferredWidth(200);
		tabla1.getColumnModel().getColumn(5).setPreferredWidth(200);
		tabla1.getColumnModel().getColumn(6).setPreferredWidth(200);
//2 vége

//3 eleje
		rs2=st.executeQuery("SELECT d15,d16,d17,d18,d19,d20,d21 FROM beosztas "
				+ "JOIN alkalmazottak ON beosztas.a_ID LIKE alkalmazottak.a_ID WHERE alkalmazottak.a_ID LIKE "+azon+"");
		
		rsdata2 = rs2.getMetaData();
		oszlopszam2=rsdata2.getColumnCount();
		
		for(int i=0;i<oszlopszam2;i++) {
			oszlopnevek2.addElement(rsdata2.getColumnName(i+1));
		}
		
		sorok2=new Vector();
		
		while(rs2.next()) {
			
			sor2=new Vector();
		
			for(int i=0;i<oszlopszam2;i++) {
				sor2.addElement(rs2.getObject(i+1));
			}
			sorok2.addElement(sor2);
		}
		
		tabla2=new JTable(sorok2,oszlopnevek2);
		
		tabla2.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabla2.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabla2.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabla2.getColumnModel().getColumn(3).setPreferredWidth(200);
		tabla2.getColumnModel().getColumn(4).setPreferredWidth(200);
		tabla2.getColumnModel().getColumn(5).setPreferredWidth(200);
		tabla2.getColumnModel().getColumn(6).setPreferredWidth(200);
		
//3 vége	
		
//4 eleje
		rs3=st.executeQuery("SELECT d22,d23,d24,d25,d26,d27,d28 FROM beosztas "
				+ "JOIN alkalmazottak ON beosztas.a_ID LIKE alkalmazottak.a_ID WHERE alkalmazottak.a_ID LIKE "+azon+"");
		
		rsdata3 = rs3.getMetaData();
		oszlopszam3=rsdata3.getColumnCount();
		
		for(int i=0;i<oszlopszam3;i++) {
			oszlopnevek3.addElement(rsdata3.getColumnName(i+1));
		}
		
		sorok3=new Vector();
		
		while(rs3.next()) {
			
			sor3=new Vector();
		
			for(int i=0;i<oszlopszam3;i++) {
				sor3.addElement(rs3.getObject(i+1));
			}
			sorok3.addElement(sor3);
		}
		
		tabla3=new JTable(sorok3,oszlopnevek3);
		
		tabla3.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabla3.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabla3.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabla3.getColumnModel().getColumn(3).setPreferredWidth(200);
		tabla3.getColumnModel().getColumn(4).setPreferredWidth(200);
		tabla3.getColumnModel().getColumn(5).setPreferredWidth(200);
		tabla3.getColumnModel().getColumn(6).setPreferredWidth(200);
		
//4 vége
		
		
//5 eleje
		rs4=st.executeQuery("SELECT d29,d30,d31 FROM beosztas "
				+ "JOIN alkalmazottak ON beosztas.a_ID LIKE alkalmazottak.a_ID WHERE alkalmazottak.a_ID LIKE "+azon+"");
		
		rsdata4 = rs4.getMetaData();
		oszlopszam4=rsdata4.getColumnCount();
		
		for(int i=0;i<oszlopszam4;i++) {
			oszlopnevek4.addElement(rsdata4.getColumnName(i+1));
		}
		
		sorok4=new Vector();
		
		while(rs4.next()) {
			
			sor4=new Vector();
		
			for(int i=0;i<oszlopszam4;i++) {
				sor4.addElement(rs4.getObject(i+1));
			}
			sorok4.addElement(sor4);
		}
		
		tabla4=new JTable(sorok4,oszlopnevek4);		

		tabla4.getColumnModel().getColumn(0).setPreferredWidth(200);
		tabla4.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabla4.getColumnModel().getColumn(2).setPreferredWidth(200);
		
//5 vége		
		
		
		tabla0.setRowHeight(50);
		tabla0.setBackground(new Color(90, 90, 90));
		tabla0.setForeground(Color.WHITE);
		tabla0.setFont(new Font("Arial", Font.BOLD, 14));
		
		tabla1.setRowHeight(50);
		tabla1.setBackground(new Color(51, 51, 51));
		tabla1.setForeground(Color.WHITE);
		tabla1.setFont(new Font("Arial", Font.BOLD, 14));
		
		tabla2.setRowHeight(50);
		tabla2.setBackground(new Color(90, 90, 90));
		tabla2.setForeground(Color.WHITE);
		tabla2.setFont(new Font("Arial", Font.BOLD, 14));
		
		tabla3.setRowHeight(50);
		tabla3.setBackground(new Color(51, 51, 51));
		tabla3.setForeground(Color.WHITE);
		tabla3.setFont(new Font("Arial", Font.BOLD, 14));
		
		tabla4.setRowHeight(50);
		tabla4.setBackground(new Color(90, 90, 90));
		tabla4.setForeground(Color.WHITE);
		tabla4.setFont(new Font("Arial", Font.BOLD, 14));
		
	
		
	}
	

}
