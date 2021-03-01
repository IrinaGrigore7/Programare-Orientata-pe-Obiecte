package lab7;

import java.util.ArrayList;

public class GenericStack<E> {
	public ArrayList<E> list = new ArrayList<E>();
	
	public int getSize() {
		return list.size();
	}
	
	public void push(E o) {
		list.add(o);
	}
	
	public E peek() {
		return list.get(getSize() - 1);
	}
	
	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;

	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public static <E> void printStack(GenericStack<E> st) {
		for(int i = 0; i < st.getSize(); i++){
		    System.out.print(st.list.get(i) + " ");
		} 
	}

	public static void main(String[] args) {
		 GenericStack<Integer> list1 = new  GenericStack<Integer>();
		 GenericStack<Double> list2 = new  GenericStack<Double>();
		 GenericStack<String> list3 = new  GenericStack<String>();

		 list1.push(12);
		 list1.push(56);
		 list1.push(100); 
		 System.out.print("Stiva de Integer este: ");
		 list1.printStack(list1);
		 list1.pop();
		 list1.pop();
		 list1.pop();
		 System.out.println();
		 System.out.println("Stiva este goala: " + list1.isEmpty());
		 System.out.println();
		 
		 list2.push(13.3);
		 list2.push(54.1);
		 list2.push(90.0);
		 System.out.print("Stiva de Double este: ");
		 list2.printStack(list2);
		 
		 System.out.println();
		 list3.push("Ana");
		 list3.push("are");
		 list3.push("mere");
		 System.out.print("Stiva de String este: ");
		 list3.printStack(list3);
		 
		 
		 
	}
}
