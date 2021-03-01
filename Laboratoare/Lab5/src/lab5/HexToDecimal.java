package lab5;

public class HexToDecimal {
	public static int hexToDecimal(String hexString) {
		try {
			return Integer.parseInt(hexString, 16);
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(hexToDecimal("11ABC"));
		System.out.println(hexToDecimal("100AACZ"));
	}
}
