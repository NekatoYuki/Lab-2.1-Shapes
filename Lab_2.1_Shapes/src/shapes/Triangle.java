package shapes;

public class Triangle implements Shape
{
	private int length;
	private int height;

	public Triangle(int length, int height)
	{
		this.length = length;
		this.height = height;
	}
	
	@Override
	public double calculateArea()
	{
		double triangleArea = (0.5 * length * height);
		return triangleArea;
	}

	public double calculatePerimeter()
	{
		double trianglePerimeter = (3 * this.length);
		return trianglePerimeter;
	}

	@Override
	public String toString()
	{
		return "Triangle Side Length: " + length + " Triangle Height: " + height + " Area: " + this.calculateArea() +
				" Perimeter: " + this.calculatePerimeter();
	}
}
