package arrays;

import java.util.*;

public class ArrayTest {
	public static void main(String[] args)
	{
		MyArrayList a = new MyArrayList(5);
		Random generator = new Random();
	
		for(int i = 0; i < 10; i++) {
			int value= generator.nextInt(100);
			a.add(value);
		}
		
		System.out.print("Vectorul este: ");
		for(int i = 0; i < 10; i++)
			System.out.print(a.get(i) + " ");
		
	}
}
