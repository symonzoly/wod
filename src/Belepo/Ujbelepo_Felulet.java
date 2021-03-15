package Belepo;

import java.awt.*;

import javax.swing.border.EmptyBorder;

//import org.omg.CORBA.PUBLIC_MEMBER;

//import com.sun.glass.events.WindowEvent;

import Beo.Beosztas_Felulet;
import Beo_Print.Beo_Print_Felulet;
//import sun.invoke.empty.Empty;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.sql.*;
import java.sql.Date;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

import java.awt.event.ActionEvent;

import wod.Keret;
import wod.Ujbelepo;

public class Ujbelepo_Felulet extends JFrame {
	
	static Ujbelepo_Felulet frame = new Ujbelepo_Felulet();

	 JPanel contentPane;
	 JTextField text_ID; //új belépõ 
	 JTextField text_Veznev; //új belépõ 
	 JTextField text_Kernev; //új belépõ 
	 JTextField text_Varos; //új belépõ 
	 JTextField text_Utca; //új belépõ 
	 JTextField text_Hazszam; //új belépõ 
	 JTextField text_Taj; //új belépõ 
	 JTextField text_Szigszam; //új belépõ 
	 JTextField text_Adoszam; //új belépõ 
	 JTextField text_Telefon; //új belépõ 
	 //JLabel label_visszajelzes;  //új belépõ 
	 JOptionPane ujbelepo_Uzenet;  //új belépõ 
	 
	 Panel Orange_Panel = new Panel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Ujbelepo_Felulet();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ujbelepo_Felulet() {
		setResizable(false);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Keret.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 817, 523);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Orange_Panel = new Panel();
		Orange_Panel.setBackground(new Color(255, 102, 0));
		contentPane.add(Orange_Panel);
		Orange_Panel.setBounds(0, 0, 811, 71);
		Orange_Panel.setLayout(null);
		
		Label lbl_WOD = new Label("Workers Office Desk");
		lbl_WOD.setForeground(UIManager.getColor("Button.background"));
		lbl_WOD.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		Orange_Panel.add(lbl_WOD);
		lbl_WOD.setBounds(10, 10, 800, 51);
		
		Label lbl_ID = new Label("Azonosító");
		lbl_ID.setFont(new Font("Dialog", Font.BOLD, 12));
		lbl_ID.setForeground(Color.WHITE);
		contentPane.add(lbl_ID);
		lbl_ID.setBounds(10, 117, 70, 24);
		
		text_ID = new JTextField();
		text_ID.setText("Automatikus");
		text_ID.setEditable(false);
		contentPane.add(text_ID);
		text_ID.setBounds(123, 119, 141, 22);
		text_ID.setColumns(10);
		
		Label lbl_Veznev = new Label("Vezet\u00E9kn\u00E9v");
		lbl_Veznev.setForeground(Color.WHITE);
		lbl_Veznev.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lbl_Veznev);
		lbl_Veznev.setBounds(10, 152, 70, 24);
		
		text_Veznev = new JTextField();
		text_Veznev.setColumns(10);
		contentPane.add(text_Veznev);
		text_Veznev.setBounds(123, 154, 141, 22);
		
		Label lbl_Kernev = new Label("Keresztn\u00E9v");
		lbl_Kernev.setForeground(Color.WHITE);
		lbl_Kernev.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lbl_Kernev);
		lbl_Kernev.setBounds(10, 189, 70, 24);
		
		text_Kernev = new JTextField();
		text_Kernev.setColumns(10);
		contentPane.add(text_Kernev);
		text_Kernev.setBounds(123, 189, 141, 22);
		
		Label lbl_Varos = new Label("V\u00E1ros");
		lbl_Varos.setForeground(Color.WHITE);
		lbl_Varos.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lbl_Varos);
		lbl_Varos.setBounds(10, 222, 70, 24);
		
		text_Varos = new JTextField();
		text_Varos.setColumns(10);
		contentPane.add(text_Varos);
		text_Varos.setBounds(123, 224, 141, 22);
		
		Label lbl_Utca = new Label("Utca");
		lbl_Utca.setForeground(Color.WHITE);
		lbl_Utca.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lbl_Utca);
		lbl_Utca.setBounds(10, 259, 70, 24);
		
		text_Utca = new JTextField();
		text_Utca.setColumns(10);
		contentPane.add(text_Utca);
		text_Utca.setBounds(123, 259, 141, 22);
		
		Label lbl_Hazszam = new Label("H\u00E1zsz\u00E1m");
		lbl_Hazszam.setForeground(Color.WHITE);
		lbl_Hazszam.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lbl_Hazszam);
		lbl_Hazszam.setBounds(349, 117, 70, 24);
		
		text_Hazszam = new JTextField();
		text_Hazszam.setColumns(10);
		contentPane.add(text_Hazszam);
		text_Hazszam.setBounds(462, 119, 141, 22);
		
		Label lbl_Tajsz = new Label("Tajsz\u00E1m");
		lbl_Tajsz.setForeground(Color.WHITE);
		lbl_Tajsz.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lbl_Tajsz);
		lbl_Tajsz.setBounds(349, 152, 70, 24);
		
		text_Taj = new JTextField();
		text_Taj.setColumns(10);
		contentPane.add(text_Taj);
		text_Taj.setBounds(462, 154, 141, 22);
		
		Label lbl_Szigsz = new Label("Szig.sz\u00E1m");
		lbl_Szigsz.setForeground(Color.WHITE);
		lbl_Szigsz.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lbl_Szigsz);
		lbl_Szigsz.setBounds(349, 189, 70, 24);
		
		text_Szigszam = new JTextField();
		text_Szigszam.setColumns(10);
		contentPane.add(text_Szigszam);
		text_Szigszam.setBounds(462, 189, 141, 22);
		
		Label lbl_Adoszam = new Label("Ad\u00F3sz\u00E1m");
		lbl_Adoszam.setForeground(Color.WHITE);
		lbl_Adoszam.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lbl_Adoszam);
		lbl_Adoszam.setBounds(349, 222, 70, 24);
		
		text_Adoszam = new JTextField();
		text_Adoszam.setColumns(10);
		contentPane.add(text_Adoszam);
		text_Adoszam.setBounds(462, 224, 141, 22);
		
		Label lbl_Tel = new Label("Telefon");
		lbl_Tel.setForeground(Color.WHITE);
		lbl_Tel.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lbl_Tel);
		lbl_Tel.setBounds(349, 259, 70, 24);
		
		text_Telefon = new JTextField();
		text_Telefon.setColumns(10);
		contentPane.add(text_Telefon);
		text_Telefon.setBounds(462, 259, 141, 22);
		
		JButton btnHozzad = new JButton("Hozz\u00E1ad");
		btnHozzad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.repaint();
				
				//int id = Integer.parseInt(text_ID.getText());
				String veznev = text_Veznev.getText();
				String kernev = text_Kernev.getText();
				String varos = text_Varos.getText();
				String utca = text_Utca.getText();
				String hazszam = text_Hazszam.getText();
				String taj = text_Taj.getText();
				String szigszam = text_Szigszam.getText();
				String ado = text_Adoszam.getText();
				String telszam = text_Telefon.getText();
				
				try {
					Ujbelepo ub = new Ujbelepo(/*id, */veznev, kernev, varos, utca, hazszam, taj, szigszam, ado, telszam);
				
					if (ub != null) {
						ujbelepo_Uzenet.showMessageDialog(null, "Új belépõ felvétele megtörtént!");
						
						Ujbelepo_Felulet ub2 = new Ujbelepo_Felulet();
						ub2.main(null);
						frame.setVisible(false);
					} 
					
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnHozzad.setForeground(UIManager.getColor("Button.background"));
		btnHozzad.setFont(new Font("Arial", Font.BOLD, 14));
		btnHozzad.setBackground(new Color(255, 102, 0));
		contentPane.add(btnHozzad);
		btnHozzad.setBounds(462, 305, 141, 36);
		/*
		label_visszajelzes = new JLabel("");
		label_visszajelzes.setForeground(Color.CYAN);
		contentPane.add(label_visszajelzes);
		label_visszajelzes.setBounds(10, 315, 303, 54);
		*/
		
		JButton btnKilps = new JButton("Főmenü");
		btnKilps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Keret k = new Keret();
				//Keret.main(null);
				k.main(null);
				frame.setVisible(false);
			}
		});
		btnKilps.setForeground(Color.WHITE);
		btnKilps.setFont(new Font("Arial", Font.BOLD, 14));
		btnKilps.setBackground(new Color(255, 102, 0));
		btnKilps.setBounds(462, 366, 141, 36);
		contentPane.add(btnKilps);
		
	}

}
