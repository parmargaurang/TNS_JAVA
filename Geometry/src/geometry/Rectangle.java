package geometry;

public class Rectangle {
	int l,b;

	public Rectangle(int l, int b) {
		
		this.l = l;
		this.b = b;
	}

	@Override
	public String toString() {
		int area=l*b;
		return "Rectangle [area=" + area +"]";
	}
	

}
