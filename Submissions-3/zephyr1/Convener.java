//package zephyr;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//
//import com.jgoodies.forms.factories.DefaultComponentFactory;
//
//import java.awt.Font;
//
//import javax.swing.JTextField;
//import javax.swing.JButton;
//
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//
//
//public class Convener {
//
//	public JFrame frame;
//	private JTextField textField;
//	private JTextField textField_1;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Convener window = new Convener();
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
//	public Convener() {
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
//		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Convener");
//		lblNewJgoodiesTitle.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
//		lblNewJgoodiesTitle.setBounds(184, 21, 179, 28);
//		frame.getContentPane().add(lblNewJgoodiesTitle);
//		
//		JLabel lblNewLabel = new JLabel("Enter Password ");
//		lblNewLabel.setBounds(38, 91, 106, 42);
//		frame.getContentPane().add(lblNewLabel);
//		
//		textField_1 = new JTextField();
//		textField_1.setBounds(184, 98, 179, 28);
//		frame.getContentPane().add(textField_1);
//		textField_1.setColumns(10);
//		
//		JButton btnNewButton = new JButton("<-- Back");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				Zephyr Zeph = new Zephyr();
//				Zeph.frame.setVisible(true);
//			}
//		});
//		btnNewButton.setBounds(165, 197, 89, 23);
//		frame.getContentPane().add(btnNewButton);
//		
//		JButton btnNewButton_1 = new JButton("Login");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				String password = textField_1.getText();
//				User person = new User();
//				boolean temp = person.convenerLogin(password);
//				if (temp)
//				{
//					ConvenerActions CA = new ConvenerActions();
//					CA.frame.setVisible(true);
//				}
//				else{
//					JOptionPane.showMessageDialog(null, "Wrong Password");
//				}
//				
//			}
//		});
//		btnNewButton_1.setBounds(165, 158, 89, 23);
//		frame.getContentPane().add(btnNewButton_1);
//		
//	}
//}
