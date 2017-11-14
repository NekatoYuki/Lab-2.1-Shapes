package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public interface Shape {
	
	private double length;
	private double height;
	
	public Triangle(int length)
	{
		this.length = length;
	}
	
	@Override
	public abstract double calculateArea()
	{
		double triangleArea = (0.5 * length * height);
		return triangleArea;
	}

	public abstract double calculatePerimeter()
	{
		double trianglePerimeter = (3 * length);
		return trianglePerimeter;
	}

	@Override
	public abstract String toString()
	{
		return "Triangle Side Length: " + side + " Area: " + this.calculateArea() +
				" Perimeter: " + this.calculatePerimeter();
	}
}
