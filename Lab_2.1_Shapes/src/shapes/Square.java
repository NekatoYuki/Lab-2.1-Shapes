package shapes;

public class Square extends Rectangle {

	int side;

	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	
	public double calculateArea()
	{
		double squareArea = side * side;
		return squareArea; //area = side times side since all sides of square is the same
	}
	
	public double calculatePerimeter()
	{
		double squarePerimeter = (4 * side);
		return squarePerimeter; //perimeter = 4 * side since square has 4 same sides
	}

	@Override
	public String toString() {
		return "Square Side: " + side + " Area: " + this.calculateArea() + " Perimeter: " 
				+ this.calculatePerimeter();
		//return the area and perimeter found
	}

}
