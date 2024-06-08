
public class Employee extends Member {
	String specialization;

	public Employee(String specialization,String name, String address, int age, int phone, int salary) {
		super(name, address,age,phone,salary);
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Employee [specialization=" + specialization + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getAge()=" + getAge() + ", getPhone()=" + getPhone() + ", getSalary()="
				+ getSalary() + "]";
	}

	
	
	

}
