import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class MapStudents {
	HashMap<Integer, List<Student>> map = new HashMap<>();
	
	public MapStudents() {
	}
	
	public void add(Student student) {
		int media_rot = (int) (student.getMedia());
		for(int i = 0; i < 11; i++) {
			if(i == media_rot) {
				if(map.get(i) == null) {
					map.put(i, new ArrayList<Student>());
					map.get(i).add(student);
				}
				else
					map.get(i).add(student);
			}
		}
	}
	
	public void display() {
		System.out.println(map);
	}
	
	
}
