import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class test {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
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
	public test() {
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
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setText("Clicked here");
			}
		});
		btnNewButton.setBounds(10, 67, 133, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(139, 11, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(10, 14, 119, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 39, 119, 14);
		frame.getContentPane().add(lblPassword);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 36, 86, 20);
		frame.getContentPane().add(textField_1);
	}
}
