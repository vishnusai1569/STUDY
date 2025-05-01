package unitiv;

//Demonstrate an adapter.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Program8" width=300 height=100>
</applet>
*/
public class Program8 extends Applet {
	public void init() {
		addMouseListener(new MyMouseAdapter(this));
		addMouseMotionListener(new MyMouseMotionAdapter(this));
	}
}

class MyMouseAdapter extends MouseAdapter {
	Program8 adapterDemo;

	public MyMouseAdapter(Program8 adapterDemo) {
		this.adapterDemo = adapterDemo;
	}

// Handle mouse clicked.
	public void mouseClicked(MouseEvent me) {
		adapterDemo.showStatus("Mouse clicked");
	}
}

class MyMouseMotionAdapter extends MouseMotionAdapter {
	Program8 adapterDemo;

	public MyMouseMotionAdapter(Program8 adapterDemo) {
		this.adapterDemo = adapterDemo;
	}

// Handle mouse dragged.
	public void mouseDragged(MouseEvent me) {
		adapterDemo.showStatus("Mouse dragged");
	}
}