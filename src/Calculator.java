

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
	
	JFrame frame;
	JTextField textField;
	JButton [] number = new JButton[10];
	JButton [] funct = new JButton[8];
	JButton addbut, subbut, mulbut, divbut;
	JButton decbut, equbut, delbut, clrbut;
	JPanel panel;
	

	
	
	Font myfont = new Font("Ink Free", Font.BOLD , 30);
	
	double num1 = 0;
	double num2 = 0;
	double result = 0;
	char operator;
	
	
	Calculator(){
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		
		textField = new JTextField();
	    textField.setBounds(50,25, 300 , 50);
	    textField.setFont(myfont);
	    textField.setEditable(false);
	    
	    
		frame.add(textField);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String [] args) {
		
		Calculator calc = new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
