package wod;

import java.awt.*;
import java.awt.Dialog.ModalExclusionType;

import javax.swing.border.EmptyBorder;

//import org.omg.CORBA.PUBLIC_MEMBER;

//import com.sun.glass.events.KeyEvent;
//import com.sun.glass.events.WindowEvent;

import Belepo.Ujbelepo_Felulet;
import Beo.Beosztas_Felulet;
import Beo_Print.Beo_Print_Felulet;
import Delete.Torol;
import Passw.create_Passw;
//import sun.invoke.empty.Empty;
//import sun.net.www.content.image.jpeg;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.sql.*;
import java.sql.Date;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

import java.awt.event.ActionEvent;

public class Keret extends JFrame  {
	
	 static Keret frame = new Keret();
	
	 static JPanel contentPane;
	 static Panel Orange_Panel = new Panel();
	 
	 static Beosztas_Felulet b = new Beosztas_Felulet();
	 static Ujbelepo_Felulet ubf = new Ujbelepo_Felulet();
	 static Beo_Print_Felulet bpf = new Beo_Print_Felulet();
	 static Torol t = new Torol();
	 static create_Passw cp = new create_Passw();
	
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Keret();
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
	public Keret() {
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
		
	               
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Admin_Menu = new JMenu("Adminisztr\u00E1ci\u00F3");
		menuBar.add(Admin_Menu);
		
		//ÚJ BELÉPÕ
		JMenuItem mntm_Uj_Belepo = new JMenuItem("\u00DAj bel\u00E9p\u0151");
		mntm_Uj_Belepo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.repaint();
				ubf.main(null);
				frame.setVisible(false);
				
			}
		});
		Admin_Menu.add(mntm_Uj_Belepo);
		
		//BEO MAKER
		JMenuItem mntmBeoszts = new JMenuItem("Beoszt\u00E1st k\u00E9sz\u00EDt");
		mntmBeoszts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.repaint();
				b.main(null);
				frame.setVisible(false);
				
			}
		});
		Admin_Menu.add(mntmBeoszts);
		// BEO CHECKER
		JMenuItem mntmBeosztstMegtekint = new JMenuItem("Beoszt\u00E1st megtekint");
		mntmBeosztstMegtekint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contentPane.removeAll();
				contentPane.repaint();
				bpf.main(null);
				frame.setVisible(false);
			}
		});
		Admin_Menu.add(mntmBeosztstMegtekint);
		
		//TÖRÖL
		JMenuItem mntmTrl = new JMenuItem("Töröl");
		mntmTrl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.repaint();
				t.main(null);
				frame.setVisible(false);
			}
		});
		Admin_Menu.add(mntmTrl);
		
		JMenuItem mntmJelsz = new JMenuItem("Jelszó");
		mntmJelsz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				contentPane.repaint();
				cp.main(null);
				frame.setVisible(false);
			}
		});
		Admin_Menu.add(mntmJelsz);
		
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
		
		JButton btnKilps = new JButton("Kil\u00E9p\u00E9s");
		btnKilps.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnKilps.setForeground(Color.WHITE);
		btnKilps.setFont(new Font("Arial", Font.BOLD, 14));
		btnKilps.setBackground(new Color(255, 102, 0));
		btnKilps.setBounds(658, 77, 141, 36);
		contentPane.add(btnKilps);
		
		
		
	
	}
}
