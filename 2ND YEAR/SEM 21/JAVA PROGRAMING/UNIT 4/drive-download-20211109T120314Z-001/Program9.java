package unitiv;

//This applet does NOT use an inner class.
import java.applet.*;
import java.awt.event.*;

/*
<applet code="Program9" width=200 height=100>
</applet>
*/
public class Program9 extends Applet {
	public void init() {
		addMouseListener(new MyMouseAdapter1(this));
	}
}

class MyMouseAdapter1 extends MouseAdapter {
	Program9 mousePressedDemo;

	public MyMouseAdapter1(Program9 mousePressedDemo) {
		this.mousePressedDemo = mousePressedDemo;
	}

	public void mousePressed(MouseEvent me) {
		mousePressedDemo.showStatus("Mouse Pressed.");
		int x = me.getX();
		System.out.println(x);
	}
	
	public void mouseReleased(MouseEvent me) {
		mousePressedDemo.showStatus("Mouse Released.");
		int x = me.getX();
		System.out.println(x);
	}
}