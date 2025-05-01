package unitv;

//Demonstrate JTabbedPane.
import javax.swing.*;

/*
<applet code="Program8" width=400 height=100>
</applet>
*/
public class Program8 extends JApplet {
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
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Cities", new CitiesPanel());
		jtp.addTab("Colors", new ColorsPanel());
		jtp.addTab("Flavors", new FlavorsPanel());
		jtp.addTab("Languages", new LanguagesPanel());
		add(jtp);
	}
}

//Make the panels that will be added to the tabbed pane.
class CitiesPanel extends JPanel {
	public CitiesPanel() {
		JButton b1 = new JButton("New York");
		add(b1);
		JButton b2 = new JButton("London");
		add(b2);
		JButton b3 = new JButton("Hong Kong");
		add(b3);
		JButton b4 = new JButton("Tokyo");
		add(b4);
	}
}

class ColorsPanel extends JPanel {
	public ColorsPanel() {
		JCheckBox cb1 = new JCheckBox("Red");
		add(cb1);
		JCheckBox cb2 = new JCheckBox("Green");
		add(cb2);
		JCheckBox cb3 = new JCheckBox("Blue");
		add(cb3);
	}
}

class FlavorsPanel extends JPanel {
	public FlavorsPanel() {
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("Vanilla");
		jcb.addItem("Chocolate");
		jcb.addItem("Strawberry");
		add(jcb);
	}
}

class LanguagesPanel extends JPanel {
	public LanguagesPanel() {
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("C");
		jcb.addItem("C++");
		jcb.addItem("JAVA");
		jcb.addItem("Python");
		add(jcb);
	}
}