import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Button extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    
    Button(){
        
        label = new JLabel();
        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(this);
        button.setText("Im a button");
        button.setFont(new Font("Comic Sans", Font.BOLD,25));
        button.setForeground(Color.darkGray);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println("Hi!");
        }
    }
}