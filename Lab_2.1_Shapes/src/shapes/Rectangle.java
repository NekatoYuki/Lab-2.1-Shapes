package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public class Rectangle implements Shape {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public double calculateArea() {
		double rectangleArea = length * width;
		return rectangleArea;
		//how to find area of rectangle
	}


	public double calculatePerimeter() {
		double rectanglePerimeter = (2*length) + (2*width);
		return rectanglePerimeter;
		//how to find perimeter of rectangle
	}


	public String toString() {
		return "Rectangle Width: " + width + " Length: " + length + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
		//returns area and perimeter found
	}
}
