
public class BankMain {

	public static void main(String[] args) {
		Account ac=new Account(5000,19,"Rahul");
		Transaction tc=new Transaction();
		tc.deposit(ac, 400);
		System.out.println(ac);

	}

}
