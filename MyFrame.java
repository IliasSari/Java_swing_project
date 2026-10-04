import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
// JFrame = a gui window to add components
    MyFrame(){
        // JFrame = a gui window to add components
		this.setTitle("JFrame title goes here");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false); //prevent frame from being resize
		this.setLayout(null);
		this.setSize(750, 750); // sets x and y dimensions of frame
		this.setVisible(true); // make frame visible
        this.getContentPane().setBackground(new Color(123,123,123)); // change color of background
		
    }
}
