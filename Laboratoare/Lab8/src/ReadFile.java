import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class ReadFile {
	public static void main(String[] args) throws IOException {
	//	File file = new File("D:\\Laboratoare POO\\Lab8\\input.in");
		
		File file = new File(args[0]);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		String[] parts;
		
		TreeSet<String> set = new TreeSet<String>();
		while ((st = br.readLine()) != null) {
			parts = st.split(" |\\,|\\.");
			for(int i = 0; i < parts.length; i++)
				set.add(parts[i]);
		}
		
		System.out.println(set);
		
		br.close();
	}
}
