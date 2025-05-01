// Controlling the main Thread.
class Program11 {
	public static void main(String args[]) {
		// The class to create the thread is "Thread"
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		// change the name of the thread
		t.setName("B1 Thread");
		System.out.println("Thread name after renaming: " + t);
		try {
			for(int n = 5; n > 0; n--) {
				System.out.println(n);
				// sleep - static method, suspends / halts the execution of the currentThread. Based on  the parameter passed on to the method, the execution halts. Unit is milliseconds.
				// 1000 ms.
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}
}