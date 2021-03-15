package Passw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Belepo.Ujbelepo_Felulet;
import Login.Belepteto;
import wod.Keret;
import wod.jelszo_Letrehoz;

import javax.swing.JTextField;

public class create_Passw extends JFrame {

    JPanel contentPane;
	JPanel panel_Udvozles;
	JLabel lbl_Udvozles;
	JLabel lblAzonost;
	JLabel lblJelsz;
	static create_Passw frame = new create_Passw();
	JTextField text_Azon;
	JTextField text_Jelsz;
	JButton btnLtrehoz;
	 JOptionPane uzenet;
	 private JLabel label_Jogosultsag;
	 private JTextField text_Jog;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new create_Passw();
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
	public create_Passw() {
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Belepteto.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_Kilep = new JButton("Fõmenü");
		btn_Kilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Keret k = new Keret();
				k.main(null);		
				frame.setVisible(false);	
			
			}
		});
		btn_Kilep.setForeground(UIManager.getColor("Button.background"));
		btn_Kilep.setFont(new Font("Arial", Font.BOLD, 14));
		btn_Kilep.setBackground(new Color(255, 102, 0));
		contentPane.add(btn_Kilep);
		btn_Kilep.setBounds(308, 204, 97, 25);
		
		panel_Udvozles = new JPanel();
		panel_Udvozles.setBackground(new Color(255, 102, 0));
		contentPane.add(panel_Udvozles);
		panel_Udvozles.setBounds(0, 0, 444, 59);
		panel_Udvozles.setLayout(null);
		
		lbl_Udvozles = new JLabel("Jelszó generátor");
		lbl_Udvozles.setForeground(Color.WHITE);
		lbl_Udvozles.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 26));
		lbl_Udvozles.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_Udvozles.add(lbl_Udvozles);
		lbl_Udvozles.setBounds(29, 13, 365, 33);
		
		lblAzonost = new JLabel("Azonosító");
		lblAzonost.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblAzonost.setForeground(Color.WHITE);
		lblAzonost.setBounds(40, 82, 88, 16);
		contentPane.add(lblAzonost);
		
		lblJelsz = new JLabel("Jelszó");
		lblJelsz.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblJelsz.setForeground(Color.WHITE);
		lblJelsz.setBounds(40, 135, 88, 16);
		contentPane.add(lblJelsz);
		
		text_Azon = new JTextField();
		text_Azon.setBounds(138, 72, 116, 22);
		contentPane.add(text_Azon);
		text_Azon.setColumns(10);
		
		text_Jelsz = new JTextField();
		text_Jelsz.setColumns(10);
		text_Jelsz.setBounds(138, 132, 116, 22);
		contentPane.add(text_Jelsz);
		
		btnLtrehoz = new JButton("Létrehoz");
		btnLtrehoz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int azonosito = Integer.parseInt(text_Azon.getText());
				String jelszo = text_Jelsz.getText();
				String jog = text_Jog.getText();
				
				try {
					jelszo_Letrehoz jl = new jelszo_Letrehoz(azonosito, jelszo, jog);
					
					if (jl != null) {
						uzenet.showMessageDialog(null, "Jelszó sikeresen hozzárendelve!");
						
						
					} 
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnLtrehoz.setForeground(UIManager.getColor("Button.background"));
		btnLtrehoz.setFont(new Font("Arial", Font.BOLD, 14));
		btnLtrehoz.setBackground(new Color(255, 102, 0));
		btnLtrehoz.setBounds(308, 131, 97, 25);
		contentPane.add(btnLtrehoz);
		
		label_Jogosultsag = new JLabel("Jogosultság");
		label_Jogosultsag.setForeground(Color.WHITE);
		label_Jogosultsag.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		label_Jogosultsag.setBounds(38, 193, 88, 16);
		contentPane.add(label_Jogosultsag);
		
		text_Jog = new JTextField();
		text_Jog.setColumns(10);
		text_Jog.setBounds(138, 190, 116, 22);
		contentPane.add(text_Jog);
		
	}

}
