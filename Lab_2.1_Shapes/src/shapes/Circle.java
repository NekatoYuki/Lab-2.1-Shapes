package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Circle implements Shape {

	// fields
	private int radius;
	private static double pi = 3.14;

	/**
	 * Constructor method
	 * 
	 * @param radius
	 * @return 
	 */
	public Circle(int radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}

	@Override
	public double calculateArea() {
		double circleArea = (pi * radius * radius);
		return circleArea;
	}

	@Override
	public double calculatePerimeter() {
		double circlePerimeter = (pi * 2 * radius);
		return circlePerimeter;
	}

	@Override
	public String toString() {
		return "Circle Radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
