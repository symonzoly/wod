package Login;

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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import wod.Belepteto_Lekerdez;
import wod.Keret;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class Belepteto extends JFrame {
	
	JOptionPane belepteto_Uzenet;

	JPanel contentPane;
	JTextField text_Felhasznalonev;
	JPasswordField PassText_Jelszo;
	
	JPanel panel_Udvozles;
	JLabel lbl_Udvozles;
	static Belepteto frame;
	private JTextField textJog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Belepteto();
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
	public Belepteto() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Belepteto.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
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
		lbl_Jelsz.setBounds(29, 135, 97, 16);
		
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
			
			
			Belepteto_Lekerdez bl = new Belepteto_Lekerdez(user , digest(passw) ,jog  );	
	       
			while (bl.rs.next()) {
			
	    	if ( user == Integer.parseInt(bl.rs.getString("a_ID")) && digest(passw).equals(bl.rs.getString("passw") ) ) {
				JOptionPane.showMessageDialog(null, "Az azonosító és a jelszó megfelelõ!");
				Keret k = new Keret();
				k.main(null);		
				frame.setVisible(false);	
	    	}
	    	else if(!(user == Integer.parseInt(bl.rs.getString("a_ID")) && digest(passw).equals(bl.rs.getString("passw") )) ){
	    		JOptionPane.showMessageDialog(null, "Az azonosító és a jelszó nem megfelelõ!");
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
		panel_Udvozles.setBounds(0, 0, 444, 59);
		panel_Udvozles.setLayout(null);
		
		lbl_Udvozles = new JLabel("Üdvözöllek");
		lbl_Udvozles.setForeground(Color.WHITE);
		lbl_Udvozles.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 26));
		lbl_Udvozles.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_Udvozles.add(lbl_Udvozles);
		lbl_Udvozles.setBounds(171, 13, 192, 33);
		
		textJog = new JTextField();
		textJog.setBounds(171, 109, 116, 22);
		contentPane.add(textJog);
		textJog.setColumns(10);
		
		JLabel lblJogosultsg = new JLabel("Jogosultság");
		lblJogosultsg.setForeground(Color.WHITE);
		lblJogosultsg.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblJogosultsg.setBounds(29, 106, 118, 16);
		contentPane.add(lblJogosultsg);
		
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


