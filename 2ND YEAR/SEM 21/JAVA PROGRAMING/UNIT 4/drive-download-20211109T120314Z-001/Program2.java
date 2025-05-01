package unitiv;

/* A simple applet that sets the foreground and
background colors and outputs a string. */
import java.awt.*;
import java.applet.*;

/*
<applet code="Program2" width=300 height=50>
</applet>
*/
public class Program2 extends Applet {
	String msg;

// set the foreground and background colors.
	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg = "1. Inside init( )";
	}

// Initialize the string to be displayed.
	public void start() {
		msg += "2.Inside start( ) --";
	}

// Display msg in applet window.
	public void paint(Graphics g) {
		msg += "\n3.Inside paint( ).";
		g.drawString(msg, 10, 10);
		showStatus("SIST-CSE");
	}
}