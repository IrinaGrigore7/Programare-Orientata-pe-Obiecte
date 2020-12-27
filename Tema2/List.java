package tema2;

import java.io.PrintWriter;
import java.util.Locale;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class List {
	/**
	 * metoda calculeaza intervalele intre care trebuie afisate temperaturile
	 * 
	 * @param house         este array-ul de camere
	 * @param parts         stringul care contine numele camerei si cele doua
	 *                      intervale de timp
	 * @param numberOfRooms numarul total al camerelor din locuinta
	 * @param timeStampRef  timestamp-ul de referinta primit la inceput inputului
	 * @param output        fisierul in care se face scriere
	 */
	public void listMethod(HouseStructure house, String parts[],int numberOfRooms, int timeStampRef, PrintWriter output) {
		int init =  24 - ((timeStampRef - Integer.parseInt(parts[2])) / 3600);
		int fin =  24 - ((timeStampRef - Integer.parseInt(parts[3])) / 3600);
		for(int i = 0; i < numberOfRooms; i++) {
			if(house.rooms.get(i).getRoom().equals(parts[1]) == true) {
				output.print(parts[1]);
				for(int j = fin; j > init; j--)
					for(Object obj : house.rooms.get(i).interval.get(j).temp) {
						output.print(" " + String.format(Locale.US, "%.2f", obj));
					}
				output.println();
			}
		}
	}
}
