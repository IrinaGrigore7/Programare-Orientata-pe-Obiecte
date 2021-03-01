import java.util.Arrays;

public class Scene {
    static GeometricObject[] obj;
	int idx;
	
	protected Scene(int nr_el) {
		obj = new GeometricObject[nr_el];
	}
	
	public void add(GeometricObject o) {
		obj[idx] = o;
		idx++;
	}
	
	public void displayAll() {
		for(int i = 0; i < idx; i++) {
			obj[i].display();
		}
	}
	
	public double areaAll() {
		double arieTotala = 0;
		for(int i = 0; i < idx; i++) {
			arieTotala = arieTotala + obj[i].getArea();
		}
		return arieTotala;
	}
	
	public double perimeterAll() {
		double perimetruTotal = 0;
		for(int i = 0; i < idx; i++) {
			perimetruTotal = perimetruTotal + obj[i].getPerimeter();
		}
		return perimetruTotal;
	}
	
	public void sort() {
		Arrays.sort(obj);
	}
}
