package abstractFactoryPattern;

public class Rectangle implements Shape {
	private double length;
	private double width;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double length, double width) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle::draw() method");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle area is "+ (length*width));
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle perimeter is "+ 2 * (width + length));
	}

}
