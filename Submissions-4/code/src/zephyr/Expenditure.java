package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Expenditure {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Expenditure window = new Expenditure();
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
	public Expenditure() {
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
		
		JLabel lblNewLabel = new JLabel("Expenditure");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 24));
		lblNewLabel.setBounds(132, 11, 198, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event Name");
		lblNewLabel_1.setBounds(73, 69, 74, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(212, 66, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(73, 100, 67, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 128, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Expenditure");
		lblNewLabel_3.setBounds(73, 131, 74, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Add Expenditure");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				@SuppressWarnings("deprecation")
				String passwd = passwordField.getText();
				String exp = textField_1.getText();
				int num = 0;
				int flag = 0;
				try{
				num = Integer.parseInt(exp);
				}
				catch(NumberFormatException nfe){
					JOptionPane.showMessageDialog(null, "Invalid Expenditure input: Expected Integer");
					flag = 1;
				}
				File file = new File(name.toLowerCase() + ".txt");
				if((!file.exists()) || flag == 1){
					if(!file.exists()){
					JOptionPane.showMessageDialog(null, "No Such Event");
					}
				}
				else{
					User U = new User();
					boolean temp = false;
					try {
						temp = U.emLogin(passwd, name);
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
					if(!temp){
						JOptionPane.showMessageDialog(null, "Wrong Password");
					}
					else{
						try {
							Events.addexpenditure(name, num);
							EMManageResults EMMR = new EMManageResults();
							EMMR.frame.setVisible(true);
							frame.setVisible(false);
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		});
		btnNewButton.setBounds(165, 176, 133, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EMManageResults EMMR = new EMManageResults();
				EMMR.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(165, 210, 86, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(212, 97, 86, 20);
		frame.getContentPane().add(passwordField);
	}

}
