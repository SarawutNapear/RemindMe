import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class DocRemind {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DocRemind window = new DocRemind();
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
	public DocRemind() {
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
		
		textField = new JTextField();
		textField.setBounds(160, 11, 178, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(160, 42, 178, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblDocumentNumber = new JLabel("Document Number :");
		lblDocumentNumber.setBounds(10, 14, 95, 14);
		frame.getContentPane().add(lblDocumentNumber);
		
		JLabel lblDocumentExpeditedate = new JLabel("Document ExpediteDate :");
		lblDocumentExpeditedate.setBounds(10, 46, 140, 14);
		frame.getContentPane().add(lblDocumentExpeditedate);
	}
}
