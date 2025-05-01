package unitiv;

//Demonstrate the mouse event handlers.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Program5" width=300 height=100>
</applet>
*/
public class Program5 extends Applet implements MouseListener, MouseMotionListener {
	String msg = "";
	int mouseX = 0, mouseY = 0; // coordinates of mouse

	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
	}

//Handle mouse clicked.
	public void mouseClicked(MouseEvent me) {
//save coordinates
		mouseX = 10;//me.getX();
		mouseY = 20;//me.getY();
		msg = "Mouse clicked.";
		repaint();
	}

//Handle mouse entered.
	public void mouseEntered(MouseEvent me) {
//save coordinates
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse entered.";
		repaint();
	}

//Handle mouse exited.
	public void mouseExited(MouseEvent me) {
		// save coordinates
		mouseX = 0;
		mouseY = 10;
		msg = "Mouse exited.";
		repaint();
	}

	// Handle mouse pressed.
	public void mousePressed(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Down";
		repaint();
	}

	// Handle mouse released.
	public void mouseReleased(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "Up";
		repaint();
	}

	// Handle mouse dragged.
	public void mouseDragged(MouseEvent me) {
		// save coordinates
		mouseX = me.getX();
		mouseY = me.getY();
		msg = "*";
		showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
		repaint();
	}

	// Handle mouse moved.
	public void mouseMoved(MouseEvent me) {
		// show status
		showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
	}

	// Display msg in applet window at current X,Y location.
	public void paint(Graphics g) {
		g.drawString(msg, mouseX, mouseY);
	}
}