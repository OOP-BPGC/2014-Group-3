package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class ViewFinalResult {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFinalResult window = new ViewFinalResult();
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
	public ViewFinalResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Result");
		lblNewLabel.setFont(new Font("SWTOR Trajan", Font.BOLD, 18));
		lblNewLabel.setBounds(157, 11, 110, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("<--- Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Zephyr Zeph = new Zephyr();
				Zeph.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(178, 487, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Get Result");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[][] hostelarray = new String[14][4];
				try {
					hostelarray = Hostel.gethostelarray();
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int max = -1000;
				int maxi = -1;
				for(int i = 0; i < 14; i++){
					if(Integer.parseInt(hostelarray[i][3]) > max){
						maxi = i;
						max = Integer.parseInt(hostelarray[i][3]);
					}
				}
				String host = null;
				if (maxi <= 7){
					int temp = maxi + 1;
					host = "AH" + temp;
				}
				if (maxi > 7){
					int tempa = maxi - 7;
					host = "CH" + tempa;
				}
				textField.setText(host);
				textField_15.setText(Integer.toString(max));
				textField_14.setText(hostelarray[0][3]);
				textField_13.setText(hostelarray[1][3]);
				textField_12.setText(hostelarray[2][3]);
				textField_11.setText(hostelarray[3][3]);
				textField_10.setText(hostelarray[4][3]);
				textField_9.setText(hostelarray[5][3]);
				textField_8.setText(hostelarray[6][3]);
				textField_7.setText(hostelarray[7][3]);
				textField_6.setText(hostelarray[8][3]);
				textField_5.setText(hostelarray[9][3]);
				textField_4.setText(hostelarray[10][3]);
				textField_3.setText(hostelarray[11][3]);
				textField_2.setText(hostelarray[12][3]);
				textField_1.setText(hostelarray[13][3]);
			}
		});
		btnNewButton_1.setBounds(157, 36, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Leader");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_1.setBounds(81, 72, 58, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Point Tally");
		lblNewLabel_2.setFont(new Font("Perpetua", Font.BOLD, 16));
		lblNewLabel_2.setBounds(157, 99, 89, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AH 2");
		lblNewLabel_3.setBounds(81, 150, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("AH 3");
		lblNewLabel_4.setBounds(81, 175, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("AH 4");
		lblNewLabel_5.setBounds(81, 200, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("AH 5");
		lblNewLabel_6.setBounds(81, 225, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("AH 6");
		lblNewLabel_7.setBounds(81, 250, 46, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("AH 7");
		lblNewLabel_8.setBounds(81, 275, 46, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("AH 8");
		lblNewLabel_9.setBounds(81, 300, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("CH 1");
		lblNewLabel_10.setBounds(81, 325, 46, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("CH 2");
		lblNewLabel_11.setBounds(81, 350, 46, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("CH 3");
		lblNewLabel_12.setBounds(81, 375, 46, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("CH 4");
		lblNewLabel_13.setBounds(81, 400, 46, 14);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("CH 5");
		lblNewLabel_14.setBounds(81, 425, 46, 14);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("CH 6");
		lblNewLabel_15.setBounds(81, 450, 46, 14);
		frame.getContentPane().add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("AH 1");
		lblNewLabel_16.setBounds(81, 125, 46, 14);
		frame.getContentPane().add(lblNewLabel_16);
		
		textField = new JTextField();
		textField.setBounds(157, 70, 61, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(157, 447, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(157, 422, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(157, 397, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(157, 372, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(157, 347, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(157, 322, 86, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(157, 297, 86, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(157, 272, 86, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(157, 247, 86, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(157, 222, 86, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(157, 197, 86, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(157, 172, 86, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(157, 147, 86, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(157, 122, 86, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBounds(228, 70, 86, 20);
		frame.getContentPane().add(textField_15);
		textField_15.setColumns(10);
	}

}
