package unitiv;

//Demonstrate some virtual key codes.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Program7" width=300 height=100>
</applet>
*/
public class Program7 extends Applet implements KeyListener {
	String msg = "";
	int X = 10, Y = 20; // output coordinates

	public void init() {
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent ke) {
		showStatus("Key Down");
		int key = ke.getKeyCode();
		System.out.println(key);
		switch (key) {
		case KeyEvent.VK_F1:
			msg += "<F1>";
			break;
		case KeyEvent.VK_F2:
			msg += "<F2>";
			break;
		case KeyEvent.VK_F3:
			msg += "<F3>";
			break;
		case KeyEvent.VK_PAGE_DOWN:
			msg += "<PgDn>";
			break;
		case KeyEvent.VK_PAGE_UP:
			msg += "<PgUp>";
			break;
		case KeyEvent.VK_LEFT:
			msg += "<Left Arrow>";
			break;
		case KeyEvent.VK_RIGHT:
			msg += "<Right Arrow>";
			break;
		case KeyEvent.VK_DOWN:
			msg += "<Down Arrow>";
			break;
		case KeyEvent.VK_UP:
			msg += "<Up Arrow>";
			break;
		}
		repaint();
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