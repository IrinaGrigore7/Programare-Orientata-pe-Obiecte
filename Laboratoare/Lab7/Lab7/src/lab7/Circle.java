package lab7;

public class Circle extends GeometricObject{
	protected double radius;

	Circle(double radius){
		this.radius = radius;
	}
	
	@Override
	double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	void display() {
		System.out.println("Cerc cu raza de " + radius + " si aria de " + getArea());
		
	}
	
}
