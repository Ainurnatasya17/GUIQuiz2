package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 window = new Quiz2();
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
	public Quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 153));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHowMuchWater = new JLabel("How much water should I drink?");
		lblHowMuchWater.setForeground(new Color(204, 153, 51));
		lblHowMuchWater.setHorizontalAlignment(SwingConstants.CENTER);
		lblHowMuchWater.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblHowMuchWater.setBounds(30, 32, 378, 52);
		frame.getContentPane().add(lblHowMuchWater);
		
		JLabel lblWeight = new JLabel("My Weight (KG):");
		lblWeight.setForeground(new Color(153, 153, 0));
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblWeight.setBounds(79, 113, 134, 31);
		frame.getContentPane().add(lblWeight);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(226, 112, 134, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnTellMe = new JButton("Tell Me");
		btnTellMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double weight;
				double water;
				
					try {
							weight = Double.parseDouble(textField.getText());
							water = weight * 0.033;
							JOptionPane.showMessageDialog(null, "Buddy, you should drink " + water + " L of water in a day!!");
							
				} catch (Exception a) {
						
						JOptionPane.showMessageDialog(null, "Plese Enter Valid Number");
						
				}
					
			}
		});
		btnTellMe.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTellMe.setBackground(new Color(255, 153, 153));
		btnTellMe.setBounds(163, 186, 123, 31);
		frame.getContentPane().add(btnTellMe);
	}

}
