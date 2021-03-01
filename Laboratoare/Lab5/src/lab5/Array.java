package lab5;

import java.util.Random;

public class Array {
	int[] v;
	
	public Array() {
		Random rand = new Random();
		
		
		v = new int[50];
		
		for(int i = 0; i < v.length; i++) {
			v[i] = rand.nextInt(1000);
		}
	}
	
	public int getValue(int index) {
		try {
			return v[index];
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Array a = new Array();
		System.out.println(a.getValue(16));
		System.out.println(a.getValue(78));
	}
}
