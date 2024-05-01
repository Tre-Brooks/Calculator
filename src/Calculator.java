

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
	
	JFrame frame;
	JTextField textfield;
	JButton [] number = new JButton[10];
	JButton [] funct = new JButton[8];
	JButton addbut, subbut, mulbut, divbut;
	JButton decbut, equbut, delbut, clrbut;
	JPanel panel;
	
	
	Font myfont = new Font("Ink Free", Font.BOLD , 30);
	
	
	Calculator(){
		
	}
	
	public static void main(String [] args) {
		
		Calculator calc = new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
