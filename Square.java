package abstractFactoryPattern;

public class Square implements Shape {
private double side;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	public Square(double side) {
		// TODO Auto-generated constructor stub
		this.side = side;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Square::draw() method");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Square area is "+ side * side);
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("Square perimeter is "+ 4*side);
	}

}
