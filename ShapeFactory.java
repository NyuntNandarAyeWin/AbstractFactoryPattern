package abstractFactoryPattern;

import java.util.Scanner;

public class ShapeFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		if(shapeType.equalsIgnoreCase("Rectangle")) {
			System.out.print("Enter length value : ");
			double length = sc.nextDouble();
			System.out.print("Enter width value : ");
			double width = sc.nextDouble();
			return new Rectangle(length, width);
		}else if(shapeType.equalsIgnoreCase("Square")) {
			System.out.print("Enter side value : ");
			double side = sc.nextDouble();
			return new Square(side);
		}
		
		return null;
	}

}
