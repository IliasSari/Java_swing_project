import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
// JFrame = a gui window to add components
	JButton button;
    JTextField textField;

	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));


		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true); // make frame visible

    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button ){
			textField.getText();
		}
	}
}
