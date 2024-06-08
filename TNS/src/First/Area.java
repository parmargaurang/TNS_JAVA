package First;

public class Area {
	private int length;
    private int breadth;
    
    public Area() {
    	System.out.println("Area of rectangle");
    }

   
    public int getArea() {
    	return length*breadth;
    }

	public Area(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

    
	
}
