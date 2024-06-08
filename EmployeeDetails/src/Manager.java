
public class Manager extends Member {
	String department;
	public Manager(String department,String name, String address, int age, int phone, int salary) {
		super(name, address,age,phone,salary);
		this.department = department;
	}
	@Override
	public String toString() {
		return "Manager [department=" + department + ", getName()=" + getName() + ", getAddress()=" + getAddress()
				+ ", getAge()=" + getAge() + ", getPhone()=" + getPhone() + ", getSalary()=" + getSalary()
				+ "]";
	}
	
	

}
