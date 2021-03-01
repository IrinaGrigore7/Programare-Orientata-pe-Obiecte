package lab7;

import java.util.ArrayList;

public class TestGeometricObject {
	public static void main(String[] args) {
		 ArrayList<GeometricObject> pList = new ArrayList<GeometricObject>();
		 ArrayList<Circle> list2 = new ArrayList<Circle>();
		 
		 pList.add(new Circle(2));
		 pList.add(new Rectangle(2, 3));
		 pList.add(new Square(1));
		 
		 list2.add(new Circle(1));
		 list2.add(new Circle(4));
		 list2.add(new Circle(7));
		 
		 MaximumArea.maximumArea(pList);
		 MaximumArea.maximumArea2(pList);
		 MaximumArea.maximumArea(list2);
		//MaximumArea.maximumArea2(list2);
	}
}
