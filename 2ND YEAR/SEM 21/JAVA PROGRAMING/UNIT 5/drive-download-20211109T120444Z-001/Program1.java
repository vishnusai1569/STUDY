package unitv;

import javax.swing.*;

class Program1 {
	Program1() {
		// Create a new JFrame container.
		JFrame jfrm = new JFrame("A Simple Swing Application - B1");
		// jfrm is the Frame Object
		// Give the frame an initial size - width, height measured in pixels
		jfrm.setSize(475, 300);
		// Terminate the program when the user closes the application.
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Place the controls onto the JFrame
		// Create a text-based label.
		JLabel jlab = new JLabel(" JLabel displays the text: \"SIST - Java - B1 Group! \"");
		// Add the label to the content pane.
		jfrm.add(jlab);
		// Display the frame.
		jfrm.setVisible(true);
	}

	public static void main(String args[]) {
		// Create the frame on the event dispatching thread.
		SwingUtilities.invokeLater(
				new Runnable() {
					public void run() {
						new Program1();
					}
				}
			);
	}
}