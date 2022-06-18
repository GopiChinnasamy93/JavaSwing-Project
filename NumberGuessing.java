package Learning;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NumberGuessing {

	int win = 0;
	int match = 0;
	JLabel gamename, l1, l2, l3;
	JButton b1, b2;
	JTextField t1, t2, t3;

	public NumberGuessing()  {
		JFrame j = new JFrame();
		j.setVisible(true);
		j.setLayout(null);
		j.setSize(500, 500);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.getContentPane().setBackground(Color.CYAN);
		
		
		gamename = new JLabel("Number Guessing");
		gamename.setBounds(200, 10, 200, 30);
		gamename.setForeground(Color.BLUE);
		gamename.setFont(new Font("Verdana", Font.PLAIN, 18));

		
		
		l1 = new JLabel("Guess the number ( 0 to 9)");
		l1.setBounds(50, 60, 150, 20);
		t1 = new JTextField(10);
		t1.setBounds(220, 60, 50, 20);
		
		b1 = new JButton("Play");
		b1.setBounds(200, 110, 100, 40);
		
		
		l2 = new JLabel("Winning Match");
		l2.setBounds(50, 170, 100, 20);
		t2 = new JTextField(10);
		t2.setBounds(220, 170, 50, 20);
		
		l3 = new JLabel("Total Match");
		l3.setBounds(50, 210, 100, 20);
		t3 = new JTextField(10);
		t3.setBounds(220, 210, 50, 20);
		
		b2=new JButton("Close");
		b2.setBounds(200, 250, 100, 40);
		
		
		j.add(b2);
		j.add(gamename);
		j.add(l1);
		j.add(t1);
		j.add(b1);
		j.add(l2);
		j.add(t2);
		j.add(l3);
		j.add(t3);

		b1.addActionListener(ae -> {
			int number = (int) (Math.random() * 10);
			int n1 = Integer.parseInt(t1.getText());
if(n1<10) {
			if (number == n1) {
				win++;
				match++;
				t2.setText(win + "");
				t3.setText(match + "");
				JOptionPane.showMessageDialog(t1, "You Guess the correct number ", "Result Announcement",
						JOptionPane.PLAIN_MESSAGE);

			} else {
				match++;
				t3.setText(match + "");
				JOptionPane.showMessageDialog(t1, "You Guess the Wrong number. The Correct Number : " + number,
						"Result Announcement", JOptionPane.ERROR_MESSAGE);

			}

		}
else {
	JOptionPane.showMessageDialog(t1, "Please Enter the Value between 0 to 9","Input Error",JOptionPane.ERROR_MESSAGE);
}

				
		});
		b2.addActionListener(e->{
			j.dispose();
		});
		

	}

}
