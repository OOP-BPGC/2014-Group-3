package zephyr;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ViewSchedule {

    public JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSchedule window = new ViewSchedule();
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
	public ViewSchedule() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 505, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Schedule");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblNewLabel.setBounds(175, 11, 193, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(102, 69, 102, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(244, 67, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("View Schedule");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				File file = new File(name.toLowerCase() + ".txt");
				if(!file.exists()){
					JOptionPane.showMessageDialog(null, "Event Doesn't Exist");
				}
				else{
					ObjectInputStream objectInputStream;
					try {
						objectInputStream = new ObjectInputStream(new FileInputStream(name.toLowerCase() + ".txt"));
						Events event = (Events) objectInputStream.readObject();
						objectInputStream.close();
						String venue = event.getvenue().toString();
						int[][] time = new int[3][2];
						time = event.gettimings().clone();
						textField_1.setText(venue);
						textField_2.setText(Integer.toString(time[0][0]));
						textField_4.setText(Integer.toString(time[1][0]));
						textField_6.setText(Integer.toString(time[2][0]));
						textField_3.setText(Integer.toString(time[0][1]));
						textField_5.setText(Integer.toString(time[1][1]));
						textField_7.setText(Integer.toString(time[2][1]));
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        
				}
			}
		});
		btnNewButton.setBounds(175, 116, 148, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Venue");
		lblNewLabel_2.setBounds(102, 184, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 181, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DAY 1");
		lblNewLabel_3.setBounds(102, 270, 79, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(203, 267, 30, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(293, 267, 30, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(203, 310, 30, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(293, 310, 30, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(203, 357, 30, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(293, 357, 30, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel lblDay = new JLabel("DAY 2");
		lblDay.setBounds(102, 313, 46, 14);
		frame.getContentPane().add(lblDay);
		
		JLabel lblDay_1 = new JLabel("DAY 3");
		lblDay_1.setBounds(102, 360, 46, 14);
		frame.getContentPane().add(lblDay_1);
		
		JLabel lblNewLabel_4 = new JLabel("Time");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(244, 215, 46, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("From");
		lblNewLabel_5.setBounds(203, 243, 42, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("To");
		lblNewLabel_6.setBounds(293, 243, 30, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("<--- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Zephyr Zeph = new Zephyr();
				Zeph.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(203, 408, 120, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
