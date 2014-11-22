package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class EMManageResults {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EMManageResults window = new EMManageResults();
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
	public EMManageResults() {
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
		
		JLabel lblNewLabel = new JLabel("Event Manager");
		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(159, 11, 134, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddResult AR = new AddResult();
				AR.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(159, 66, 119, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit Result");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EditResult ER = new EditResult();
				ER.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(159, 100, 119, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Result");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewEventResult VER = new ViewEventResult();
				VER.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(159, 134, 119, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Logout");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Zephyr EM = new Zephyr();
				EM.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(305, 227, 119, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Add Event Expenditure");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Expenditure Ex = new Expenditure();
				Ex.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_4.setBounds(128, 168, 197, 23);
		frame.getContentPane().add(btnNewButton_4);
	}

}
