
public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	
	protected Rectangle() {
		
	}
	
	public Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return this.width * this.height;
	}

	@Override
	public double getPerimeter() {
		return 2 * (this.width * this.height);
	}

	@Override
	public void display() {
		System.out.println("Rectangle displayed of dimensions: " + this.width + " and " + this.height);
		
	}
	

}
