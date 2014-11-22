package zephyr;

import java.awt.Choice;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import zephyr.Events.category;
import zephyr.Events.venue;

public class EditEvent {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEvent window = new AddEvent();
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
	public EditEvent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 592, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Event");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(151, 11, 152, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(30, 52, 80, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(30, 81, 80, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Description");
		lblNewLabel_3.setBounds(30, 106, 80, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Category");
		lblNewLabel_4.setBounds(30, 141, 80, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Venue");
		lblNewLabel_5.setBounds(30, 166, 80, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Day1");
		lblNewLabel_6.setBounds(30, 191, 80, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(202, 49, 170, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(202, 103, 170, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(337, 188, 35, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("<--- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManageEvents ME = new ManageEvents();
				ME.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(214, 338, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		final Choice choice = new Choice();
		choice.setBounds(202, 135, 170, 20);
		choice.add("gold");
		choice.add("silver");
		choice.add("bronze");
		frame.getContentPane().add(choice);
		
		final Choice choice_1 = new Choice();
		choice_1.setBounds(202, 160, 170, 20);
		choice_1.add("c401");
		choice_1.add("c402");
		choice_1.add("c403");
		choice_1.add("lt1");
		choice_1.add("lt2");
		choice_1.add("audi");
		choice_1.add("sac");
		
		frame.getContentPane().add(choice_1);
		JLabel lblNewLabel_7 = new JLabel("from");
		lblNewLabel_7.setBounds(202, 191, 35, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("to");
		lblNewLabel_8.setBounds(307, 191, 20, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_3 = new JTextField();
		textField_3.setBounds(257, 188, 35, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Edit Event");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
				String desc = textField_2.getText();
				String tf1 = textField_3.getText();
				String tt1 = textField_5.getText();
				String tf2 = textField_1.getText();
				String tt2 = textField_6.getText();
				String tf3 = textField_4.getText();
				String tt3 = textField_7.getText();
				String s7 = choice.getSelectedItem();
				String s8 = choice_1.getSelectedItem();
				int i1 = 0, i3 = 0, i4 = 0, i5 = 0, i6 = 0, i7 = 0;
				int flag = 0;
				try{
				i1 = Integer.parseInt(tf1);
				i3 = Integer.parseInt(tt1);
				i4 = Integer.parseInt(tf2);
				i5 = Integer.parseInt(tt2);
				i6 = Integer.parseInt(tf3);
				i7 = Integer.parseInt(tt3);
				}
				catch(NumberFormatException nfe){
					flag = 1;
				}
				boolean checka = false;
				try {
					checka = Events.deleteEvent(name);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (CloneNotSupportedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(!checka){
					JOptionPane.showMessageDialog(null, "Event Doesn't exist");
				}
				else{
				Events Event = new Events(name);
				if ((i1 >= i3)||(i3 >= 24)||(flag == 1)||(i4 >= i5)||(i5 >= 24)||(i6 >= i7)||(i7 >= 24)){
					JOptionPane.showMessageDialog(null, "Wrong time entry");
				}
				else{
				if(s7.equals(category.gold.toString())){
					Event.setcategory(category.gold);
				}
				if(s7.equals(category.silver.toString())){
					Event.setcategory(category.silver);
				}
				if (s7.equals(category.bronze.toString())){
					Event.setcategory(category.bronze);
				}
				Event.setpasswd(passwd);
				Event.setdes(desc);
				int[][] temp = new int[3][2];
				
				temp[0][0] = i1;
				temp[0][1] = i3;
				temp[1][0] = i4;
				temp[1][1] = i5;
				temp[2][0] = i6;
				temp[2][1] = i7;
				boolean check = false;
				if(s8.equals(venue.audi.toString())){
					check = Event.setvenuetime(venue.audi, temp);
				}
				if(s8.equals(venue.c401.toString())){
					check = Event.setvenuetime(venue.c401, temp);
				}
				if(s8.equals(venue.c402.toString())){
					check = Event.setvenuetime(venue.c402, temp);
				}
				if(s8.equals(venue.c403.toString())){
					check = Event.setvenuetime(venue.c403, temp);
				}
				if(s8.equals(venue.lt1.toString())){
					check = Event.setvenuetime(venue.lt1, temp);
				}
				if(s8.equals(venue.lt2.toString())){
					check = Event.setvenuetime(venue.lt2, temp);
				}
				if(s8.equals(venue.sac.toString())){
					check = Event.setvenuetime(venue.sac, temp);
				}
				if(!check){
					
					JOptionPane.showMessageDialog(null, "Time clashes with another event");
				}
				else{
					try {
						Events.addEventFile(Event);
					} catch (IOException e) {
						e.printStackTrace();
					}
					try {
						User.save();
					} catch (ClassNotFoundException | IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					JOptionPane.showMessageDialog(null, "Event Edited");
					ManageEvents ME = new ManageEvents();
					ME.frame.setVisible(true);
					frame.setVisible(false);
				}
				
				}
			}
			}
		});
		btnNewButton_1.setBounds(202, 304, 126, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(202, 78, 170, 20);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_10 = new JLabel("Day2");
		lblNewLabel_10.setBounds(30, 224, 66, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Day3");
		lblNewLabel_11.setBounds(30, 256, 66, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel label = new JLabel("from");
		label.setBounds(202, 221, 35, 20);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("from");
		label_1.setBounds(202, 256, 35, 14);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(257, 221, 35, 20);
		frame.getContentPane().add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(257, 253, 35, 20);
		frame.getContentPane().add(textField_4);
		
		JLabel label_2 = new JLabel("to");
		label_2.setBounds(307, 224, 20, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("to");
		label_3.setBounds(307, 256, 20, 14);
		frame.getContentPane().add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(337, 221, 35, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(337, 253, 35, 20);
		frame.getContentPane().add(textField_7);
		
		
	}
}
