import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;;

public class Main {

	public static void main(String[] args) {
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		
		JLabel label = new JLabel(); //create a label
		label.setText("Hello world"); //set text of label
		label.setForeground(new Color(0x00FF00));// set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN, 20)); // set font of text
		label.setBackground(Color.BLACK); //set background color
		label.setOpaque(true); //display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.TOP); //set vertical position of icon + text within label
		label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon + text within label
		label.setBounds(0,0,125,75); // set x,y position within frame as well as dimensions

		//JPanel a gui component that functions as a container to hold other components

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,250,250, 250);
		redPanel.setLayout(null);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
		bluePanel.setLayout(null);

		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,0,250,250);
		greenPanel.setLayout(null);


		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
		greenPanel.add(label);
		frame.add(greenPanel);
		frame.add(bluePanel);
		frame.add(redPanel);
	}

}
