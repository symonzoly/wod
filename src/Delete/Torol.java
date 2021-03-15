package Delete;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Belepo.Ujbelepo_Felulet;
import wod.Keret;
import wod.Torles;
import wod.Torles2;
import wod.Torles3;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Torol extends JFrame {

	static Torol frame = new Torol();
	static JPanel contentPane;
	static Panel Orange_Panel = new Panel();
	static JTextField text_DolgozoTorol;
	static JTextField textBeoTorol;
	static JTextField text_JelszTorl;
	JOptionPane uzenet;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Torol();
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
	public Torol() {
		setResizable(false);
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
		
		JLabel lblBeosztsAzonostja = new JLabel("Beoszt\u00E1s t\u00F6rl\u00E9se");
		lblBeosztsAzonostja.setForeground(Color.WHITE);
		lblBeosztsAzonostja.setFont(new Font("Dialog", Font.BOLD, 12));
		lblBeosztsAzonostja.setBounds(189, 237, 126, 16);
		contentPane.add(lblBeosztsAzonostja);
		
		JLabel lblJelszTrlse = new JLabel("Jelsz\u00F3 t\u00F6rl\u00E9se");
		lblJelszTrlse.setForeground(Color.WHITE);
		lblJelszTrlse.setFont(new Font("Dialog", Font.BOLD, 12));
		lblJelszTrlse.setBounds(189, 363, 126, 16);
		contentPane.add(lblJelszTrlse);
		
		JLabel lblDolgozTrlse = new JLabel("Dolgoz\u00F3 t\u00F6rl\u00E9se");
		lblDolgozTrlse.setForeground(Color.WHITE);
		lblDolgozTrlse.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDolgozTrlse.setBounds(189, 117, 126, 16);
		contentPane.add(lblDolgozTrlse);
		
		JLabel lblAddMegAz = new JLabel("Add meg az azonos\u00EDt\u00F3t");
		lblAddMegAz.setForeground(Color.WHITE);
		lblAddMegAz.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAddMegAz.setBounds(189, 146, 152, 16);
		contentPane.add(lblAddMegAz);
		
		JLabel label = new JLabel("Add meg az azonos\u00EDt\u00F3t");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 12));
		label.setBounds(189, 264, 152, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Add meg az azonos\u00EDt\u00F3t");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		label_1.setBounds(189, 397, 152, 16);
		contentPane.add(label_1);
		
		JButton btn_DolgozoTorol = new JButton("T\u00F6rl\u00E9s");
		btn_DolgozoTorol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int azon = Integer.parseInt(text_DolgozoTorol.getText());
				try {
					
					Torles t = new Torles(azon);
					
					if (t != null) {
						uzenet.showMessageDialog(null, "Dolgozó törlése megtörtént!");
					} 
					else{
						uzenet.showMessageDialog(null, "Hibás adatok!");
					}
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_DolgozoTorol.setBounds(482, 117, 97, 50);
		contentPane.add(btn_DolgozoTorol);
		
		JButton btn_BeosztasTorol = new JButton("T\u00F6rl\u00E9s");
		btn_BeosztasTorol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int azon2 = Integer.parseInt(textBeoTorol.getText());
				
				try {
					Torles2 t2 = new Torles2(azon2);
					
					if (t2 != null) {
						uzenet.showMessageDialog(null, "Beosztás törlése megtörtént!");
					} 
					else{
						uzenet.showMessageDialog(null, "Hibás adatok!");
					}
					
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_BeosztasTorol.setBounds(482, 237, 97, 50);
		contentPane.add(btn_BeosztasTorol);
		
		JButton btn_JelszTorol = new JButton("T\u00F6rl\u00E9s");
		btn_JelszTorol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int azon3 = Integer.parseInt(text_JelszTorl.getText());
				
				try {
					Torles3 t3 = new Torles3(azon3);
					
					if (t3 != null) {
						uzenet.showMessageDialog(null, "Jelszó törlése megtörtént!");
					} 
					else{
						uzenet.showMessageDialog(null, "Hibás adatok!");
					}
					
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
				
			
		});
		btn_JelszTorol.setBounds(482, 363, 97, 50);
		contentPane.add(btn_JelszTorol);
		
		text_DolgozoTorol = new JTextField();
		text_DolgozoTorol.setBounds(336, 143, 116, 22);
		contentPane.add(text_DolgozoTorol);
		text_DolgozoTorol.setColumns(10);
		
		textBeoTorol = new JTextField();
		textBeoTorol.setColumns(10);
		textBeoTorol.setBounds(336, 261, 116, 22);
		contentPane.add(textBeoTorol);
		
		text_JelszTorl = new JTextField();
		text_JelszTorl.setColumns(10);
		text_JelszTorl.setBounds(336, 391, 116, 22);
		contentPane.add(text_JelszTorl);
		
		JButton btnKilps = new JButton("Fõmenü");
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
		btnKilps.setBounds(658, 377, 141, 36);
		contentPane.add(btnKilps);
	}
}
