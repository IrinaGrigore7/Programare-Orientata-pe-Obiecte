
public class MyArray {
	int[] tablou;
	int iterator = 0;
	
	protected MyArray(int n) {
		tablou = new int[n];
		for(int i = 0; i < n; i++)
			tablou[i] = i;
	}
	
    class ArrayIterator {
		
    	
    	public boolean hasNext() {
    		if(iterator != tablou.length)
    			return true;
    		else
    			return false;
    	}
    	
    	public boolean hasPrevious() {
    		if(iterator != 0)
    			return true;
    		else
    			return false;
    	}
    	
    	public int next() {
    		int aux;
    		if(iterator != tablou.length)
    		{
    			aux = tablou[iterator];
    			iterator++;
    			return aux;
    		}
    		else
    			return -1;
    	}
    	
    	public int nextIndex() {
    		if(iterator != tablou.length)
    			return iterator-1;
    		else
    			return -1;
    	}
    	
    	public int previous() {
    		int aux;
    		if(iterator != 0) {
    			aux = tablou[iterator - 1];
        		iterator--;
        		return aux;
    		}
    		else
    			return -1;
    	}
    	
    	public int previousIndex() {
    		if(iterator != 0)
    			return iterator - 1;
    		else
    			return -1;
    	} 
	}
    
    public void printForward() {
    	ArrayIterator obj = new ArrayIterator();
    	while(obj.hasNext() == true)
    		System.out.print(obj.next() + " ");
    }
    
    public void printBackward() {
    	ArrayIterator obj = new ArrayIterator();
    	while(obj.hasPrevious() == true) {
    		//System.out.println(iterator);
    		System.out.print(obj.previous() + " ");
    	}
    }
    
    public int firstMultiple(int k) {
    	ArrayIterator obj = new ArrayIterator();
    	obj.next(); //pentru a nu da mereu multiplu 0
    	while(obj.hasNext() == true) {
    		if(obj.next() % k == 0)
    			return obj.nextIndex();
    	}
    	return -1;
    }
    
    
    public static void main(String[] args) {
		MyArray obj = new MyArray(20);
		MyArray.ArrayIterator obj1 = obj.new ArrayIterator();
		obj.printForward();
		System.out.println();
		obj.printBackward();
		System.out.println();
		System.out.println("Primul multiplu al lui k este " + obj.firstMultiple(3));
	}
 
}
