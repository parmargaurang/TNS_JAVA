package geometry;

public class Triangle {
	int h,b;

	public Triangle(int h, int b) {
		
		this.h = h;
		this.b = b;
	}

	@Override
	public String toString() {
		double area=0.5*h*b;
		return "Triangle [area=" + area +"]";
	}
	
	

}
