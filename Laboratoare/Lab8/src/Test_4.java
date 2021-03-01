import java.util.PriorityQueue;

public class Test_4 {
	public static void main(String[] args) {
		PriorityQueue<Patient> pacient = new PriorityQueue<Patient>();
		pacient.add(new Patient("Ana", 12));
		pacient.add(new Patient("Ioana", 34));
		pacient.add(new Patient("Mircea", 9));
		for(int i = 0; i < 3; i++) {
			System.out.println(pacient.poll());
		}
	}
}
