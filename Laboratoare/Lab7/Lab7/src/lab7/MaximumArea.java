package lab7;

import java.util.ArrayList;

public class MaximumArea {

	public static void maximumArea(ArrayList<? extends GeometricObject> list) {
		GeometricObject max = list.get(0);
		for(GeometricObject item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		max.display();
	}
	
	public static void maximumArea2(ArrayList<GeometricObject> list) {
		GeometricObject max = list.get(0);
		for(GeometricObject item : list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		max.display();
	}
}
