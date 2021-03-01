
public class TestOctagon {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon octagon1 = new Octagon("black", true, 12);
		
		System.out.println("Octagonul are preimetrul " + octagon1.getPerimeter());
		System.out.println("Octagonul are aria " + octagon1.getArea());
		
		Octagon octagon2 = (Octagon)octagon1.clone();
		
		System.out.println(octagon1.compareTo(octagon2));
	}
}
