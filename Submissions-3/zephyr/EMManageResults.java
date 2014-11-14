//package zephyr;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JButton;
//import java.awt.Font;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//
//public class EMManageResults {
//
//	private JFrame frame;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EMManageResults window = new EMManageResults();
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
//	public EMManageResults() {
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
//		JLabel lblNewLabel = new JLabel("Event Manager");
//		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
//		lblNewLabel.setBounds(159, 11, 134, 30);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JButton btnNewButton = new JButton("Add Result");
//		btnNewButton.setBounds(159, 66, 119, 23);
//		frame.getContentPane().add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("Edit Result");
//		btnNewButton_1.setBounds(159, 100, 119, 23);
//		frame.getContentPane().add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("View Result");
//		btnNewButton_2.setBounds(159, 134, 119, 23);
//		frame.getContentPane().add(btnNewButton_2);
//		
//		JButton btnNewButton_3 = new JButton("Logout");
//		btnNewButton_3.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				Zephyr EM = new Zephyr();
//				EM.frame.setVisible(true);
//			}
//		});
//		btnNewButton_3.setBounds(159, 228, 89, 23);
//		frame.getContentPane().add(btnNewButton_3);
//	}
//
//}
