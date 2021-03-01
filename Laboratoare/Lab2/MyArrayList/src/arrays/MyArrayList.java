package arrays;

public class MyArrayList {
    int[] v;
	private int size;
	

	public MyArrayList() {
		 v = new int[10];
	}

	public MyArrayList(int capacity) {
		 v = new int[capacity];
	}

	public void add(int value) 
	{
		if (size + 1 > v.length)
		{
			int[] w = new int[2 * v.length];
			System.arraycopy(v, 0, w, 0, size);
			v = w;
		}	
		v[size] = value;
		size++;
	}

	public int get(int index) {
		return v[index];
	}

	public int size() 
	{
		return size;	
	}
	
}
