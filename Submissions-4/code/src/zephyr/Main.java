package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.ImageIcon;

public class Main {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome To Zephyr 2015");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 0, 398, 102);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {
					User.initialize();
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
				Zephyr Zeph = new Zephyr();
				Zeph.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(201, 322, 147, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("Zephyr_Logo.jpg"));
		lblNewLabel_1.setBounds(118, 89, 342, 204);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("About us");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AboutUs AU = new AboutUs();
				AU.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(452, 362, 98, 33);
		frame.getContentPane().add(btnNewButton_1);
	}

}
