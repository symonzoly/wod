package Login_2;

import java.awt.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.sql.*;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import wod.Belepteto_Lekerdez;
import wod.Keret;


import wod_2.Print_beo_2;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import javax.swing.JTextArea;

public class Belepteto_2 extends JFrame {
	
	JOptionPane belepteto_Uzenet;

	JPanel contentPane;
	JTextField text_Felhasznalonev;
	JPasswordField PassText_Jelszo;
	
	JPanel panel_Udvozles;
	JLabel lbl_Udvozles;
	static Belepteto_2 frame;
	private JTextField textJog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Belepteto_2();
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
	public Belepteto_2() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Belepteto_2.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 560);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Felhaszn = new JLabel("Azonosító");
		lbl_Felhaszn.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lbl_Felhaszn.setForeground(Color.WHITE);
		contentPane.add(lbl_Felhaszn);
		lbl_Felhaszn.setBounds(29, 77, 118, 16);
		
		JLabel lbl_Jelsz = new JLabel("Jelszó");
		lbl_Jelsz.setForeground(Color.WHITE);
		lbl_Jelsz.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		contentPane.add(lbl_Jelsz);
		lbl_Jelsz.setBounds(29, 147, 97, 16);
		
		text_Felhasznalonev = new JTextField();
		contentPane.add(text_Felhasznalonev);
		text_Felhasznalonev.setBounds(171, 74, 192, 22);
		text_Felhasznalonev.setColumns(10);
		
		PassText_Jelszo = new JPasswordField();
		contentPane.add(PassText_Jelszo);
		PassText_Jelszo.setBounds(171, 144, 192, 22);
		
		//BelÃ©p gomb
		
		JButton btn_Belep = new JButton("Belépés");
		btn_Belep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 try {
		 
			int user = Integer.parseInt(text_Felhasznalonev.getText());
			String passw = PassText_Jelszo.getText() ; 
			String jog = textJog.getText();
			
			Belepteto_Lekerdez bl = new Belepteto_Lekerdez(user , digest(passw), jog );
			
	       while (bl.rs.next()) {
			if ( user == Integer.parseInt(bl.rs.getString("a_ID")) && digest(passw).equals(bl.rs.getString("passw") )) {
				
				JOptionPane.showMessageDialog(null, "Az azonosító és a jelszó megfelelõ!");
				
				contentPane.removeAll();
				contentPane.repaint();
				
				JScrollPane sp0;
				JScrollPane sp1;
				JScrollPane sp2;
				JScrollPane sp3;
				JScrollPane sp4;
				
				try {
					
					
					//frame.setVisible(false);
					
					Print_beo_2 pb0 = new Print_beo_2(user, digest(passw), jog);
					sp0=new JScrollPane(pb0.tabla0);
					contentPane.add(sp0);
					sp0.setBounds(20, 20, 1000, 90);
				
					Print_beo_2 pb1 = new Print_beo_2(user, digest(passw), jog);
					sp1=new JScrollPane(pb1.tabla1);
					contentPane.add(sp1);
					sp1.setBounds(20, 120, 1000, 90);
					
					Print_beo_2 pb2 = new Print_beo_2(user, digest(passw), jog);
					sp2=new JScrollPane(pb2.tabla2);
					contentPane.add(sp2);
					sp2.setBounds(20, 220, 1000, 90);
					
					Print_beo_2 pb3 = new Print_beo_2(user, digest(passw), jog);
					sp3=new JScrollPane(pb3.tabla3);
					contentPane.add(sp3);
					sp3.setBounds(20, 320, 1000, 90);
					
					Print_beo_2 pb4 = new Print_beo_2(user, digest(passw), jog);
					sp4=new JScrollPane(pb4.tabla4);
					contentPane.add(sp4);
					sp4.setBounds(20, 420, 427, 90);
					
					
					JButton buttonKilep = new JButton("Kilép");
					buttonKilep.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							System.exit(0);
							
						}
					});
					buttonKilep.setForeground(Color.WHITE);
					buttonKilep.setFont(new Font("Arial", Font.BOLD, 14));
					buttonKilep.setBackground(new Color(255, 102, 0));
					buttonKilep.setBounds(727, 425, 189, 35);
					contentPane.add(buttonKilep);
					
					
				
								
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					 	
			}
			else{
				JOptionPane.showMessageDialog(null, "A felhasználónév, vagy a jelszó nem megfelelõ! Próbáld újra!");
			}
		
		}
	       
	       
		     //System.out.println(digest(passw));
		     
			} catch (ClassNotFoundException | SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 
			}
			
		});
		btn_Belep.setForeground(UIManager.getColor("Button.background"));
		btn_Belep.setFont(new Font("Arial", Font.BOLD, 14));
		btn_Belep.setBackground(new Color(255, 102, 0));
		contentPane.add(btn_Belep);
		btn_Belep.setBounds(50, 203, 97, 25);
		
		//TÃ¶rÃ¶l gomb
		
		JButton btn_Torol = new JButton("Törlés");
		btn_Torol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				text_Felhasznalonev.setText(null);
				PassText_Jelszo.setText(null);
			
	     }  
		});
		btn_Torol.setForeground(UIManager.getColor("Button.background"));
		btn_Torol.setFont(new Font("Arial", Font.BOLD, 14));
		btn_Torol.setBackground(new Color(255, 102, 0));
		contentPane.add(btn_Torol);
		btn_Torol.setBounds(158, 203, 97, 25);
		
		//KilÃ©p gomb
		
		JButton btn_Kilep = new JButton("Kilépés");
		btn_Kilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showConfirmDialog(
						null, 
						"Biztos ki szeretne lépni?", 
						"Figyelmeztetõ üzenet!", 
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btn_Kilep.setForeground(UIManager.getColor("Button.background"));
		btn_Kilep.setFont(new Font("Arial", Font.BOLD, 14));
		btn_Kilep.setBackground(new Color(255, 102, 0));
		contentPane.add(btn_Kilep);
		btn_Kilep.setBounds(266, 203, 97, 25);
		
		panel_Udvozles = new JPanel();
		panel_Udvozles.setBackground(new Color(255, 102, 0));
		contentPane.add(panel_Udvozles);
		panel_Udvozles.setBounds(0, 0, 1044, 59);
		panel_Udvozles.setLayout(null);
		
		lbl_Udvozles = new JLabel("Üdvözöllek");
		lbl_Udvozles.setForeground(Color.WHITE);
		lbl_Udvozles.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 26));
		lbl_Udvozles.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_Udvozles.add(lbl_Udvozles);
		lbl_Udvozles.setBounds(171, 13, 192, 33);
		
		JTextArea txtrKedvesKollgaEz = new JTextArea();
		txtrKedvesKollgaEz.setForeground(new Color(255, 102, 0));
		txtrKedvesKollgaEz.setBackground(new Color(51, 51, 51));
		txtrKedvesKollgaEz.setFont(new Font("Arial", Font.BOLD, 18));
		txtrKedvesKollgaEz.setEditable(false);
		txtrKedvesKollgaEz.setText("Kedves kolléga!\r\n\r\nEz az applikáció azért lett létrehozva a munkaállomásodon,\r\nhogy kényelmesen nyomon tudd követni az aktuális havi\r\nmunkabeosztásodat!\r\n\r\nJó munkát kívánok neked!");
		txtrKedvesKollgaEz.setBounds(397, 77, 623, 201);
		contentPane.add(txtrKedvesKollgaEz);
		
		textJog = new JTextField();
		textJog.setEditable(false);
		textJog.setText("b");
		textJog.setBounds(50, 256, 116, 22);
		textJog.setVisible(false);
		contentPane.add(textJog);
		textJog.setColumns(10);
		
		
		
	}
	
	public static String digest(String tisztaSzoveg) { //digest = kivonat 
		String kivonatSzoveg = null;
		try {
			kivonatSzoveg = tryDigest(tisztaSzoveg);
		}catch(NoSuchAlgorithmException ex) {
			System.err.println("Hiba!");
		}
		return kivonatSzoveg;
	}
	public static String tryDigest(String tisztaSzoveg) 
		throws NoSuchAlgorithmException {
 
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] sb = md.digest(tisztaSzoveg.getBytes());
 
		StringBuffer hexSzoveg = new StringBuffer();
		for (int i=0; i<sb.length; i++) {
			String hex = Integer.toHexString(0xFF & sb[i]);
			if(hex.length() == 1) {
				hexSzoveg.append('0');
			}
			hexSzoveg.append(hex);
		}		
		return hexSzoveg.toString();
	}
	}


