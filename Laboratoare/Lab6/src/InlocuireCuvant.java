import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InlocuireCuvant {
	
	public void replace(String cuv1, String cuv2, File file) throws FileNotFoundException {
		String copie;
		if(file.exists()) {
			  Scanner scan = new Scanner( file );
			  while(scan.hasNext()) {
		        	copie = scan.next();
		        	if(cuv1.equals(copie)) {
		        		cuv1 = cuv2.replaceAll(cuv1, cuv2);
		        		copie = cuv1;
		        	
		        	}
//		        	writer.append(" ");
//		        	writer.append(copie);
		        }
			  scan.close();
			  
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		String cuv1 = args[0];
		String cuv2 = args[1];
		File file =  new File( args[2] );
		
		InlocuireCuvant a = new InlocuireCuvant();
		a.replace(cuv1, cuv2, file);
		
		
	}
}
