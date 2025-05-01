package unitv;

//Handle an event in a Swing program.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Program2 {
	JLabel jlab;

	Program2() {
//Create a new JFrame container.
		JFrame jfrm = new JFrame("Example for Button Events");
//Specify FlowLayout for the layout manager.
		jfrm.setLayout(new FlowLayout());
//Give the frame an initial size.
		jfrm.setSize(520, 590);
//Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//Make two buttons.
		JButton jbtnAlpha = new JButton("BE CSE");
		JButton jbtnBeta = new JButton("JAVA");
//Add action listener for Alpha.
		jbtnAlpha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("BE CSE Selected!");
			}
		});
//Add action listener for Beta.
		jbtnBeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				jlab.setText("JAVA Selected");
			}
		});
//Add the buttons to the content pane.
		jfrm.add(jbtnAlpha);
		jfrm.add(jbtnBeta);
//Create a text-based label.
		jlab = new JLabel("Press a button.");
//Add the label to the content pane.
		jfrm.add(jlab);
//Display the frame.
		jfrm.setVisible(true);
	}

	public static void main(String args[]) {
//Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Program2();
			}
		});
	}
}