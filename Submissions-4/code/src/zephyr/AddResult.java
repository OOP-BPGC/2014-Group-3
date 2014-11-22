package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.Choice;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AddResult {

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
					AddResult window = new AddResult();
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
	public AddResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 486, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Result");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(155, 11, 148, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event Name");
		lblNewLabel_1.setBounds(31, 83, 89, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(31, 115, 73, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("1st Position");
		lblNewLabel_3.setBounds(94, 163, 82, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("2nd Position");
		lblNewLabel_4.setBounds(94, 188, 82, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("3rd Position");
		lblNewLabel_5.setBounds(94, 213, 67, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(194, 83, 199, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(194, 112, 199, 20);
		frame.getContentPane().add(passwordField);
		
		final Choice choice = new Choice();
		choice.setBounds(193, 157, 89, 20);
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
		
		final Choice choice_1 = new Choice();
		choice_1.setBounds(193, 183, 89, 20);
		choice_1.add("ah1");
		choice_1.add("ah2");
		choice_1.add("ah3");
		choice_1.add("ah4");
		choice_1.add("ah5");
		choice_1.add("ah6");
		choice_1.add("ah7");
		choice_1.add("ah8");
		choice_1.add("ch1");
		choice_1.add("ch2");
		choice_1.add("ch3");
		choice_1.add("ch4");
		choice_1.add("ch5");
		choice_1.add("ch6");
		frame.getContentPane().add(choice_1);
		
		final Choice choice_2 = new Choice();
		choice_2.setBounds(194, 207, 88, 20);
		choice_2.add("ah1");
		choice_2.add("ah2");
		choice_2.add("ah3");
		choice_2.add("ah4");
		choice_2.add("ah5");
		choice_2.add("ah6");
		choice_2.add("ah7");
		choice_2.add("ah8");
		choice_2.add("ch1");
		choice_2.add("ch2");
		choice_2.add("ch3");
		choice_2.add("ch4");
		choice_2.add("ch5");
		choice_2.add("ch6");
		frame.getContentPane().add(choice_2);
		
		JButton btnNewButton = new JButton("Add Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				try {
					User.initialize();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				String name = textField.getText();
				@SuppressWarnings("deprecation")
				String passwd = passwordField.getText();
				String one = choice.getSelectedItem();
				String two = choice_1.getSelectedItem();
				String three = choice_2.getSelectedItem();
				int first, second, third;
				if((one.equals(two))||(two.equals(three))||(one.equals(three))){
					JOptionPane.showMessageDialog(null, "Invalid result");
				}
				else{
					switch (one){
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
					switch (two){
					case "ah1":
						second = 0;
						break;
					case "ah2":
						second = 1;
						break;
					case "ah3":
						second = 2;
						break;
					case "ah4":
						second = 3;
						break;
					case "ah5":
						second = 4;
						break;
					case "ah6":
						second = 5;
						break;
					case "ah7":
						second = 6;
						break;
					case "ah8":
						second = 7;
						break;
					case "ch1":
						second = 8;
						break;
					case "ch2":
						second = 9;
						break;
					case "ch3":
						second = 10;
						break;
					case "ch4":
						second = 11;
						break;
					case "ch5":
						second = 12;
						break;
					case "ch6":
						second = 13;
						break;
					default:
						second = -1;
						break;
					}
					switch (three){
					case "ah1":
						third = 0;
						break;
					case "ah2":
						third = 1;
						break;
					case "ah3":
						third = 2;
						break;
					case "ah4":
						third = 3;
						break;
					case "ah5":
						third = 4;
						break;
					case "ah6":
						third = 5;
						break;
					case "ah7":
						third = 6;
						break;
					case "ah8":
						third = 7;
						break;
					case "ch1":
						third = 8;
						break;
					case "ch2":
						third = 9;
						break;
					case "ch3":
						third = 10;
						break;
					case "ch4":
						third = 11;
						break;
					case "ch5":
						third = 12;
						break;
					case "ch6":
						third = 13;
						break;
					default:
						third = -1;
						break;
					}
					File file = new File(name.toLowerCase()+".txt");
					if(file.exists()){
						ObjectInputStream objectInputStream2 = null;
						try {
							objectInputStream2 = new ObjectInputStream(new FileInputStream(name.toLowerCase() + ".txt"));
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						}
				        Events eve = null;
						try {
							eve = (Events) objectInputStream2.readObject();
						} catch (ClassNotFoundException e) {

							e.printStackTrace();
						} catch (IOException e) {

							e.printStackTrace();
						}
				        if(eve.getpassword().equals(passwd)){
				        	try {
								Result.addEventResult(name, first, second, third);
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (ClassNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (CloneNotSupportedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				        	JOptionPane.showMessageDialog(null, "Result Added");
				        	EMManageResults EMR = new EMManageResults();
				        	try {
								User.save();
							} catch (ClassNotFoundException | IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				        	EMR.frame.setVisible(true);
				        	frame.setVisible(false);
				        }
				        else{
				        	JOptionPane.showMessageDialog(null, "Invalid password");
				        }
					}
					else{
						JOptionPane.showMessageDialog(null, "Invalid Event name");
					}
				}
			}
		});
		btnNewButton.setBounds(163, 255, 140, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EMManageResults EMR = new EMManageResults();
				EMR.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(197, 300, 106, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
