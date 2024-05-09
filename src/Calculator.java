

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
	    
	    addbut = new JButton("+");
	    subbut = new JButton("-");
	    mulbut = new JButton("*");
	    divbut = new JButton("/");
	    decbut = new JButton(".");
	    equbut = new JButton("=");
	    delbut = new JButton("Delete");
	    clrbut = new JButton("Clear");
	    
	    funct[0] = addbut;
	    funct[1] = subbut;
	    funct[2] = mulbut;
	    funct[3] = divbut;
	    funct[4] = decbut;
	    funct[5] = equbut;
	    funct[6] = delbut;
	    funct[7] = clrbut;
	    
	    for(int i = 0; i < 8; i++) {
	    	funct[i].addActionListener(this);
	    	funct[i].setFont(myfont);
	    	funct[i].setFocusable(false);
	    }
	    
	    for(int i = 0; i < 10; i++) {
	    	number[i] = new JButton(String.valueOf(i));
	    	
	    }
	  
	    
	    
	    
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
