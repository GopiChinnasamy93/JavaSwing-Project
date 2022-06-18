package Learning;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OddOrEven {
	int win = 0;
	int match = 0;
	JLabel gamename, l1, l2, l3;
	JButton b1, b2;
	JTextField t1, t2, t3;

	public OddOrEven()  {
		JFrame j = new JFrame();
		j.setVisible(true);
		j.setLayout(null);
		j.setSize(500, 500);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.getContentPane().setBackground(Color.CYAN);
		
		
		gamename = new JLabel("Odd or Even");
		gamename.setBounds(200, 10, 200, 30);
		gamename.setForeground(Color.BLUE);
		gamename.setFont(new Font("Verdana", Font.PLAIN, 18));

		l1 = new JLabel("Guess the Character( O or E)");
		l1.setBounds(50, 60, 200, 20);
		t1 = new JTextField(10);
		t1.setBounds(240, 60, 50, 20);
		
		b1 = new JButton("Play");
		b1.setBounds(200, 110, 100, 40);
		
		l2 = new JLabel("Winning Match");
		l2.setBounds(50, 170, 100, 20);
		t2 = new JTextField(10);
		t2.setBounds(240, 170, 50, 20);
		
		
		l3 = new JLabel("Total Match");
		l3.setBounds(50, 210, 100, 20);
		t3 = new JTextField(10);
		t3.setBounds(240, 210, 50, 20);
		
		b2=new JButton("Close");
		b2.setBounds(200, 250, 100, 40);
		j.add(gamename);
		j.add(l1);
		j.add(t1);
		j.add(b1);
		j.add(l2);
		j.add(t2);
		j.add(l3);
		j.add(t3);
		j.add(b2);
		b1.addActionListener(ae -> {
			int number = (int) (Math.random() * 10);
			String c;
			String d = t1.getText();

			int n1 = number % 2;

			if (n1 == 0) {
				c = "e";
			} else {
				c = "o";
			}

			if (d.length() != 0 && d.length() < 2) {

				if (c.equalsIgnoreCase(d)) {
					win++;
					match++;
					t2.setText(win + "");
					t3.setText(match + "");
					JOptionPane.showMessageDialog(t1, "Win ", "Result Announcement",
							JOptionPane.PLAIN_MESSAGE);

				} else {
					match++;
					t3.setText(match + "");
					JOptionPane.showMessageDialog(t1, "Lose. The Correct value is : " + c.toUpperCase(),
							"Result Announcement", JOptionPane.ERROR_MESSAGE);

				}

			} else {
				JOptionPane.showMessageDialog(t1, "Pleae Enter single Character :  E or O ", "Input Error",
						JOptionPane.ERROR_MESSAGE);
			}

		});
		
		b2.addActionListener(e->{
			j.dispose();
		});
		

	}

}
