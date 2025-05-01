package unitiv;

// An Applet skeleton.
import java.awt.*;
import java.applet.*;

/*
<applet code="Program1" width=300 height=100>
</applet>
*/
public class Program1 extends Applet {
// Called first.
	public void init() {
		// initialization
		System.out.println("Applet Initialized");
	}

	/*
	 * Called second, after init(). Also called whenever the applet is restarted.
	 */
	public void start() {
		// start or resume execution
		System.out.println("Applet Started");
	}

// Called when the applet is stopped.
	public void stop() {
// suspends execution
		System.out.println("Applet Stopped");
	}

	/*
	 * Called when applet is terminated. This is the last method executed.
	 */
	public void destroy() {
// perform shutdown activities
		System.out.println("Applet Destroyed");
	}

// Called when an applet’s window must be restored.
	public void paint(Graphics g) {
// redisplay contents of window
		g.draw("Hi");
		System.out.println("In Graphics method");
	}
}