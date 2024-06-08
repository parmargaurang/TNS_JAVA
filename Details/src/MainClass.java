import tns.Countery.*;
import State.*;



public class MainClass {

	public static void main(String[] args) {
		
		Country c1=new Country("india");
		State s2 =new State("gujrat");
		person p =new person("krishna",c1,s2,500000,19);
		System.out.println(p);
		TaxClass t= new TaxClass(p);

	}

}
