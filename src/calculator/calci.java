package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calci {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial Narrow", Font.BOLD, 17));
		frame.setBounds(100, 100, 384, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 28));
		textField.setBounds(21, 10, 331, 85);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backspace=str.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBackspace.setBackground(new Color(255, 255, 255));
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 37));
		btnBackspace.setBounds(21, 115, 85, 73);
		frame.getContentPane().add(btnBackspace);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBackground(new Color(192, 192, 192));
		btn7.setFont(new Font("Arial", Font.BOLD, 30));
		btn7.setBounds(21, 186, 85, 73);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(192, 192, 192));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 30));
		btn4.setBounds(21, 254, 85, 73);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBackground(new Color(192, 192, 192));
		btn1.setFont(new Font("Arial", Font.BOLD, 30));
		btn1.setBounds(21, 321, 85, 73);
		frame.getContentPane().add(btn1);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBackground(new Color(192, 192, 192));
		btn8.setFont(new Font("Arial", Font.BOLD, 30));
		btn8.setBounds(104, 186, 85, 73);
		frame.getContentPane().add(btn8);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBackground(new Color(255, 255, 255));
		btnClear.setFont(new Font("Arial Narrow", Font.BOLD, 37));
		btnClear.setBounds(104, 115, 85, 73);
		frame.getContentPane().add(btnClear);
		
		final JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(192, 192, 192));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 30));
		btn2.setBounds(104, 324, 85, 70);
		frame.getContentPane().add(btn2);
		
		JButton btn00 = new JButton("00");
		btn00.setBackground(new Color(255, 255, 255));
		btn00.setForeground(new Color(0, 0, 0));
		btn00.setFont(new Font("Arial Narrow", Font.BOLD, 36));
		btn00.setBounds(184, 115, 85, 73);
		frame.getContentPane().add(btn00);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBackground(new Color(192, 192, 192));
		btn5.setFont(new Font("Arial", Font.BOLD, 30));
		btn5.setBounds(104, 257, 85, 70);
		frame.getContentPane().add(btn5);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setBackground(new Color(192, 192, 192));
		btnDot.setFont(new Font("Arial Narrow", Font.BOLD, 40));
		btnDot.setBounds(104, 389, 85, 73);
		frame.getContentPane().add(btnDot);
		
		final JButton btn0 = new JButton("0");
		btn0.setBackground(new Color(192, 192, 192));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Arial", Font.BOLD, 30));
		btn0.setBounds(21, 389, 85, 73);
		frame.getContentPane().add(btn0);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBackground(new Color(192, 192, 192));
		btn9.setFont(new Font("Arial", Font.BOLD, 30));
		btn9.setBounds(184, 186, 85, 73);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBackground(new Color(192, 192, 192));
		btn6.setFont(new Font("Arial", Font.BOLD, 30));
		btn6.setBounds(184, 254, 85, 73);
		frame.getContentPane().add(btn6);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBackground(new Color(255, 255, 255));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
	            if(operation == "+")
	            {
	            	result = first+second;
	            
	            	answer = Double.toString(result);
	            	textField.setText(answer);
	            }
	            else if(operation == "-")
	            {
	            	result = first-second;
	            //	answer=String.format("%f", result);
	            	answer = Double.toString(result);
	            	textField.setText(answer);
	            }
	            else if(operation == "*")
	            {
	            	result = first*second;
	            	//answer=String.format("%.2f",result);
	            	answer = Double.toString(result);
	            	textField.setText(answer);
	            }
	            else if(operation == "/")
	            {
	            	result = first/second;
	            	answer = Double.toString(result);
	            	textField.setText(answer);
	            }
	            else if(operation == "%")
	            {
	            	result = first%second;
	            	answer = Double.toString(result);
	            	textField.setText(answer);
	            }
							
				
			}
		});
		btnEqual.setFont(new Font("Arial Narrow", Font.BOLD, 40));
		btnEqual.setBounds(184, 389, 85, 73);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnPlus.setBackground(new Color(255, 255, 255));
		btnPlus.setFont(new Font("Arial Narrow", Font.BOLD, 40));
		btnPlus.setBounds(267, 115, 85, 73);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnSub.setBackground(new Color(255, 255, 255));
		btnSub.setFont(new Font("Arial Narrow", Font.BOLD, 40));
		btnSub.setBounds(267, 186, 85, 73);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnMul.setBackground(new Color(255, 255, 255));
		btnMul.setFont(new Font("Arial Narrow", Font.BOLD, 40));
		btnMul.setBounds(267, 254, 85, 73);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnDivide.setBackground(new Color(255, 255, 255));
		btnDivide.setFont(new Font("Arial Narrow", Font.BOLD, 40));
		btnDivide.setBounds(267, 321, 85, 73);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		btnPercent.setBackground(new Color(255, 255, 255));
		btnPercent.setFont(new Font("Arial Narrow", Font.BOLD, 40));
		btnPercent.setBounds(267, 389, 85, 73);
		frame.getContentPane().add(btnPercent);
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 30));
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(184, 324, 85, 70);
		frame.getContentPane().add(btn3);
	}
}
