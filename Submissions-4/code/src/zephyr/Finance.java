package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Finance {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Finance window = new Finance();
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
	public Finance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Financial Status");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(107, 11, 182, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event Name");
		lblNewLabel_1.setBounds(73, 56, 94, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(203, 53, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Net Revenue");
		lblNewLabel_2.setBounds(99, 144, 94, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Event Expenditure");
		lblNewLabel_3.setBounds(85, 181, 108, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(203, 141, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(203, 178, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("View Expenditure");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField.getText();
				File file = new File(name.toLowerCase() + ".txt");
				if(!file.exists()){
					JOptionPane.showMessageDialog(null, "Event Doesn't exist");
				}
				else{
					ObjectInputStream objectInputStream = null;
					try {
						objectInputStream = new ObjectInputStream(new FileInputStream(name.toLowerCase() + ".txt"));
						Events event = (Events) objectInputStream.readObject();
						objectInputStream.close();
						int exp = event.getexpenditure();
						int rev = User.revenue;
						textField_2.setText(Integer.toString(exp));
						textField_1.setText(Integer.toString(rev));
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
		btnNewButton.setBounds(107, 96, 140, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConvenerActions CA = new ConvenerActions();
				CA.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(121, 247, 108, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
