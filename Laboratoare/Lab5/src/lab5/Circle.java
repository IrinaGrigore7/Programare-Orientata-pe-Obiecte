package lab5;

public class Circle {
	private double radius;
	static int number;
	
	void setRadius(double newRadius) throws InvalidRadiusException{
		if(newRadius < 0) {
			throw new InvalidRadiusException();
			//throw new IllegalArgumentException("Invalid radius");
		}
		this.radius = newRadius;
	}
	
	Circle(double newRadius){
		
		try {
			setRadius(newRadius);
			number = number + 1;
		}
		
		catch(InvalidRadiusException ex){
			ex.printStackTrace();
		}
	}
	
	
	public double getArea(Circle c) {
		return 2 * Math.PI * c.radius;
	}
	
	public static void main(String[] args) {
			Circle c1 = new Circle(12);
			Circle c2 = new Circle(15);
			Circle c3 = new Circle(-17);
			System.out.println("Numarul de elemente instantiate este " + Circle.number);
			System.out.println("Aria este: " + c1.getArea(c1));
			System.out.println("Aria este: " + c2.getArea(c2));
			System.out.println("Aria este: " + c3.getArea(c3));
		
	}
}
