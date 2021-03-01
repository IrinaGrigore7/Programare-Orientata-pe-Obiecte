package lab7;

public abstract class GeometricObject implements Comparable{
	abstract double getArea();
	abstract void display();
	public int compareTo(Object o) {
		if(getArea() > ((GeometricObject) o).getArea())
			return 1;
		else if (getArea() < ((GeometricObject) o).getArea())
			return -1;
		else return 0;	
	}
}
