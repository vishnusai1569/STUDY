package unitiv;

//Demonstrate the key event handlers.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Program6" width=300 height=100>
</applet>
*/
public class Program6 extends Applet implements KeyListener {
	String msg = "";
	int X = 10, Y = 20; // output coordinates

	public void init() {
		addKeyListener(this);
	}

	/* List of Methods that are define in the interface KeyListener */
	public void keyPressed(KeyEvent ke) {
		System.out.println(ke.getKeyChar());
		showStatus("Key Down");
	}

	public void keyReleased(KeyEvent ke) {
		showStatus("Key Up");
	}

	public void keyTyped(KeyEvent ke) {
		msg += ke.getKeyChar();
		repaint();
	}

// Display keystrokes.
	public void paint(Graphics g) {
		g.drawString(msg, X, Y);
	}
}