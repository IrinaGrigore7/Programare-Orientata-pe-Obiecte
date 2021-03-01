
public class Circle extends GeometricObject {
	private double radius;
	
	protected Circle() {
		
	}
	
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	@Override
	public double getPerimeter() {
		return 2 * this.radius * Math.PI;
	}

	@Override
	public void display() {
		System.out.println("Circle displayed of radius: " + this.radius);
	}
	
}
