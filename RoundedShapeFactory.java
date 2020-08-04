package abstractFactoryPattern;

import java.util.Scanner;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			System.out.print("Enter length value : ");
			double length = sc.nextDouble();
			System.out.print("Enter width value : ");
			double width = sc.nextDouble();
			System.out.print("Enter rounded radius value :");
			double radius = sc.nextDouble();
			return new RoundedRectangle(length, width, radius);
		}else if(shapeType.equalsIgnoreCase("Square")) {
			System.out.print("Enter side value : ");
			double side = sc.nextDouble();
			System.out.print("Enter rounded radius value :");
			double radius = sc.nextDouble();
			return new RoundedSquare(side,radius);
		}
		return null;
	}

}
