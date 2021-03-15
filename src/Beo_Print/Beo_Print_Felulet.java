package Beo_Print;

import java.awt.*;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import wod.Keret;
import wod.Print_beo;

import javax.swing.*;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Beo_Print_Felulet extends JFrame {

	private JPanel contentPane;
	static Beo_Print_Felulet frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Beo_Print_Felulet();
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
	public Beo_Print_Felulet() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 560);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(549, 390, 100, 22);
		spinner.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		contentPane.add(spinner);
		
		JLabel lblAzonost = new JLabel("Azonos\u00EDt\u00F3");
		lblAzonost.setBounds(460, 388, 77, 16);
		lblAzonost.setForeground(Color.WHITE);
		lblAzonost.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblAzonost);
		
		JButton btnLekerdez = new JButton("Lek\u00E9rdez");
		btnLekerdez.setBounds(460, 425, 189, 35);
		btnLekerdez.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JScrollPane sp0;
				JScrollPane sp1;
				JScrollPane sp2;
				JScrollPane sp3;
				JScrollPane sp4;
				
				int azon = (int) spinner.getValue();
				
				try {
					
					Print_beo pb0 = new Print_beo(azon);
					sp0=new JScrollPane(pb0.tabla0);
					contentPane.add(sp0);
					sp0.setBounds(20, 10, 1000, 90);
				
					Print_beo pb1 = new Print_beo(azon);
					sp1=new JScrollPane(pb1.tabla1);
					contentPane.add(sp1);
					sp1.setBounds(20, 100, 1000, 90);
					
					Print_beo pb2 = new Print_beo(azon);
					sp2=new JScrollPane(pb2.tabla2);
					contentPane.add(sp2);
					sp2.setBounds(20, 190, 1000, 90);
					
					Print_beo pb3 = new Print_beo(azon);
					sp3=new JScrollPane(pb3.tabla3);
					contentPane.add(sp3);
					sp3.setBounds(20, 280, 1000, 90);
					
					Print_beo pb4 = new Print_beo(azon);
					sp4=new JScrollPane(pb4.tabla4);
					contentPane.add(sp4);
					sp4.setBounds(20, 370, 427, 90);
				
								
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		contentPane.add(btnLekerdez);
		btnLekerdez.setBackground(new Color(255, 102, 0));
		btnLekerdez.setForeground(Color.WHITE);
		btnLekerdez.setFont(new Font("Arial", Font.BOLD, 14));
		
		JButton buttonKilep = new JButton("Főmenü");
		buttonKilep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Keret k = new Keret();
				k.main(null);
				frame.setVisible(false);
				
			}
		});
		buttonKilep.setForeground(Color.WHITE);
		buttonKilep.setFont(new Font("Arial", Font.BOLD, 14));
		buttonKilep.setBackground(new Color(255, 102, 0));
		buttonKilep.setBounds(727, 425, 189, 35);
		contentPane.add(buttonKilep);
		
	}
}
