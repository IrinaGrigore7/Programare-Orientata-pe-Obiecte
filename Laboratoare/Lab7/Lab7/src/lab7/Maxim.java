package lab7;

public class Maxim {
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for(int i = 0; i < list.length; i++) {
			if(list[i].compareTo(max) > 0)
				max = list[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Maxim a = new Maxim();
		Integer[] arr = {12, 43, 54, 12};
		String[] arr1 = {"Ana", "are", "mere"};
		System.out.println(a.max(arr));
		System.out.println(a.max(arr1));
	}
}
