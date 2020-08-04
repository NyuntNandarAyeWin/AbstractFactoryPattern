package abstractFactoryPattern;

import java.util.Scanner;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ans;
		
		do {
			System.out.print("Choose rounded or shape : ");
			String rounded = sc.nextLine();
			if(rounded.contains("rounded")) {
				AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
				System.out.print("Enter shape type : ");
				String type = sc.nextLine();
				Shape shape = shapeFactory.getShape(type);
				shape.draw();
				shape.area();
				shape.perimeter();
			}else {
				AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
				System.out.print("Enter shape type : ");
				String type = sc.nextLine();
				Shape shape = shapeFactory.getShape(type);
				shape.draw();
				shape.area();
				shape.perimeter();
			}
			
			System.out.println("Try again another shape type!!");
			ans = sc.nextLine();
		}while(ans.equals("yes"));
	}

}
