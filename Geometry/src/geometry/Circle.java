package geometry;

public class Circle {
		double Radius;

		public Circle(double radius) {
			
			Radius = radius;
		}

		@Override
		public String toString() {
			double area=2*3.14*Radius;
			return "Circle [area=" + area + "]";
		}
		
		
		
		
}
