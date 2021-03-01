import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test_2 {
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();
		set.add(new Student("Ana", 9.23f));
		set.add(new Student("Andrei", 7.13f));
		set.add(new Student("Ana", 9.23f));
		set.add(new Student("Ioana", 8.23f));
		
		System.out.println(set);
	}
}
