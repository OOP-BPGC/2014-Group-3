package zephyr;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Convener {

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
					Convener window = new Convener();
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
	public Convener() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Britannic Bold", Font.PLAIN, 20));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Enter Password ");
		lblNewLabel.setBounds(38, 91, 106, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("<-- Back");
		btnNewButton.setBounds(165, 197, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Zephyr Zeph = new Zephyr();
				Zeph.frame.setVisible(true);
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setBounds(165, 158, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				@SuppressWarnings("deprecation")
				String password = passwordField.getText();
				User person = new User();
				boolean temp = person.convenerLogin(password);
				if (temp)
				{
					ConvenerActions CA = new ConvenerActions();
					CA.frame.setVisible(true);
					frame.setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(null, "Wrong Password");
				}
				
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Convener");
		lblNewLabel_1.setFont(new Font("Britannic Bold", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(165, 26, 149, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(165, 102, 191, 20);
		frame.getContentPane().add(passwordField);
		
	}
}
