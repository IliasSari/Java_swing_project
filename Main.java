import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

    public static void main(String[] args) {
        
        // Border border = BorderFactory.createLineBorder(Color.green, 3);
        
        // JLabel label = new JLabel(); // create a label
        // label.setText("Hello world"); // set text of label
        // label.setForeground(new Color(0x00FF00)); // set font color of text
        // label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set font of text
        // label.setBackground(Color.BLACK); // set background color
        // label.setOpaque(true); // display background color
        // label.setBorder(border);
        // label.setVerticalAlignment(JLabel.TOP); 
        // label.setHorizontalAlignment(JLabel.CENTER); 
        // label.setBounds(0, 0, 125, 75); 

        // // JPanel containers
        // JPanel redPanel = new JPanel();
        // redPanel.setBackground(Color.red);
        // redPanel.setBounds(0, 250, 250, 250);
        // redPanel.setLayout(null);

        // JPanel bluePanel = new JPanel();
        // bluePanel.setBackground(Color.blue);
        // bluePanel.setBounds(250, 0, 250, 250);
        // bluePanel.setLayout(null);

        // JPanel greenPanel = new JPanel();
        // greenPanel.setBackground(Color.green);
        // greenPanel.setBounds(0, 0, 250, 250);
        // greenPanel.setLayout(null);

        // JFrame frame = new JFrame();
        // frame.setSize(500, 500);
        // frame.setLayout(null);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setVisible(true);
        
        // bluePanel.add(label);
        // frame.add(greenPanel);
        // frame.add(bluePanel);
        // frame.add(redPanel);

        // Instantiate your separate Button frame window

        // JOptionPane examples
        JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "This is some info", "title", JOptionPane.ERROR_MESSAGE); 

        int answer = JOptionPane.showConfirmDialog(null, "Hi! Are you happy?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        
        String name = JOptionPane.showInputDialog("What is your name?: ");
        System.out.println("Hello " + name);

        String[] responses = {"Yes, you are great", "Thank you!", "*blush*"};
        JOptionPane.showOptionDialog(null, "Are you great", "a message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
    }
}

	// Separate class for the Button frame window
	class Button extends JFrame implements ActionListener {
		
		JButton button;
		JLabel label;
		
		Button() {
			label = new JLabel();
			button = new JButton();
			button.setBounds(100, 100, 250, 100);
			button.addActionListener(this);
			button.setText("Im a button");
			button.setFont(new Font("Comic Sans", Font.BOLD, 25));
			button.setForeground(Color.darkGray);
			button.setBackground(Color.LIGHT_GRAY);
			button.setBorder(BorderFactory.createEtchedBorder());

			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.setLayout(null);
			this.setSize(500, 500);
			this.setVisible(true);
			this.add(button);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				System.out.println("Hi!");
			}
    }
}