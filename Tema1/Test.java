package tema1;

import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class Test {
	/**
	 * folosita pentru a prelucra datele de intrare si pentru apelarea metodelor corespunzatoare temei
	 * @param args argumente metodei main
	 * @throws Exception aceasta exceptie este folosita pentru a prinde erorile cauzate in program
	 * @throws IOException aceasta exceptie este folosita pentru operatiuni de Input/Output esuate sau intrerupte
	 */
	public static void main(String[] args) throws Exception, IOException {

		Map<String, List<Person>> hashMap = new HashMap<>();

		AddPerson test = new AddPerson();
		File file = new File("queue.in");
		PrintWriter output = new PrintWriter("queue.out", "UTF-8");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		String[] parts;
		int numberOfPassengers = Integer.parseInt(br.readLine());
		PriorityQueue maxHeap = new PriorityQueue(numberOfPassengers, output);

		for (int i = 0; i < numberOfPassengers; i++) {
			st = br.readLine();
			parts = st.split(" ");
			Person pers = new Person(parts[1], Integer.parseInt(parts[2]), parts[3], Boolean.parseBoolean(parts[4]),
					Boolean.parseBoolean(parts[5]), false);
			test.addPerson(hashMap, parts[0], pers);
		}

		while ((st = br.readLine()) != null) {
			parts = st.split(" ");
			if (parts[0].equals("insert")) {
				switch (parts[1].charAt(0)) {
				case 's':
					Person[] pers1;
					List<Person> list1 = hashMap.get(parts[1]);
					pers1 = list1.toArray(new Person[list1.size()]);
					Passenger single = new Single(pers1, parts[1]);
					maxHeap.insert(single, single.getPriority());
					break;
				case 'f':
					Person[] pers2;
					List<Person> list2 = hashMap.get(parts[1]);
					pers2 = list2.toArray(new Person[list2.size()]);
					Passenger family = new Family(pers2, parts[1]);
					maxHeap.insert(family, family.getPriority());
					break;
				case 'g':
					Person[] pers3;
					List<Person> list3 = hashMap.get(parts[1]);
					pers3 = list3.toArray(new Person[list3.size()]);
					Passenger group = new Group(pers3, parts[1]);
					maxHeap.insert(group, group.getPriority());
					break;
				}
			}
			
			if (parts[0].equals("delete")) {
				Person[] person;
				List<Person> list1 = hashMap.get(parts[1]);
				person = list1.toArray(new Person[list1.size()]);
			
				if(parts.length == 3) {
					for(int i = 0; i < person.length; i++) {
						if(person[i].getName().equals(parts[2])) {
							person[i].setRemove(true);
						}
					}
				}
				switch (parts[1].charAt(0)) {
				case 's':
					Passenger single = new Single(person, parts[1]);
					maxHeap.delete(single);
					break;
					
				case 'f':
					Passenger family = new Family(person, parts[1]);
					maxHeap.delete(family);
					break;
					
				case 'g':
					Passenger group = new Group(person, parts[1]);
					maxHeap.delete(group);
					break;
				}
			}

			if (parts[0].equals("embark")) {
				maxHeap.embark();
			}

			if (parts[0].equals("list")) {
				maxHeap.list();
			}

		}
		output.close();
		br.close();
	}
}
