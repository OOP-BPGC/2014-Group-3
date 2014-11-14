//package zephyr;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import java.awt.Font;
//import javax.swing.JButton;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//
//public class ConvenerActions {
//
//	public JFrame frame;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ConvenerActions window = new ConvenerActions();
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
//	public ConvenerActions() {
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
//		JLabel lblNewLabel = new JLabel("Actions");
//		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
//		lblNewLabel.setBounds(180, 21, 139, 38);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JButton btnNewButton = new JButton("Manage Events");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				ManageEvents ME = new ManageEvents();
//				ME.frame.setVisible(true);
//			}
//		});
//		btnNewButton.setBounds(161, 81, 126, 23);
//		frame.getContentPane().add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("Manage Results");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				ManageResults MR = new ManageResults();
//				MR.frame.setVisible(true);
//			}
//		});
//		btnNewButton_1.setBounds(161, 141, 126, 23);
//		frame.getContentPane().add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("Logout");
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				Zephyr Con = new Zephyr();
//				Con.frame.setVisible(true);
//			}
//		});
//		btnNewButton_2.setBounds(161, 201, 126, 23);
//		frame.getContentPane().add(btnNewButton_2);
//	}
//
//}
