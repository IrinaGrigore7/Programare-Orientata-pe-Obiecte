package lab7;

public class Square extends GeometricObject{
	protected double side;
	
	protected Square(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return this.side;
	}
	
	@Override
	double getArea() {
		return getSide() * getSide();
	}

	@Override
	void display() {
		System.out.println("Patrat cu latura de " + getSide() + " si aria de " + getArea());
	}

}
