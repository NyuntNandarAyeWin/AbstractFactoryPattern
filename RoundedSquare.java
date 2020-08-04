package abstractFactoryPattern;

public class RoundedSquare implements Shape{
	private double side;
	private double radius;
	
	public RoundedSquare() {
		// TODO Auto-generated constructor stub
	}
	
	public RoundedSquare(double side, double radius) {
		// TODO Auto-generated constructor stub
		this.side = side;
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside RoundedSquare::draw() method");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("RoundedRectangle area is "+((side*side)+(2*radius*(side+side))+Math.PI*radius*radius));
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("RoundedRectangle perimeter is "+(2*(side+side+(Math.PI*radius))));
	}

}
