//package zephyr;
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import java.awt.BorderLayout;
//import javax.swing.SwingConstants;
//import java.awt.Color;
//import java.awt.Font;
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//
//public class Zephyr {
//
//	 public JFrame frame;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Zephyr window = new Zephyr();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public Zephyr() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.setBounds(100, 100, 450, 300);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("ZEPHYR 2015");
//		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 17));
//		lblNewLabel.setBounds(146, 11, 198, 39);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JButton btnNewButton = new JButton("Login as Convener");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				Convener con = new Convener();
//				con.frame.setVisible(true);
//			}
//		});
//		btnNewButton.setBounds(107, 61, 198, 23);
//		frame.getContentPane().add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("Login as Event Manager");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				EventManager EM = new EventManager();
//				EM.frame.setVisible(true);
//			}
//		});
//		btnNewButton_1.setBounds(107, 95, 198, 23);
//		frame.getContentPane().add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("Login as Hostel Rep");
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				HostelRep HR = new HostelRep();
//				HR.frame.setVisible(true);
//			}
//		});
//		btnNewButton_2.setBounds(107, 129, 198, 23);
//		frame.getContentPane().add(btnNewButton_2);
//		
//		JButton btnNewButton_3 = new JButton("View Final Result");
//		btnNewButton_3.setBounds(107, 163, 198, 23);
//		frame.getContentPane().add(btnNewButton_3);
//		
//		JButton btnNewButton_4 = new JButton("View Schedule");
//		btnNewButton_4.setBounds(107, 200, 198, 23);
//		frame.getContentPane().add(btnNewButton_4);
//	}
//}
