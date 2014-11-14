//package zephyr;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import java.awt.Font;
//import javax.swing.JTextField;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//
//public class AddBettingDetails {
//
//	public JFrame frame;
//	private JTextField textField;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddBettingDetails window = new AddBettingDetails();
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
//	public AddBettingDetails() {
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
//		JLabel lblNewLabel = new JLabel("Add Betting Details");
//		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
//		lblNewLabel.setBounds(126, 28, 173, 23);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("Enter Event Name");
//		lblNewLabel_1.setBounds(34, 120, 128, 14);
//		frame.getContentPane().add(lblNewLabel_1);
//		
//		textField = new JTextField();
//		textField.setBounds(206, 117, 158, 20);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		JButton btnNewButton = new JButton("<-- Back");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				HRactions HRA = new HRactions();
//				HRA.frame.setVisible(true);
//			}
//		});
//		btnNewButton.setBounds(175, 228, 89, 23);
//		frame.getContentPane().add(btnNewButton);
//	}
//
//}
