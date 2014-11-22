package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HRactions {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HRactions window = new HRactions();
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
	public HRactions() {
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
		
		JLabel lblNewLabel = new JLabel("Hostel Representative");
		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(145, 20, 181, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Betting Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddBettingDetails ABD = new AddBettingDetails();
				ABD.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(145, 124, 155, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Logout");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Zephyr Zeph = new Zephyr();
				Zeph.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(169, 228, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
