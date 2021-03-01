import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopiereFisier {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Fisierul de intrare este: ");
		String a = in.next();
		System.out.println("Fisierul de iesire este: ");
		String b = in.next();
		
		FileInputStream input = new FileInputStream(a);

		FileOutputStream output = new FileOutputStream(b);

		byte[] buffer = new byte[1024];
	    int length;
	    int k = 0;
	    while ((length = input.read(buffer)) > 0) {
	    	output.write(buffer, 0, length);
	    	k = k + length;
	    }
	    
	    System.out.println("Fisierul contine " + k + " octeti");
	    
	    in.close();
	    input.close();
	    output.close();
	}
}