public class TaxClass {
    public TaxClass(person p) {
    	if (p.getAge() > 18) {
            double salary = p.getSalary();
            double tax;

            if (salary > 100000) {
                tax = 0.7 * salary;
                System.out.println("The tax is " + tax);
            } else if (salary > 50000) {
                tax = 0.5 * salary;
                System.out.println("The tax is " + tax);
            } else if (salary > 25000) {
                tax = 0.3 * salary;
                System.out.println("The tax is " + tax);
            } else {
                System.out.println("No tax");
            }
        } else {
            System.out.println("No tax");
        }
    }
}
