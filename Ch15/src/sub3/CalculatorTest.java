package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("굴림", Font.BOLD, 16));
		textField.setEditable(false);
		textField.setText("0");
		textField.setBounds(12, 10, 273, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton.setBounds(12, 70, 60, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_1.setBounds(84, 70, 60, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_2.setBounds(155, 70, 60, 60);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_3.setBounds(227, 70, 60, 60);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_4.setBounds(12, 140, 60, 60);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_5.setBounds(84, 140, 60, 60);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_6.setBounds(155, 140, 60, 60);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("*");
		btnNewButton_7.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_7.setBounds(227, 140, 60, 60);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_8.setBounds(12, 210, 60, 60);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_9.setBounds(84, 210, 60, 60);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_10.setBounds(155, 210, 60, 60);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_11.setBounds(227, 210, 60, 60);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_12.setBounds(12, 280, 60, 60);
		contentPane.add(btnNewButton_12);
		
		JButton btnC = new JButton("c");
		btnC.setFont(new Font("굴림", Font.PLAIN, 16));
		btnC.setBounds(84, 280, 60, 60);
		contentPane.add(btnC);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_14.setBounds(155, 280, 60, 60);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_15.setBounds(227, 280, 60, 60);
		contentPane.add(btnNewButton_15);
	}
}
