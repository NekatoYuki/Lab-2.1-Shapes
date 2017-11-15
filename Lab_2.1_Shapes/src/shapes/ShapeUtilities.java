package shapes;

import java.util.Random;

/**
 * @author Mr Levin Created 10/16/2017 Lab 2.1 shapes
 *
 */

public class ShapeUtilities {

	/**
	 * Creates a random shape from the choices.
	 * 
	 * @return Shape Student Work: Update with your own shape.
	 */
	public static Shape randomShape() {
		Random rand = new Random();
		int x = rand.nextInt(5);

		switch (x) {
		case 0:
			return new Circle(rand.nextInt(100));
		case 1:
			return new Rectangle(rand.nextInt(50), rand.nextInt(50));
		case 2:
			return new Square(rand.nextInt(50));
		case 3:
			return new Triangle(rand.nextInt(50), rand.nextInt(50));
		case 4:
			return new Rhombus(rand.nextInt(50), rand.nextInt(50), rand.nextInt(50));
		default:
			return new Circle(rand.nextInt(100));
			// each case is for a different shape using rand.nextInt(x) to input a random value within 1 to x
		}

	}

	/**
	 * adds up the area of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumArea(Shape[] area) {
		double sumArea = 0;
		for(int a = 0; a < area.length; a++)
		{
			sumArea = sumArea + area[a].calculateArea();
		}
		return sumArea;
		//finds the area of all the array and adds them together to return the sum of all the areas
	}

	/**
	 * adds up the perimeter of all the shapes in the array
	 * 
	 * @param shapes
	 * @return double
	 */
	public static double sumPerimeter(Shape[] Perimeter) 
	{
		double sumPerimeter = 0;
		for(int a = 0; a < Perimeter.length; a++)
		{
			sumPerimeter = sumPerimeter + Perimeter[a].calculatePerimeter();
		}
		return sumPerimeter;
		//finds the perimeter of all the array and adds them together to return the sum of all the perimeter
	}

}
