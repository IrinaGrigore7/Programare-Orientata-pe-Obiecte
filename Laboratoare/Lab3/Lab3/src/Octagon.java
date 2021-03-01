
public class Octagon extends GeometricObject implements Cloneable {
	private double latura;

	public Octagon(String color, boolean filled, double latura) {
		super(color, filled);
		this.latura = latura;
	}
	
	@Override
	public double getArea() {
		return ((2 + 4 / Math.sqrt(2)) * latura * latura);
	}

	@Override
	public double getPerimeter() {
		return 8 * this.latura;
	}

	@Override
	public void display() {
		System.out.println("Octagon cu latura de " + this.latura);
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
}
