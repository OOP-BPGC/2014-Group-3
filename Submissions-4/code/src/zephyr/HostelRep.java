package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JPasswordField;


public class HostelRep {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HostelRep window = new HostelRep();
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
	public HostelRep() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hostel Representative");
		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(142, 11, 193, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Hostel Name");
		lblNewLabel_1.setBounds(52, 75, 124, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Password");
		lblNewLabel_2.setBounds(52, 120, 124, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(223, 72, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("<-- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Zephyr Zeph = new Zephyr();
				Zeph.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(223, 198, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				User person = new User();
				String name = textField.getText();
				@SuppressWarnings("deprecation")
				String pass = passwordField.getText();
				boolean temp = false;
				try {
					temp = person.hrLogin(pass, name);
				} catch (FileNotFoundException e) {					
					e.printStackTrace();
				} catch (ClassNotFoundException e) {					
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (temp){
					HRactions HRA = new HRactions();
					HRA.frame.setVisible(true);
					frame.setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong Hostel name / password");
				}
			}
		});
		btnNewButton_1.setBounds(223, 167, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(223, 120, 140, 20);
		frame.getContentPane().add(passwordField);
	}

}
