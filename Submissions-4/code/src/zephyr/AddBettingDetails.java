package zephyr;

import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JPasswordField;

import java.awt.Choice;


public class AddBettingDetails {

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
					AddBettingDetails window = new AddBettingDetails();
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
	public AddBettingDetails() {
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
		
		JLabel lblNewLabel = new JLabel("Add Betting Details");
		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(126, 28, 173, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Event Name");
		lblNewLabel_1.setBounds(38, 150, 128, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(206, 147, 158, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(206, 122, 158, 20);
		frame.getContentPane().add(passwordField);
		
		final Choice choice = new Choice();
		choice.setBounds(206, 94, 158, 20);
		choice.add("ah1");
		choice.add("ah2");
		choice.add("ah3");
		choice.add("ah4");
		choice.add("ah5");
		choice.add("ah6");
		choice.add("ah7");
		choice.add("ah8");
		choice.add("ch1");
		choice.add("ch2");
		choice.add("ch3");
		choice.add("ch4");
		choice.add("ch5");
		choice.add("ch6");
		frame.getContentPane().add(choice);
		
		JButton btnNewButton = new JButton("<-- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HRactions HRA = new HRactions();
				HRA.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(175, 228, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Bet");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String hostel = choice.getSelectedItem();
				String name = textField.getText();
				@SuppressWarnings("deprecation")
				String passwd = passwordField.getText();
				User U = new User();
				Boolean temp = false;
				int first;
				switch (hostel){
				case "ah1":
					first = 0;
					break;
				case "ah2":
					first = 1;
					break;
				case "ah3":
					first = 2;
					break;
				case "ah4":
					first = 3;
					break;
				case "ah5":
					first = 4;
					break;
				case "ah6":
					first = 5;
					break;
				case "ah7":
					first = 6;
					break;
				case "ah8":
					first = 7;
					break;
				case "ch1":
					first = 8;
					break;
				case "ch2":
					first = 9;
					break;
				case "ch3":
					first = 10;
					break;
				case "ch4":
					first = 11;
					break;
				case "ch5":
					first = 12;
					break;
				case "ch6":
					first = 13;
					break;
					default:
						first = -1;
						break;
				}
				try {
					temp = U.hrLogin(passwd, hostel);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				File file = new File(name + ".txt");
				if(!temp){
					JOptionPane.showMessageDialog(null, "Wrong password");
				}
				else{
					if(!file.exists())
					{
						JOptionPane.showMessageDialog(null, "Event Doesn't exist");
					}
					else{
						ObjectInputStream objectInputStream = null;
						try {
							objectInputStream = new ObjectInputStream(new FileInputStream(name + ".txt"));
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							Events eventa = (Events) objectInputStream.readObject();
							eventa.setbetting(first);
							JOptionPane.showMessageDialog(null, "Bet is added");
							User.save();
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						try {
							objectInputStream.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
		btnNewButton_1.setBounds(175, 194, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(38, 125, 128, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hostel Name");
		lblNewLabel_3.setBounds(35, 100, 131, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		
	}

}
