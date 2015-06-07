import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DamageCalculate extends JFrame{
	
	Calculator calculator1 = new Calculator();
	
	Object[] raceImage = {
			new ImageIcon("god.jpg"),
			new ImageIcon("devil.jpg"),
			new ImageIcon("human.jpg"),
			new ImageIcon("beast.jpg"),
			new ImageIcon("dragon.jpg"),
			new ImageIcon("elf.jpg")
	};
  
	String race[] = {"GOD","Devil","Human","Beast","Dragon","Elf"};
	
	JLabel label1 = new JLabel("Leader:");
	JLabel label2 = new JLabel("times");
	JLabel label3 = new JLabel("Vice-Leader:");
	JLabel label4 = new JLabel("times");
	JLabel label5 = new JLabel("Combo:");
	JLabel label6 = new JLabel("Attack:");
	JLabel label7 = new JLabel("Normal rune numbers:");
	JLabel label8 = new JLabel("Strength rune numbers:");
	JLabel label9 = new JLabel("eliminate times:");
	JLabel labelDamage = new JLabel("Your total damage is:");
	
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	
	JPanel descriptionPanel = new JPanel();
	
	//Leader
	JTextField field11 = new JTextField(10);
	//Vice-Leader
	JTextField field12 = new JTextField(10);
	//combo
	JTextField field13 = new JTextField(10);
	//attack
	JTextField field14 = new JTextField(10);
	//normal
	JTextField field15 = new JTextField(10);
	//Strength
	JTextField field16 = new JTextField(10);
	//Deli_times
	JTextField field17 = new JTextField(10);
	//output in here
	JTextField field18 = new JTextField(10);
	
	JButton buttonC = new JButton("Calculate");
	JButton buttonR = new JButton("Clear");
	
	JComboBox<Object> comboBox1 = new JComboBox<Object>(raceImage);
	JComboBox<Object> comboBox2 = new JComboBox<Object>(raceImage);
	
	public DamageCalculate(){
		
		
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		panel5.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		panel6.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		
		panel1.add(label1);//Leader
		panel1.add(comboBox1);//race
		panel1.add(field11);//enter times
		panel1.add(label2);//times
		
		panel2.add(label3);//Vice-Leader
		panel2.add(comboBox2);//race
		panel2.add(field12);//enter times
		panel2.add(label4);//times
		
		panel3.add(label5);//combo
		panel3.add(field13);//enter combo
		panel3.add(label6);
		panel3.add(field14);
		
		panel4.add(label7);
		panel4.add(field15);
		panel4.add(label8);
		panel4.add(field16);
		
		panel5.add(label9);
		panel5.add(field17);
		panel5.add(buttonC);//calculator
		panel5.add(buttonR);//calculator
		
		panel6.add(labelDamage);
		panel6.add(field18);

		
		setLayout(new GridLayout(8, 2, 5, 5));
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		add(field18);
		
		buttonC.addActionListener(new ButtonListenerC());
		buttonR.addActionListener(new ButtonListenerR());
	}
	
	private class ButtonListenerC implements ActionListener {
	@Override 
		public void actionPerformed(ActionEvent e) {
			
			
			double Leader_times = Double.parseDouble(field11.getText());
			double ViceLeader_times = Double.parseDouble(field12.getText());
			double combo = Double.parseDouble(field13.getText());
			double total_Attack = Double.parseDouble(field14.getText());
			double normal = Double.parseDouble(field15.getText());
			double strong = Double.parseDouble(field16.getText());
			double eli_times = Double.parseDouble(field17.getText());
			
			calculator1.setTotal_Attack(total_Attack);
			calculator1.setLeader_times(Leader_times);
			calculator1.setViceLeader_times(ViceLeader_times);
			calculator1.setCombo(combo);
			calculator1.setNormal(normal);
			calculator1.setStrong(strong);
			calculator1.setEli_times(eli_times);
			
			Font f = new Font("Rockwell Extra Bold", Font.BOLD, 40);
			
			field18.setText(String.format("%.3f Damage", calculator1.getDamage()));
			field18.setFont(f);
			field18.setForeground(Color.RED);
		}
	}
	
	private class ButtonListenerR implements ActionListener {
	@Override 
		public void actionPerformed(ActionEvent e) {
			//remove all value in text field1
			field11.setText("");
			field12.setText("");
			field13.setText("");
			field14.setText("");
			field15.setText("");
			field16.setText("");
			field17.setText("");
			field18.setText("");
		}
	}
	
}
