package shapes;

public class Rhombus implements Shape
{
	private int dia1;
	private int dia2;
	private int side;

	public Rhombus(int dia1, int dia2, int side)
	{
		this.dia1 = dia1;
		this.dia2 = dia2;
		this.side = side;
	}
	
	@Override
	public double calculateArea()
	{
		double rhombusArea = (dia1 * dia2);
		return rhombusArea;
		//area found by multiplying the two diagonals
	}

	public double calculatePerimeter()
	{
		double rhombusPerimeter = (4 * side);
		return rhombusPerimeter;
		//perimeter is sum of all the 4 equal sides
	}

	@Override
	public String toString()
	{
		return "Rhombus Diagonal 1 Length: " + dia1 + " Rhombus Diagonal 2 Length: " + dia2 + " Rhombus Side Length: " + side + " Area: " + this.calculateArea() +
				" Perimeter: " + this.calculatePerimeter();
		//return area and perimeter found
	}
}