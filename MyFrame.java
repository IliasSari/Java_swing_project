import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
// JFrame = a gui window to add components
    MyFrame(){
        // JFrame = a gui window to add components
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setLayout(null);
		this.setSize(750, 750); // sets x and y dimensions of frame
		this.setVisible(true); // make frame visible
		




    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
	}
}
