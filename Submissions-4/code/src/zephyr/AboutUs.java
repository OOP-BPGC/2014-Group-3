package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutUs {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs window = new AboutUs();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutUs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Zephyr Version 1.00x");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setBounds(152, 11, 401, 51);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Created By :-");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(53, 85, 90, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Vaibhav Gupta");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(199, 123, 175, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblRahulAmbavat = new JLabel("Rahul Ambavat");
		lblRahulAmbavat.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRahulAmbavat.setBounds(199, 155, 175, 21);
		frame.getContentPane().add(lblRahulAmbavat);
		
		JLabel lblMihirBharambe = new JLabel("Mihir Bharambe");
		lblMihirBharambe.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMihirBharambe.setBounds(199, 187, 175, 21);
		frame.getContentPane().add(lblMihirBharambe);
		
		JLabel lblMohakChadha = new JLabel("Mohak Chadha");
		lblMohakChadha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMohakChadha.setBounds(199, 219, 175, 21);
		frame.getContentPane().add(lblMohakChadha);
		
		JLabel lblSreeRavitheja = new JLabel("Sree Ravitheja");
		lblSreeRavitheja.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSreeRavitheja.setBounds(199, 251, 175, 21);
		frame.getContentPane().add(lblSreeRavitheja);
		
		JLabel lblGauravTamba = new JLabel("Gaurav Tamba");
		lblGauravTamba.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGauravTamba.setBounds(199, 283, 175, 21);
		frame.getContentPane().add(lblGauravTamba);
		
		JLabel lblRahulBisht = new JLabel("Rahul Bisht");
		lblRahulBisht.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRahulBisht.setBounds(199, 315, 175, 21);
		frame.getContentPane().add(lblRahulBisht);
		
		JButton btnNewButton = new JButton("<--- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main M = new Main();
				M.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(199, 405, 98, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
