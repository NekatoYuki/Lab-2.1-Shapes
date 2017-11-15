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
		// equation to calculate area of triange
	}

	public double calculatePerimeter()
	{
		double trianglePerimeter = (3 * this.length);
		return trianglePerimeter;
		// regular triangle has 3 same sides
	}

	@Override
	public String toString()
	{
		return "Triangle Side Length: " + length + " Triangle Height: " + height + " Area: " + this.calculateArea() +
				" Perimeter: " + this.calculatePerimeter();
		//returns area and perimeter found
	}
}
