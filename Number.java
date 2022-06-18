package Learning;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Number {

	public static void main(String[] args) {
		Number n=new Number();
	}
	
	
	public Number() {
		
		
		JFrame j=new JFrame();
		j.setVisible(true);
		j.setLayout(null);
		j.setSize(500,500);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.getContentPane().setBackground(Color.CYAN);
		
		
		JLabel l1=new JLabel("Select The Game");
		l1.setBounds(150, 10, 200, 30);
		l1.setForeground(Color.BLACK);
		l1.setFont(new Font("TimesNow",Font.BOLD,20));		
		j.add(l1);
		
		JButton b1=new JButton("Number Guessing");
		b1.setBounds(150, 60, 200, 30);		
		b1.setFont(new Font("TimesNow",Font.BOLD,16));		
		j.add(b1);
		
		JButton b2=new JButton("Odd or Even");
		b2.setBounds(150, 110, 200, 30);		
		b2.setFont(new Font("TimesNow",Font.BOLD,16));		
		j.add(b2);
		
		
b1.addActionListener(e ->{
	
		NumberGuessing gh=new NumberGuessing();
	
});
b2.addActionListener(e->{
		OddOrEven ev=new OddOrEven();
	
});


		
		
	}

}
