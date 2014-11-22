package zephyr;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CancelEvent {

	public JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CancelEvent window = new CancelEvent();
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
	public CancelEvent() {
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
		
		JLabel lblNewLabel = new JLabel("Cancel Event");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(160, 11, 152, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Event Name");
		lblNewLabel_1.setBounds(31, 82, 86, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(178, 82, 187, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = textField.getText();
				boolean t = false;
				try {
						t = Events.deleteEvent(s1);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(t){
					JOptionPane.showMessageDialog(null, "Event Cancelled");
					ManageEvents MR = new ManageEvents();
					MR.frame.setVisible(true);
					frame.setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(null, "File doesn't exist");
				}
				
			}
		});
		btnNewButton.setBounds(160, 152, 100, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<--- Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManageEvents MR = new ManageEvents();
				MR.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(160, 198, 100, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
