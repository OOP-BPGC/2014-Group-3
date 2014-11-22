package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Canvas;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.io.IOException;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.Color;
import java.awt.SystemColor;

public class Register {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 709, 695);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("SWTOR Trajan", Font.BOLD, 18));
		lblNewLabel.setBounds(160, 11, 139, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter ID Number");
		lblNewLabel_1.setBounds(62, 63, 97, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(187, 60, 172, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final Choice choice = new Choice();
		choice.setBounds(271, 190, 51, 20);
		choice.add("0");
		choice.add("1");
		choice.add("2");
		choice.add("3");
		choice.add("4");
		choice.add("5");
		frame.getContentPane().add(choice);
		
		final Choice choice_1 = new Choice();
		choice_1.setBounds(372, 190, 46, 20);
		choice_1.add("S");
		choice_1.add("M");
		choice_1.add("L");
		choice_1.add("XL");
		choice_1.add("XXL");
		frame.getContentPane().add(choice_1);
		
		final Choice choice_2 = new Choice();
		choice_2.setBounds(271, 335, 51, 20);
		choice_2.add("0");
		choice_2.add("1");
		choice_2.add("2");
		choice_2.add("3");
		choice_2.add("4");
		choice_2.add("5");
		frame.getContentPane().add(choice_2);
		
		final Choice choice_3 = new Choice();
		choice_3.setBounds(372, 335, 46, 20);
		choice_3.add("S");
		choice_3.add("M");
		choice_3.add("L");
		choice_3.add("XL");
		choice_3.add("XXL");
		frame.getContentPane().add(choice_3);
		
		final Choice choice_4 = new Choice();
		choice_4.setBounds(271, 476, 51, 20);
		choice_4.add("0");
		choice_4.add("1");
		choice_4.add("2");
		choice_4.add("3");
		choice_4.add("4");
		choice_4.add("5");
		frame.getContentPane().add(choice_4);
		
		final Choice choice_5 = new Choice();
		choice_5.setBounds(372, 476, 46, 20);
		choice_5.add("S");
		choice_5.add("M");
		choice_5.add("L");
		choice_5.add("XL");
		choice_5.add("XXL");
		frame.getContentPane().add(choice_5);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Nights");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(191, 100, 97, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField.getText();
				boolean night = chckbxNewCheckBox.isSelected();
				String t1a = choice.getSelectedItem();
				String t1s = choice_1.getSelectedItem();
				String t2a = choice_2.getSelectedItem();
				String t2s = choice_3.getSelectedItem();
				String t3a = choice_4.getSelectedItem();
				String t3s = choice_5.getSelectedItem();
				int[] num = new int[3];
				num[0] = Integer.parseInt(t1a);
				num[1] = Integer.parseInt(t2a);
				num[2] = Integer.parseInt(t3a);
				String[] str = new String[3];
				str[0] = t1s;
				str[1] = t2s;
				str[2] = t3s;
					if(night){
							int temp = 0;
							try {
								temp = Registration.registerNight(id);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							if(temp == 2){
								JOptionPane.showMessageDialog(null, "ID already registered for night");
							}
							else if(temp ==1){
								JOptionPane.showMessageDialog(null, "Invalid ID");
							}
							else{
								JOptionPane.showMessageDialog(null, "Successfully Registered For night");
							}
					}
					int tempa = 0;
					try {
						tempa = Registration.registerTshirt(id, str, num);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(tempa == 2){
						JOptionPane.showMessageDialog(null, "ID already registered for selected T-shirt/s");
					}
					else if(tempa ==1){
						JOptionPane.showMessageDialog(null, "Invalid ID");
					}
					else{
						JOptionPane.showMessageDialog(null, "Successfully Registered For T-shirts");
					}

			}
		});
		btnNewButton.setBounds(271, 577, 122, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Zephyr Zeph = new Zephyr();
				Zeph.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(271, 622, 97, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("T-Shirt 1");
		lblNewLabel_2.setBounds(73, 165, 70, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("T-Shirt 2");
		lblNewLabel_3.setBounds(62, 308, 70, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("T-Shirt 3");
		lblNewLabel_4.setBounds(62, 454, 70, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Amount");
		lblNewLabel_5.setBounds(271, 130, 52, 29);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Size");
		lblNewLabel_6.setBounds(383, 130, 46, 29);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("Tshirt-2.jpg"));
		lblNewLabel_8.setBounds(62, 335, 157, 93);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("Tshirt-3.jpg"));
		lblNewLabel_9.setBounds(62, 482, 157, 93);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("Tshirt-1.jpg"));
		lblNewLabel_7.setBounds(62, 190, 157, 93);
		frame.getContentPane().add(lblNewLabel_7);
		
		
	}
	/*
	public Color getLblNewLabel_7Foreground() {
		return lblNewLabel_7.getForeground();
	}
	public void setLblNewLabel_7Foreground(Color foreground) {
		lblNewLabel_7.setForeground(foreground);
	}*/
}
