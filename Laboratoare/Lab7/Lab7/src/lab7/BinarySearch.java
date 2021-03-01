package lab7;

public class BinarySearch {
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		int l = 0;
		int r = list.length - 1;
		int m = 0;
		while(l <= r) {
			m = (l + r) / 2;
			if(list[m].compareTo(key) == 0)
				return m;
			if(list[m].compareTo(key) < 0)
				l = m + 1;
			else 
				r = m -1;
		}	
		return -1;
		}
	
	public static void main(String[] args) {
		BinarySearch list = new BinarySearch();
		Integer[] arr = {1, 2, 3, 4, 5, 6};
		if(list.binarySearch(arr, 4) == -1)
			System.out.println("Elementul nu a fost gasit");
		else
			System.out.println("Elementul a fost gasit pe pozitia " + list.binarySearch(arr, 4));
		
		String[] arr1 = {"Ana", "are", "mere"};
		if(list.binarySearch(arr1, "mere") == -1)
			System.out.println("Elementul nu a fost gasit");
		else
			System.out.println("Elementul a fost gasit pe pozitia " + list.binarySearch(arr1, "mere"));
		
	}
}
