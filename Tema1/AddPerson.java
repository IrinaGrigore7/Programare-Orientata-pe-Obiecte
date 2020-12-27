package tema1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class AddPerson {
	/**
	 * metoda este folosita pentru a stoca toate informatiile despre pasageri intr-un hashmap
	 * @param hashMap retine toate detaliile despre pasageri
	 * @param key reprezinta id-ul la care trebuie adaugat fiecare pasager
	 * @param pers persoana care trebuie adaugata in map
	 */
	public void addPerson(Map<String, List<Person>> hashMap, String key, Person pers) {
		List<Person> people = hashMap.get(key);

		if (people == null) {
			people = new ArrayList<Person>();
			people.add(pers);
			hashMap.put(key, people);
		} else {
			people.add(pers);
			hashMap.put(key, people);
		}
	}
}