package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ManageResults {

	public JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageResults window = new ManageResults();
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
	public ManageResults() {
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
		
		JLabel lblNewLabel = new JLabel("Manage Results");
		lblNewLabel.setFont(new Font("Adobe Garamond Pro Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(136, 22, 159, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CAddResult CAR = new CAddResult();
				CAR.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton.setBounds(164, 62, 131, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Edit Result");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CEditResult CAR = new CEditResult();
				CAR.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(164, 96, 131, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("View Result");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CViewEventResult CVER = new CViewEventResult();
				CVER.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_2.setBounds(164, 130, 131, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("<-- Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ConvenerActions CA = new ConvenerActions();
				CA.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_3.setBounds(164, 210, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
	}

}
