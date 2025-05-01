package unitv;

//Demonstrate JScrollPane.
import java.awt.*;
import javax.swing.*;

public class Program9 extends JApplet {
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
//Add 400 buttons to a panel.
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(30, 14));
		int b = 1;
		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 10; j++) {
				jp.add(new JButton("Java " + b));
				b++;
			}
		}
		jp.add(new JButton("Java " + b));
//Create the scroll pane.
		JScrollPane jsp = new JScrollPane(jp);
//Add the scroll pane to the content pane.
//Because the default border layout is used,
//the scroll pane will be added to the center.
		add(jsp, BorderLayout.CENTER);
	}
}