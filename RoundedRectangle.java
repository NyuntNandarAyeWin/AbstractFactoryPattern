package abstractFactoryPattern;

public class RoundedRectangle implements Shape {
	
	private double length;
	private double width;
	private double radius;
	
	public RoundedRectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public RoundedRectangle(double length, double width, double radius) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside RoundedRectangle::draw() method");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("RoundedRectangle area is "+((length*width)+(2*radius*(length+width))+Math.PI*radius*radius));
	}

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		System.out.println("RoundedRectangle perimeter is "+(2*(length+width+(Math.PI*radius))));
	}

}
