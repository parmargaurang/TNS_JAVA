
public class Transaction implements Bank {

	public void deposit(Account ac, int amount) {
		ac.Balance+=amount;
		System.out.println("Deposit done!");
		
	}

	
	public void widraw(Account ac, int amount) {
		
		ac.Balance+=amount;
	}

}
