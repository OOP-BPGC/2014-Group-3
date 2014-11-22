package zephyr;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Zephyr {

	 public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zephyr window = new Zephyr();
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
	public Zephyr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login as Convener");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Convener con = new Convener();
				con.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(107, 61, 198, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login as Event Manager");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventManager EM = new EventManager();
				EM.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(107, 95, 198, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Login as Hostel Rep");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HostelRep HR = new HostelRep();
				HR.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(107, 129, 198, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View Final Result");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewFinalResult VFR = new ViewFinalResult();
				VFR.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(107, 163, 198, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("View Schedule");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewSchedule VS = new ViewSchedule();
				VS.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_4.setBounds(107, 200, 198, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Registration");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Register Regex = new Register();
				Regex.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_5.setBounds(107, 234, 198, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("Zephyr.jpg"));
		lblNewLabel_1.setBounds(165, 11, 61, 45);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
