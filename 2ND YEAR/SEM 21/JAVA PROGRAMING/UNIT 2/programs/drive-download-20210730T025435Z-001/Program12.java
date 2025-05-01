// Create a second thread.
// User defined class - ChildThread
// ChildThread - implements the interface Runnable
// Runnable - Interface is for Child Threads
class ChildThread implements Runnable {
	Thread t; // Thread object
	ChildThread() { // default constructor
	// Create a new, second thread
	// main thread is the parent for the thread identified by B1 Thread.
		t = new Thread(this, "B1 Thread");
		System.out.println("Child thread: " + t);
		t.start(); // Start the thread
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

class Program12 {
	public static void main(String args[ ] ) {
		new ChildThread(); // create a new thread
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread waiting for the child to complete.");
	}
}