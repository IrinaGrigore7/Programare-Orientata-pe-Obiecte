package lab7;

public class Rectangle extends GeometricObject{
	protected double width;
	protected double height;
	
	protected Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	@Override
	double getArea() {
		return getWidth() * getHeight();
	}

	@Override
	void display() {
		System.out.println("Dreptunghi cu lungimea " + getHeight() + ", latimea " + getWidth() + " si aria " + getArea());
		
	}
	

}
