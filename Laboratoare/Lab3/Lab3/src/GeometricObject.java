import java.util.Date;
public abstract class GeometricObject implements Comparable {
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	protected GeometricObject() {
		color = "red";
		filled = false;
		dateCreated = new Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new Date();
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public abstract void display();
	
	public int compareTo(Object o) {
		if(getPerimeter() > ((GeometricObject) o).getPerimeter())
			return 1;
		else if (getPerimeter() < ((GeometricObject) o).getPerimeter())
			return -1;
		else return 0;
			
	}
	
	public static void main(String[] args) {
		Scene obj1 = new Scene(4);	
		GeometricObject circle1 = new Circle("black", true, 24);
		GeometricObject circle2 = new Circle("black", true, 67.4);
		GeometricObject rectangle1 = new Rectangle("black", true, 1, 1);
		GeometricObject rectangle2 = new Rectangle("black", true, 54.7, 32.1);
		
		obj1.add(circle1);
		obj1.add(circle2);
		obj1.add(rectangle1);
		obj1.add(rectangle2);
	
		obj1.displayAll();
		System.out.println("Aria totala este: " + obj1.areaAll());
		System.out.println("Perimetru total este: " + obj1.perimeterAll());
		
		for(GeometricObject o : Scene.obj) {
			System.out.println("Data la care a fost creat: " + o.getDateCreated());
		}
		
		obj1.sort();
		
		for(GeometricObject o : Scene.obj) {
			System.out.println("obiecte sortate "+ o.getPerimeter());
		}
		
		
	}
}
