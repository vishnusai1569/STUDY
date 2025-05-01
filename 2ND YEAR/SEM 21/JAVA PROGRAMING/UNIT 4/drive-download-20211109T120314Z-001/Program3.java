package unitiv;

/* A simple banner applet.
This applet creates a thread that scrolls
the message contained in msg right to left
across the applet’s window.
*/
import java.awt.*;
import java.applet.*;

/*
<applet code="Program3" width=500 height=500>
</applet>
*/
public class Program3 extends Applet implements Runnable{
	String msg = " Sathyabama Institute of Science and Technology";
	Thread t = null;
	int state;
	volatile boolean stopFlag;

// Set colors and initialize thread.
	public void init() {
		setBackground(Color.cyan);
		setForeground(Color.red);
	}

	// Start thread
	public void start() {
		t = new Thread(this);
		stopFlag = false;
		t.start();
	}

	// Entry point for the thread that runs the banner.
	// Defined in the interface Runnable
	public void run() {
		// Redisplay banner
		for (;;) { // Infinite loop
			try {
				repaint(); // refreshes the applet window with new content. Calls the paint method.
				Thread.sleep(250);
				if (stopFlag)
					break;
			} catch (InterruptedException e) {
			}
		}
	}

	// Pause the banner.
	public void stop() {
		stopFlag = true;
		t = null;
	}

	// Display the banner.
	public void paint(Graphics g) {
		char ch;
		ch = msg.charAt(0);
		msg = msg.substring(1, msg.length());
		msg += ch;
		
		// FOR EVERY DELAY IN THREAD. VALUE OF MSG IS ...
		// SATHYABAMA INSTITUTE OF SCIENCE AND TECHNOLOGY
		// ATHYABAMA INSTITUTE OF SCIENCE AND TECHNOLOGY S
		// THYABAMA INSTITUTE OF SCIENCE AND TECHNOLOGY SA
		// HYABAMA INSTITUTE OF SCIENCE AND TECHNOLOGY SAT
		// YABAMA INSTITUTE OF SCIENCE AND TECHNOLOGY SATH
		// ABAMA INSTITUTE OF SCIENCE AND TECHNOLOGY SATHY
		// BAMA INSTITUTE OF SCIENCE AND TECHNOLOGY SATHYA
		// AMA INSTITUTE OF SCIENCE AND TECHNOLOGY SATHYAB
		// MA INSTITUTE OF SCIENCE AND TECHNOLOGY SATHYABA
		// A INSTITUTE OF SCIENCE AND TECHNOLOGY SATHYABAM
		//  INSTITUTE OF SCIENCE AND TECHNOLOGY SATHYABAMA
		
		g.drawString(msg, 10, 30);
	}
}