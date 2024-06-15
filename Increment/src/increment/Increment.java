package increment;

public class Increment {
	int count;
	public  synchronized  void increment() {
		count++;  
	}

}