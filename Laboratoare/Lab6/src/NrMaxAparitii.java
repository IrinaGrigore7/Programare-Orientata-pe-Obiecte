import java.util.Scanner;

public class NrMaxAparitii {


	public void Caracter() {
		 Scanner myObj = new Scanner(System.in);
		 String string = myObj.nextLine(); 
		 String str =  string.toLowerCase();
		 int nr1 = 0;
		 int nr2 = 0;
		 int index = 0;
		 
		 for(int i = 97; i < 123; i++) {
			 nr2 = 0;
			 for(int j = 0; j < str.length(); j++) {
				 if((char)i == str.charAt(j)) {
					 nr2++;
				 }
			 }
			 if(nr2 > nr1) {
				 nr1 = nr2;
				 index = i;
			 }
		 }
		 System.out.println( " ' " + Character.toString((char)index) + " '" + " are frecventa cea mai mare ");
	}
	
	
	public static void main(String[] args) {
		NrMaxAparitii a = new NrMaxAparitii();
		a.Caracter();
	}
}
