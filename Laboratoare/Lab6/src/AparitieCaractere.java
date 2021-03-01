import java.util.Scanner; 

public class AparitieCaractere {
	
	public void Caracter() {
		 Scanner myObj = new Scanner(System.in);
		 String string = myObj.nextLine(); 
		 String str =  string.toLowerCase();
		 int nr;
		 
		 for(int i = 97; i < 123; i++) {
			 nr = 0;
			 for(int j = 0; j < str.length(); j++) {
				 if((char)i == str.charAt(j)) {
					 nr++;
				 }
			 }
			System.out.println( " ' " + Character.toString((char)i) + " '" + " apare de " + nr + " ori");
		 }
	}
	

	public static void main(String[] args) {
		AparitieCaractere a = new AparitieCaractere();
		a.Caracter();
		
	}
}

