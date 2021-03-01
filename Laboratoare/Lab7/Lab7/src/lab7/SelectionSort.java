package lab7;

public class SelectionSort {
	public static <E extends Comparable<E>> void selectionSort(E[] list) {
		 int n = list.length;
		 
	        for (int i = 0; i < n-1; i++)
	        {
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	            	if(list[j].compareTo(list[min_idx]) < 0)
	            		min_idx = j;
	 
	            E temp = list[min_idx];
	            list[min_idx] = list[i];
	            list[i] = temp;
	        }
	}
	
	public static void main(String[] args) {
		SelectionSort a = new SelectionSort();
		Integer[] arr = {1 ,2 , 5, 7, 3, 4, 10, 18, 12};
		a.selectionSort(arr);
		
		Double[] arr1 = {1.2, 2.7 , 5.4, 7.1, 3.4, 2.3};
		a.selectionSort(arr1);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}
