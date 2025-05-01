package unitv;

//Demonstrate JTextField.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program4 extends JApplet {
	JTextField jtf;

	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		} catch (Exception exc) {
			System.out.println("Can't create because of " + exc);
		}
	}

	private void makeGUI() {
//Change to flow layout.
		setLayout(new FlowLayout());
//Add text field to content pane.
		jtf = new JTextField(15);
		jtf.setText("Default");
		add(jtf);
		jtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
//Show text when user presses ENTER KEY.
				showStatus(jtf.getText());
			}
		});
	}
}