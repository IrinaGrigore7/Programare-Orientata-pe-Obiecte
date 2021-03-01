package lab5;

public class BinaryToDecimal {
	public static int binaryToDecimal(String binaryString) {
		try {
			return Integer.parseInt(binaryString, 2);
		}
		
		catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(binaryToDecimal("11011011"));
		System.out.println(binaryToDecimal("110121101"));
	
	}
}
