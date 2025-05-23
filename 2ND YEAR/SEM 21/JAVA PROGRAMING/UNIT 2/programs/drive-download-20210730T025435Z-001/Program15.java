// Using join() to wait for threads to finish.
class NewThread implements Runnable {
	String name; // name of thread
	Thread t;
	NewThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start(); // Start the thread
	}
	// This is the entry point for thread.
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}
}
class Program15 {
	public static void main(String args[]) {
		NewThread ob1 = new NewThread("Thread One");
		NewThread ob2 = new NewThread("Thread Two");
		NewThread ob3 = new NewThread("Thread Three");
		System.out.println("Thread One is alive: " +  ob1.t.isAlive());
		System.out.println("Thread Two is alive: " + ob2.t.isAlive());
		System.out.println("Thread Three is alive: " + ob3.t.isAlive());
		// Set the priority and observe the results.
		//ob3.t.setPriority(1);
		//ob2.t.setPriority(6);
		//ob1.t.setPriority(4);
		// wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join(); // main thread waits for the ob1 to complete.
			ob2.t.join(); // main thread waits for the ob2 to complete.
			ob3.t.join(); // // main thread waits for the ob3 to complete.
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Thread One is alive: " + ob1.t.isAlive());
		System.out.println("Thread Two is alive: " + ob2.t.isAlive());
		System.out.println("Thread Three is alive: " + ob3.t.isAlive());
		System.out.println("Main thread exiting.");
	}
}