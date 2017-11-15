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
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		double circleArea = (pi * radius * radius);
		return circleArea;
		// area of circle = pi times radius times radius
	}

	@Override
	public double calculatePerimeter() {
		double circlePerimeter = (pi * 2 * radius);
		return circlePerimeter;
		// perimeter of circle = 2 times pi times radius
	}

	@Override
	public String toString() {
		return "Circle Radius: " + radius + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
		//returns area and perimeter found
	}
}
