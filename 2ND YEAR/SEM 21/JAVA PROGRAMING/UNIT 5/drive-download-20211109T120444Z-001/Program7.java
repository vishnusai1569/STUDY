package unitv;

//Demonstrate JRadioButton
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program7 extends JApplet implements ActionListener {
	JLabel jlab;
	JLabel bjlab;

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
		
		JRadioButton bb1 = new JRadioButton("BE");
		bb1.addActionListener(this);
		add(bb1);
		JRadioButton bb2 = new JRadioButton("B.Tech");
		bb2.addActionListener(this);
		add(bb2);
		JRadioButton bb3 = new JRadioButton("BSC");
		bb3.addActionListener(this);
		add(bb3);
		
//Create radio buttons and add them to content pane.
		JRadioButton b1 = new JRadioButton("CSE");
		b1.addActionListener(this);
		add(b1);
		JRadioButton b2 = new JRadioButton("IT");
		b2.addActionListener(this);
		add(b2);
		JRadioButton b3 = new JRadioButton("ECE");
		b3.addActionListener(this);
		add(b3);
		
		
		
//Define a button group.
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		
		ButtonGroup bbg = new ButtonGroup();
		bbg.add(bb1);
		bbg.add(bb2);
		bbg.add(bb3);
//Create a label and add it to the content pane.
		jlab = new JLabel("Select One");
		add(jlab);
		bjlab = new JLabel("Select One");
		add(bjlab);
	}

//Handle button selection.
	public void actionPerformed(ActionEvent ae) {
		jlab.setText("You selected " + ae.getActionCommand());
		bjlab.setText("You selected " + ae.getActionCommand());
	}
}