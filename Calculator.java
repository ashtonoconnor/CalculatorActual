import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


	
public class Calculator implements ActionListener {
		
		
		//class variables aka instance variables aka field variables
		JFrame frame;
		JTextField textField;
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bdec,
		bmul, bdiv, beq, bclr, bksp, bspr, bcbe, bsqt, blog;               // buttons 0 through 9, add, subtract, multiply, divide, equals, clear, backspace
		// still need beq, bksp=backspace, bspr=, bcbe=cube, blog=log
		
		double firstNumber;
		double secondNumber;
		double result;
		int operator;
		
		//constructor
		
		public Calculator() {
			frame = new JFrame("Calculator, by Ashton OC");
			frame.setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(30,40,410,30);
			frame.add(textField);
			
			b1 = new JButton("1");
			b1.setBounds(40, 240, 50, 40);
			b1.setBackground(Color.CYAN);
			frame.add(b1);
			b1.addActionListener(this);
			
			b4 = new JButton("4");
			b4.setBounds(40, 170, 50, 40);
			b4.setBackground(Color.PINK);
			frame.add(b4);
			b4.addActionListener(this);
			
			b7 = new JButton("7");
			b7.setBounds(40, 100, 50, 40);
			b7.setBackground(Color.CYAN);
			frame.add(b7);
			b7.addActionListener(this);
			
			b2 = new JButton("2");
			b2.setBounds(110, 240, 50, 40);
			b2.setBackground(Color.PINK);
			frame.add(b2);
			b2.addActionListener(this);
			
			b5 = new JButton("5");
			b5.setBounds(110, 170, 50, 40);
			b5.setBackground(Color.CYAN);
			frame.add(b5);
			b5.addActionListener(this);
			
			b8 = new JButton("8");
			b8.setBounds(110, 100, 50, 40);
			b8.setBackground(Color.PINK);
			frame.add(b8);
			b8.addActionListener(this);
			
			b3 = new JButton("3");
			b3.setBounds(180, 240, 50, 40);
			b3.setBackground(Color.CYAN);
			frame.add(b3);
			b3.addActionListener(this);
			
			b6 = new JButton("6");
			b6.setBounds(180, 170, 50, 40);
			b6.setBackground(Color.PINK);
			frame.add(b6);
			b6.addActionListener(this);
			
			b9 = new JButton("9");
			b9.setBounds(180, 100, 50, 40);
			b9.setBackground(Color.CYAN);
			frame.add(b9);
			b9.addActionListener(this);
			
			bdiv = new JButton("/");
			bdiv.setBounds(250, 100, 50, 40 );
			bdiv.setBackground(Color.PINK);
			frame.add(bdiv);
			bdiv.addActionListener(this);
			
			bmul = new JButton("*");
			bmul.setBounds(250, 170, 50, 40);
			bmul.setBackground(Color.CYAN);
			frame.add(bmul);
			bmul.addActionListener(this);
			
			badd = new JButton("+");
			badd.setBounds(250, 240, 50, 40 );
			badd.setBackground(Color.PINK);
			frame.add(badd);
			badd.addActionListener(this);
			
			bsub = new JButton("-");
			bsub.setBounds(250, 310, 50, 40);
			bsub.setBackground(Color.CYAN);
			frame.add(bsub);
			bsub.addActionListener(this);
			
			b0 = new JButton("0");
			b0.setBounds(110, 310, 120, 40);
			b0.setBackground(Color.PINK);
			frame.add(b0);
			b0.addActionListener(this);
			
			bclr = new JButton("Clear");
			bclr.setBounds(40, 380, 110, 30);
			bclr.setBackground(Color.YELLOW);
			frame.add(bclr);
			bclr.addActionListener(this);
			
			bsqt = new JButton("√");
			bsqt.setBounds(320, 240, 100, 40);
			bsqt.setBackground(Color.BLUE);
			frame.add(bsqt);
			bsqt.addActionListener(this);
			
			
			beq = new JButton("=");
			beq.setBounds(320, 380, 100, 30);
			beq.setBackground(Color.GREEN);
			frame.add(beq);
			beq.addActionListener(this);
			
			bksp = new JButton("Backspace");
			bksp.setBounds(190, 380, 110, 30);
			bksp.setBackground(Color.YELLOW);
			frame.add(bksp);
			bksp.addActionListener(this);
			
			bspr = new JButton("x^2");
			bspr.setBounds(320, 170, 100, 40);
			bspr.setBackground(Color.BLUE);
			frame.add(bspr);
			bspr.addActionListener(this);
			
			bcbe = new JButton("x^3");
			bcbe.setBounds(320, 100, 100, 40);
			bcbe.setBackground(Color.BLUE);
			frame.add(bcbe);
			bcbe.addActionListener(this);
			
			blog = new JButton("Log(10)");
			blog.setBounds(320, 310, 100, 40);
			blog.setBackground(Color.BLUE);
			frame.add(blog);
			blog.addActionListener(this);
			
			bdec = new JButton(".");
			bdec.setBounds(40, 310, 50, 40);
			bdec.setBackground(Color.PINK);
			frame.add(bdec);
			bdec.addActionListener(this);
		
			
			
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setSize(800, 600);
			frame.setVisible(true);
		}
		//Listener -- waiting for an event, mouse click, mouse over...
		public void actionPerformed(ActionEvent e) {
			//handler -- call a handler method
			if(e.getSource() == b1)
				textField.setText(textField.getText().concat("1"));
			if(e.getSource() == b2)
				textField.setText(textField.getText().concat("2"));
			if(e.getSource() == b3)
				textField.setText(textField.getText().concat("3"));
			if(e.getSource() == b4)
				textField.setText(textField.getText().concat("4"));
			if(e.getSource() == b5)
				textField.setText(textField.getText().concat("5"));
			if(e.getSource() == b6)
				textField.setText(textField.getText().concat("6"));
			if(e.getSource() == b7)
				textField.setText(textField.getText().concat("7"));
			if(e.getSource() == b8)
				textField.setText(textField.getText().concat("8"));
			if(e.getSource() == b9)
				textField.setText(textField.getText().concat("9"));
			if(e.getSource() == b0)
				textField.setText(textField.getText().concat("0"));
			if(e.getSource() == bdec)
				textField.setText(textField.getText().concat("."));
			
			if(e.getSource() == bclr) {
				textField.setText("");
			}
			
			if (e.getSource() == badd) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 1;
				textField.setText("");
			}
			if (e.getSource() == bsub) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 2;
				textField.setText("");
			}
			if (e.getSource() == bmul) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 3;
				textField.setText("");
			}
			if (e.getSource() == bdiv) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 4;
				textField.setText("");
			}
			
			if (e.getSource() == bksp) {
				//s is what was in the text field
				String s=textField.getText();
				//clear text field
				textField.setText("");
				//for every character in s minus one,
				for(int i =0; i<s.length()-1; i++)
					//add that character from s into the text field
					textField.setText(textField.getText()+s.charAt(i));
			}
			
			if (e.getSource()==blog) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 8;
			}
			
			if (e.getSource()==bspr) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 6;
			}
			
			if (e.getSource() == bcbe) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 7;
			}
			
			if (e.getSource() == bsqt) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 5;
			}
			
			if (e.getSource() == beq) {
				secondNumber = Double.parseDouble(textField.getText());
				
				switch(operator) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;
					
				case 5:
					result = Math.pow(firstNumber, 0.5);
					break;
				case 6:
					result = Math.pow(firstNumber, 2);
					break;
				case 7 :
					result = Math.pow(firstNumber, 3);
					break;
				case 8 :
					result = Math.log10(firstNumber);
					break;
					
				default: result = 0.0;
				}
				
				textField.setText("" + result);
			}
			
			
			
		} // end of action performed
		
		
		
		//handler methods
		
	} // end of Calculator
	


