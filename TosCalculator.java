import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class TosCalculator extends JFrame{
	
	JLabel lable1 = new JLabel("Leader");
	JLabel lable2 = new JLabel("倍");
	JLabel lable3 = new JLabel("Vice-Leader");
	JLabel lable4 = new JLabel("倍");
	JLabel lable5 = new JLabel("Combo");
	
	JComboBox combo1 = new JComboBox(new String[] {"God","Devil","Human","Beast","Dragon","Elf"});
	JComboBox combo2 = new JComboBox(new String[] {"God","Devil","Human","Beast","Dragon","Elf"});
	
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	JTextField text3 = new JTextField(10);
	
	JButton button = new JButton("Comfirm");
	
	JPanel panel1 = new JPanel(new GridLayout(4,1,2,2));
	JPanel panel2 = new JPanel(new GridLayout(4,1,2,2));
	JPanel panel3 = new JPanel(new GridLayout(2,4,2,2));
	
	
	public TosCalculator(){
		
		panel1.add(lable1);
		panel1.add(combo1);
		panel1.add(text1);
		panel1.add(lable2);
		
		panel1.add(lable3);
		panel1.add(combo2);
		panel1.add(text2);
		panel1.add(lable4);
		
		
		panel3.add(panel1,BorderLayout.NORTH);
		panel3.add(panel2,BorderLayout.CENTER);
		
		setLayout(new GridLayout(4,1,2,2));
		add(panel1);
		add(panel2);
		add(panel3);
	}
	
	public static void main(String[] args){
		
		JFrame frame = new TosCalculator();
		
		frame.setTitle("U10316039_TosCalculator");
		frame.setSize(200,200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
