package register;

public class Entery {
	
	    String name;
	    String address;
	    String telephoneNumber;
	    String mobileNumber;
	    String headOfFamily;
	    String uniqueID;

	    public Entery(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueID) {
	        this.name = name;
	        this.address = address;
	        this.telephoneNumber = telephoneNumber;
	        this.mobileNumber = mobileNumber;
	        this.headOfFamily = headOfFamily;
	        this.uniqueID = uniqueID;
	    }

	    @Override
	    public String toString() {
	        return "Unique ID: " + uniqueID +
	                ", Name: " + name +
	                ", Address: " + address +
	                ", Telephone Number: " + telephoneNumber +
	                ", Mobile Number: " + mobileNumber +
	                ", Head of Family: " + headOfFamily;
	    }

}
