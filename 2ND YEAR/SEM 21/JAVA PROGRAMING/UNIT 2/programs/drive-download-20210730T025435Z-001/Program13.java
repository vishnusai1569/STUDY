// Create a second thread by extending Thread
class ChildThread extends Thread {

	ChildThread() {
		// Create a new, second thread
		// Triggering the base class constructor Thread(String name)
		super("B1 Thread");
		System.out.println("Child thread: " + this);
		start(); // Start the thread
	}
	// This is the entry point for the second thread.
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
			System.out.println("Exiting child thread.");
	}
}

class Program13 {
	public static void main(String args[]) {
		new ChildThread(); // create a new thread
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}