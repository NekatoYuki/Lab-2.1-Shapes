package shapes;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */
public interface Shape {
	
	private int length;
	private int height;
	
	public Triangle(int length)
	{
		this.length = length;
		this.height = height;
	}
	
	@Override
	public abstract double calculateArea()
	{
		int triangleArea = (0.5 * length * height);
		return triangleArea;
	}

	public abstract double calculatePerimeter()
	{
		int trianglePerimeter = (3 * length);
		return trianglePerimeter;
	}

	@Override
	public abstract String toString()
	{
		return "Triangle Side Length: " + side + " Triangle Height: " + height + " Area: " + this.calculateArea() +
				" Perimeter: " + this.calculatePerimeter();
	}
}