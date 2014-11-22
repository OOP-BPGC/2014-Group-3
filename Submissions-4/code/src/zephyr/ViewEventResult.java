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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ViewEventResult {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewEventResult window = new ViewEventResult();
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
	public ViewEventResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 480, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View Event Result");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(107, 11, 268, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event Name");
		lblNewLabel_1.setBounds(29, 68, 86, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(165, 65, 147, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("1st Position");
		lblNewLabel_2.setBounds(65, 155, 71, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("2nd Position");
		lblNewLabel_3.setBounds(65, 186, 71, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("3rd Position");
		lblNewLabel_4.setBounds(65, 217, 71, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 152, 131, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(199, 183, 131, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(199, 214, 131, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("View Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				int[] winners = new int[3];
				File file = new File(name+"result.txt");
				if(!file.exists()){
					JOptionPane.showMessageDialog(null, "File doesn't exist");
				}
				else{
					try {
						winners = Result.viewEventResult(name);
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
					String first,second,third;
					switch (winners[0]){
					case 0:
						first = "ah1";
						break;
					case 1:
						first = "ah2";
						break;
					case 2:
						first = "ah3";
						break;
					case 3:
						first = "ah4";
						break;
					case 4:
						first = "ah5";
						break;
					case 5:
						first = "ah6";
						break;
					case 6:
						first = "ah7";
						break;
					case 7:
						first = "ah8";
						break;
					case 8:
						first = "ch1";
						break;
					case 9:
						first = "ch2";
						break;
					case 10:
						first = "ch3";
						break;
					case 11:
						first = "ch4";
						break;
					case 12:
						first = "ch5";
						break;	
					case 13:
						first = "ch6";
						break;
					default:
							first = "0";
							break;
					}
					switch (winners[1]){
					case 0:
						second = "ah1";
						break;
					case 1:
						second = "ah2";
						break;
					case 2:
						second = "ah3";
						break;
					case 3:
						second = "ah4";
						break;
					case 4:
						second = "ah5";
						break;
					case 5:
						second = "ah6";
						break;
					case 6:
						second = "ah7";
						break;
					case 7:
						second = "ah8";
						break;
					case 8:
						second = "ch1";
						break;
					case 9:
						second = "ch2";
						break;
					case 10:
						second = "ch3";
						break;
					case 11:
						second = "ch4";
						break;
					case 12:
						second = "ch5";
						break;	
					case 13:
						second = "ch6";
						break;
					default:
						second = "0";
							break;
					}
					switch (winners[2]){
					case 0:
						third = "ah1";
						break;
					case 1:
						third = "ah2";
						break;
					case 2:
						third = "ah3";
						break;
					case 3:
						third = "ah4";
						break;
					case 4:
						third = "ah5";
						break;
					case 5:
						third = "ah6";
						break;
					case 6:
						third = "ah7";
						break;
					case 7:
						third = "ah8";
						break;
					case 8:
						third = "ch1";
						break;
					case 9:
						third = "ch2";
						break;
					case 10:
						third = "ch3";
						break;
					case 11:
						third = "ch4";
						break;
					case 12:
						third = "ch5";
						break;	
					case 13:
						third = "ch6";
						break;
					default:
						third = "0";
							break;
					}
					textField_1.setText(first);
					textField_2.setText(second);
					textField_3.setText(third);
				}
				
			}
		});
		btnNewButton.setBounds(134, 110, 103, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EMManageResults EMR = new EMManageResults();
				EMR.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(176, 265, 103, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
