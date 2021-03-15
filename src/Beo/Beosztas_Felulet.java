package Beo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Belepo.Ujbelepo_Felulet;
import Beo_Print.Beo_Print_Felulet;
import wod.Beosztas;
import wod.Keret;
import wod.Print_beo;

public class Beosztas_Felulet extends JFrame {
	
	JOptionPane beosztas_Uzenet;

	JPanel Orange_Panel;
	JPanel contentPane;
	
	static Beosztas_Felulet frame = new Beosztas_Felulet();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Beosztas_Felulet();
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
	public Beosztas_Felulet() {
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
		
		
		Orange_Panel = new JPanel();
		Orange_Panel.setBackground(new Color(255, 102, 0));
		contentPane.add(Orange_Panel);
		Orange_Panel.setBounds(0, 0, 811, 71);
		Orange_Panel.setLayout(null);
		
		Label lbl_WOD = new Label("Workers Office Desk");
		lbl_WOD.setForeground(UIManager.getColor("Button.background"));
		lbl_WOD.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 24));
		Orange_Panel.add(lbl_WOD);
		lbl_WOD.setBounds(10, 10, 801, 51);
		
		JLabel label1 = new JLabel("1");
		label1.setFont(new Font("Arial", Font.BOLD, 14));
		label1.setForeground(Color.WHITE);
		contentPane.add(label1);
		label1.setBounds(26, 93, 30, 16);
		
		JLabel label2 = new JLabel("2");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label2);
		label2.setBounds(26, 125, 30, 16);
		
		JLabel label3 = new JLabel("3");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label3);
		label3.setBounds(26, 157, 30, 16);
		
		JLabel label4 = new JLabel("4");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label4);
		label4.setBounds(26, 189, 30, 16);
		
		JLabel label5 = new JLabel("5");
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label5);
		label5.setBounds(26, 221, 30, 16);
		
		JLabel label6 = new JLabel("6");
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label6);
		label6.setBounds(26, 253, 30, 16);
		
		JLabel label7 = new JLabel("7");
		label7.setForeground(Color.WHITE);
		label7.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label7);
		label7.setBounds(26, 285, 30, 16);
		
		JLabel label8 = new JLabel("8");
		label8.setForeground(Color.WHITE);
		label8.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label8);
		label8.setBounds(26, 317, 30, 16);
		
		JLabel label9 = new JLabel("9");
		label9.setForeground(Color.WHITE);
		label9.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label9);
		label9.setBounds(26, 349, 30, 16);
		
		JLabel label10 = new JLabel("10");
		label10.setForeground(Color.WHITE);
		label10.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label10);
		label10.setBounds(26, 381, 30, 16);
		
		JSpinner spn1 = new JSpinner();
		spn1.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn1);
		spn1.setBounds(49, 90, 142, 22);
		
		JSpinner spn2 = new JSpinner();
		spn2.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn2);
		spn2.setBounds(49, 122, 142, 22);
		
		JSpinner spn3 = new JSpinner();
		spn3.setModel(new SpinnerListModel(new String[] {"P", "08:00-16:00", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn3);
		spn3.setBounds(49, 154, 142, 22);
		
		JSpinner spn4 = new JSpinner();
		spn4.setModel(new SpinnerListModel(new String[] {"SZ", "P", "08:00-16:00", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn4);
		spn4.setBounds(49, 186, 142, 22);
		
		JSpinner spn5 = new JSpinner();
		spn5.setModel(new SpinnerListModel(new String[] {"SZ", "P", "08:00-16:00", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn5);
		spn5.setBounds(49, 218, 142, 22);
		
		JSpinner spn6 = new JSpinner();
		spn6.setModel(new SpinnerListModel(new String[] {"H\u00E9tv\u00E9ge", "08:00-16:00", "P", "SZ"}));
		contentPane.add(spn6);
		spn6.setBounds(49, 250, 142, 22);
		
		JSpinner spn7 = new JSpinner();
		spn7.setModel(new SpinnerListModel(new String[] {"H\u00E9tv\u00E9ge", "08:00-16:00", "P", "SZ"}));
		contentPane.add(spn7);
		spn7.setBounds(49, 282, 142, 22);
		
		JSpinner spn8 = new JSpinner();
		spn8.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn8);
		spn8.setBounds(49, 314, 142, 22);
		
		JSpinner spn9 = new JSpinner();
		spn9.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn9);
		spn9.setBounds(49, 346, 142, 22);
		
		JSpinner spn10 = new JSpinner();
		spn10.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn10);
		spn10.setBounds(49, 378, 142, 22);
		
		JLabel label11 = new JLabel("11");
		label11.setForeground(Color.WHITE);
		label11.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label11);
		label11.setBounds(217, 93, 30, 16);
		
		JSpinner spn11 = new JSpinner();
		spn11.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn11);
		spn11.setBounds(240, 90, 142, 22);
		
		JLabel label12 = new JLabel("12");
		label12.setForeground(Color.WHITE);
		label12.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label12);
		label12.setBounds(217, 125, 30, 16);
		
		JSpinner spn12 = new JSpinner();
		spn12.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn12);
		spn12.setBounds(240, 122, 142, 22);
		
		JLabel label13 = new JLabel("13");
		label13.setForeground(Color.WHITE);
		label13.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label13);
		label13.setBounds(217, 157, 30, 16);
		
		JSpinner spn13 = new JSpinner();
		spn13.setModel(new SpinnerListModel(new String[] {"H\u00E9tv\u00E9ge", "08:00-16:00", "P", "SZ"}));
		contentPane.add(spn13);
		spn13.setBounds(240, 154, 142, 22);
		
		JLabel label14 = new JLabel("14");
		label14.setForeground(Color.WHITE);
		label14.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label14);
		label14.setBounds(217, 189, 30, 16);
		
		JSpinner spn14 = new JSpinner();
		spn14.setModel(new SpinnerListModel(new String[] {"H\u00E9tv\u00E9ge", "08:00-16:00", "P", "SZ"}));
		contentPane.add(spn14);
		spn14.setBounds(240, 186, 142, 22);
		
		JLabel label15 = new JLabel("15");
		label15.setForeground(Color.WHITE);
		label15.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label15);
		label15.setBounds(217, 221, 30, 16);
		
		JSpinner spn15 = new JSpinner();
		spn15.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn15);
		spn15.setBounds(240, 218, 142, 22);
		
		JLabel label16 = new JLabel("16");
		label16.setForeground(Color.WHITE);
		label16.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label16);
		label16.setBounds(217, 253, 30, 16);
		
		JSpinner spn16 = new JSpinner();
		spn16.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn16);
		spn16.setBounds(240, 250, 142, 22);
		
		JLabel label17 = new JLabel("17");
		label17.setForeground(Color.WHITE);
		label17.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label17);
		label17.setBounds(217, 285, 30, 16);
		
		JSpinner spn17 = new JSpinner();
		spn17.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn17);
		spn17.setBounds(240, 282, 142, 22);
		
		JLabel label18 = new JLabel("18");
		label18.setForeground(Color.WHITE);
		label18.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label18);
		label18.setBounds(217, 317, 30, 16);
		
		JSpinner spn18 = new JSpinner();
		spn18.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn18);
		spn18.setBounds(240, 314, 142, 22);
		
		JLabel label19 = new JLabel("19");
		label19.setForeground(Color.WHITE);
		label19.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label19);
		label19.setBounds(217, 349, 30, 16);
		
		JSpinner spn19 = new JSpinner();
		spn19.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn19);
		spn19.setBounds(240, 346, 142, 22);
		
		JLabel label20 = new JLabel("20");
		label20.setForeground(Color.WHITE);
		label20.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label20);
		label20.setBounds(217, 381, 30, 16);
		
		JSpinner spn20 = new JSpinner();
		spn20.setModel(new SpinnerListModel(new String[] {"H\u00E9tv\u00E9ge", "08:00-16:00", "P", "SZ"}));
		contentPane.add(spn20);
		spn20.setBounds(240, 378, 142, 22);
		
		JLabel label21 = new JLabel("21");
		label21.setForeground(Color.WHITE);
		label21.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label21);
		label21.setBounds(415, 93, 30, 16);
		
		JSpinner spn21 = new JSpinner();
		spn21.setModel(new SpinnerListModel(new String[] {"H\u00E9tv\u00E9ge", "08:00-16:00", "P", "SZ"}));
		contentPane.add(spn21);
		spn21.setBounds(438, 90, 142, 22);
		
		JLabel label22 = new JLabel("22");
		label22.setForeground(Color.WHITE);
		label22.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label22);
		label22.setBounds(415, 125, 30, 16);
		
		JSpinner spn22 = new JSpinner();
		spn22.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn22);
		spn22.setBounds(438, 123, 142, 22);
		
		JLabel label23 = new JLabel("23");
		label23.setForeground(Color.WHITE);
		label23.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label23);
		label23.setBounds(415, 157, 30, 16);
		
		JSpinner spn23 = new JSpinner();
		spn23.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn23);
		spn23.setBounds(438, 154, 142, 22);
		
		JLabel label24 = new JLabel("24");
		label24.setForeground(Color.WHITE);
		label24.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label24);
		label24.setBounds(415, 189, 30, 16);
		
		JSpinner spn24 = new JSpinner();
		spn24.setModel(new SpinnerListModel(new String[] {"P", "08:00-16:00", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn24);
		spn24.setBounds(438, 186, 142, 22);
		
		JLabel label25 = new JLabel("25");
		label25.setForeground(Color.WHITE);
		label25.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label25);
		label25.setBounds(415, 221, 30, 16);
		
		JSpinner spn25 = new JSpinner();
		spn25.setModel(new SpinnerListModel(new String[] {"P", "08:00-16:00", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn25);
		spn25.setBounds(438, 218, 142, 22);
		
		JLabel label26 = new JLabel("26");
		label26.setForeground(Color.WHITE);
		label26.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label26);
		label26.setBounds(415, 253, 30, 16);
		
		JSpinner spn26 = new JSpinner();
		spn26.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge"}));
		contentPane.add(spn26);
		spn26.setBounds(438, 250, 142, 22);
		
		JLabel label27 = new JLabel("27");
		label27.setForeground(Color.WHITE);
		label27.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label27);
		label27.setBounds(415, 285, 30, 16);
		
		JSpinner spn27 = new JSpinner();
		spn27.setModel(new SpinnerListModel(new String[] {"H\u00E9tv\u00E9ge", "08:00-16:00", "P", "SZ"}));
		contentPane.add(spn27);
		spn27.setBounds(438, 282, 142, 22);
		
		JLabel label28 = new JLabel("28");
		label28.setForeground(Color.WHITE);
		label28.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label28);
		label28.setBounds(415, 317, 30, 16);
		
		JSpinner spn28 = new JSpinner();
		spn28.setModel(new SpinnerListModel(new String[] {"H\u00E9tv\u00E9ge", "08:00-16:00", "P", "SZ"}));
		contentPane.add(spn28);
		spn28.setBounds(438, 314, 142, 22);
		
		JLabel label29 = new JLabel("29");
		label29.setForeground(Color.WHITE);
		label29.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label29);
		label29.setBounds(415, 349, 30, 16);
		
		JSpinner spn29 = new JSpinner();
		spn29.setModel(new SpinnerListModel(new String[] {"08:00-16:00", "P", "SZ", "H\u00E9tv\u00E9ge", "N"}));
		contentPane.add(spn29);
		spn29.setBounds(438, 346, 142, 22);
		
		JLabel label30 = new JLabel("30");
		label30.setForeground(Color.WHITE);
		label30.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label30);
		label30.setBounds(415, 381, 30, 16);
		
		JSpinner spn30 = new JSpinner();
		spn30.setModel(new SpinnerListModel(new String[] {"SZ", "P", "08:00-16:00", "H\u00E9tv\u00E9ge", "N"}));
		contentPane.add(spn30);
		spn30.setBounds(438, 378, 142, 22);
		
		JLabel label31 = new JLabel("31");
		label31.setForeground(Color.WHITE);
		label31.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(label31);
		label31.setBounds(415, 413, 30, 16);
		
		JSpinner spn31 = new JSpinner();
		spn31.setModel(new SpinnerListModel(new String[] {"SZ", "P", "08:00-16:00", "H\u00E9tv\u00E9ge", "N"}));
		contentPane.add(spn31);
		spn31.setBounds(438, 410, 142, 22);
		
		JLabel lblAzonost = new JLabel("Azonos\u00EDt\u00F3");
		lblAzonost.setFont(new Font("Arial", Font.BOLD, 14));
		lblAzonost.setForeground(new Color(255, 102, 0));
		contentPane.add(lblAzonost);
		lblAzonost.setBounds(613, 93, 142, 32);
		
		JSpinner spnAzon = new JSpinner();
		spnAzon.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		contentPane.add(spnAzon);
		spnAzon.setBounds(613, 122, 142, 22);
		
		JButton btnFelvisz = new JButton("R\u00F6gz\u00EDt");
		btnFelvisz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int azon = (int) spnAzon.getValue();
				
				String d1 = (String)spn1.getValue();
				String d2 = (String)spn2.getValue();
				String d3 = (String)spn3.getValue();
				String d4 = (String)spn4.getValue();
				String d5 = (String)spn5.getValue();
				String d6 = (String)spn6.getValue();
				String d7 = (String)spn7.getValue();
				String d8 = (String)spn8.getValue();
				String d9 = (String)spn9.getValue();
				String d10 = (String)spn10.getValue();
				String d11 = (String)spn11.getValue();
				String d12 = (String)spn12.getValue();
				String d13 = (String)spn13.getValue();
				String d14 = (String)spn14.getValue();
				String d15 = (String)spn15.getValue();
				String d16 = (String)spn16.getValue();
				String d17 = (String)spn17.getValue();
				String d18 = (String)spn18.getValue();
				String d19 = (String)spn19.getValue();
				String d20 = (String)spn20.getValue();
				String d21 = (String)spn21.getValue();
				String d22 = (String)spn22.getValue();
				String d23 = (String)spn23.getValue();
				String d24 = (String)spn24.getValue();
				String d25 = (String)spn25.getValue();
				String d26 = (String)spn26.getValue();
				String d27 = (String)spn27.getValue();
				String d28 = (String)spn28.getValue();
				String d29 = (String)spn29.getValue();
				String d30 = (String)spn30.getValue();
				String d31 = (String)spn31.getValue();
				
				try {
					Beosztas b = new Beosztas(azon, d1, d2, d3, d4, d5,
							d6, d7, d8, d9, d10, d11, d12, d13, d14, d15,
							d16, d17, d18, d19, d20, d21, d22, d23, d24, d25,
							d26, d27, d28, d29, d30, d31);
					if (b != null) {
						beosztas_Uzenet.showMessageDialog(null, "Beosztás rögzítése megtörtént!");
						
						Beosztas_Felulet b2 = new Beosztas_Felulet();
						b2.main(null);
						frame.setVisible(false);
					} 
					
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		
			}

			private void showMessageDialog(Object object, String string) {
				// TODO Auto-generated method stub
				
			}
		});
		btnFelvisz.setBackground(new Color(255, 102, 0));
		btnFelvisz.setForeground(Color.WHITE);
		btnFelvisz.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(btnFelvisz);
		btnFelvisz.setBounds(613, 157, 97, 55);
		
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
		btnKilps.setBounds(613, 225, 97, 55);
		contentPane.add(btnKilps);
		
		
	}
}
