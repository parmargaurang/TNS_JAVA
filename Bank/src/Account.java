
public class Account {

public int Balance=0, age;
@Override
public String toString() {
	return "Account [Balance=" + Balance + ", age=" + age + ", name=" + name + "]";
}
public int getBalance() {
	return Balance;
}
public void setBalance(int balance) {
	Balance = balance;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public Account(int balance, int age, String name) {
	super();
	Balance = balance;
	this.age = age;
	this.name = name;
}
public void setName(String name) {
	this.name = name;
}
public String name;



}
