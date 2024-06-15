package increment;

public class Main extends Thread{

	public static void main(String[] args) {
		Increment counter = new Increment();

        
        Thread thread1 = new CountingThread(counter);
        Thread thread2 = new CountingThread(counter);

        
        thread1.start();
        thread2.start();

       
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        System.out.println("Final count: " + counter.count);
		

	}

}