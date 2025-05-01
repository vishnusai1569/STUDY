package unitv;

//Demonstrate JLabel and ImageIcon.
import java.awt.*;
import javax.swing.*;

public class Program3 extends JApplet {
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
//Create an icon.
		ImageIcon ii = new ImageIcon("C:\\Users\\Murugan\\Google Drive\\SITA1301\\sourcecodes\\Unit_V\\src\\unitv\\sistlogo.jpg");
//Create a label.
		JLabel jl = new JLabel("SIST Logo", ii, JLabel.LEFT);
//Add the label to the content pane.
		add(jl);
	}
}