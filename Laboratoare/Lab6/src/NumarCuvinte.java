import java.io.File;
import java.util.Scanner;

public class NumarCuvinte {
	
	
	public int NrCuvinte(File file) throws Exception {
		if(file.exists()) {
			int nr=0;
			  Scanner scan = new Scanner( file );
			  while(scan.hasNext()) {
				  String str1 = scan.nextLine();
				  String str2 = str1.replace(".", " ");
				  String[] tok = str2.split(" ");
				  nr = nr + tok.length;
			  }
			  scan.close();
			  return nr;
			
		}
		else
			return -1;
	}

    public static void main(String[] args) throws Exception 
    { 

      
        File input = new File( args[0] ); 
        NumarCuvinte a = new NumarCuvinte();
        
        System.out.println("numarul de cuvinte din fisier este " + a.NrCuvinte(input));
  
        
    }
}