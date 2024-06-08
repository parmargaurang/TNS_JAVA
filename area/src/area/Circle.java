package area;

public class Circle {
	final double pi=3.14;
	int radius;
	final void CircleArea(int r){
		radius=r;
		System.out.println("The area of circle is :-"+(this.pi*radius*radius));
	}

}
