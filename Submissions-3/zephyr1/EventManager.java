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
//public class EventManager {
//
//	public JFrame frame;
//	private JTextField textField;
//	private JTextField textField_1;
//	private JButton btnNewButton;
//	private JButton btnNewButton_1;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EventManager window = new EventManager();
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
//	public EventManager() {
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
//		lblNewLabel.setBounds(177, 11, 133, 32);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("Enter Event Name");
//		lblNewLabel_1.setBounds(44, 88, 104, 17);
//		frame.getContentPane().add(lblNewLabel_1);
//		
//		JLabel lblNewLabel_2 = new JLabel("Enter Password");
//		lblNewLabel_2.setBounds(44, 148, 104, 17);
//		frame.getContentPane().add(lblNewLabel_2);
//		
//		textField = new JTextField();
//		textField.setBounds(198, 85, 184, 20);
//		frame.getContentPane().add(textField);
//		textField.setColumns(10);
//		
//		textField_1 = new JTextField();
//		textField_1.setBounds(198, 145, 184, 20);
//		frame.getContentPane().add(textField_1);
//		textField_1.setColumns(10);
//		
//		btnNewButton = new JButton("<-- Back");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				Zephyr Zeph = new Zephyr();
//				Zeph.frame.setVisible(true);
//			}
//		});
//		btnNewButton.setBounds(198, 212, 89, 23);
//		frame.getContentPane().add(btnNewButton);
//		
//		btnNewButton_1 = new JButton("Login");
//		btnNewButton_1.setBounds(198, 176, 89, 23);
//		frame.getContentPane().add(btnNewButton_1);
//	}
//
//}
