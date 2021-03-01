package lab5;

public class StackOverflow {
    
    public static void recursivePrint(int num) {
        System.out.println("Number: " + num);
         
        if(num == 0)
            return;
        else
            recursivePrint(++num);
    }
     
    public static void main(String[] args) {
    	//try {
    		StackOverflow.recursivePrint(1);
    	//}
    	
    	//catch(StackOverflowError ex) {
    	//	System.out.println(ex.getMessage());
    	//}
    }
}
