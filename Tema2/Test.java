package tema2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class Test {
	/**
	 * metoda se ocupa de citirea din fisier, adaugarea camerelor in casa, precum si
	 * pentru apelearea metodelor corespunzatoare
	 * 
	 * @param args argumentele metodei main
	 * @throws IOException aceasta exceptie este folosita pentru operatiuni de
	 *                     Input/Output esuate sau intrerupte
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("therm.in");
		PrintWriter output = new PrintWriter("therm.out");

		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		String[] parts;
		st = br.readLine();
		parts = st.split(" ");
		int numberOfRooms;
		double temperature;
		int timeStampRef;
		double humidity = 0;
		if (parts.length == 3) {
			numberOfRooms = Integer.parseInt(parts[0]);
			temperature = Double.parseDouble(parts[1]);
			timeStampRef = Integer.parseInt(parts[2]);
		} else {
			numberOfRooms = Integer.parseInt(parts[0]);
			temperature = Double.parseDouble(parts[1]);
			humidity = Double.parseDouble(parts[2]);
			timeStampRef = Integer.parseInt(parts[3]);
		}

		HouseStructure house = new HouseStructure();

		for (int i = 0; i < numberOfRooms; i++) {
			st = br.readLine();
			parts = st.split(" ");
			RoomStructure room = new RoomStructure(parts[0], parts[1], Integer.parseInt(parts[2]));
			house.addRooms(room);
		}

		Observe observe = new Observe();
		ObserveH observeH = new ObserveH();
		Trigger trigger = new Trigger();
		List list = new List();
		while ((st = br.readLine()) != null) {
			parts = st.split(" ");
			switch (parts[0]) {
			case "OBSERVE":
				observe.observeMethod(house, parts, numberOfRooms, timeStampRef);
				break;
			case "OBSERVEH":
				observeH.observeHMethod(house, parts, numberOfRooms, timeStampRef);
				break;
			case "TRIGGER":
				trigger.triggerMethod(house, numberOfRooms, temperature, humidity, output);
				break;
			case "LIST":
				list.listMethod(house, parts, numberOfRooms, timeStampRef, output);
				break;
			case "TEMPERATURE":
				temperature = Double.parseDouble(parts[1]);
				break;
			default:
				break;
			}
		}

		br.close();
		output.close();

	}
}
