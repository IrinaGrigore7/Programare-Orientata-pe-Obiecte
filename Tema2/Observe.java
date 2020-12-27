package tema2;


/**
 * @author Irina Grigore - 325CB
 *
 */
public class Observe {
	/**
	 * matoda adauga temperatura primita ca parametru in camera in intervalul
	 * corespunzator
	 * 
	 * @param house         array de camere
	 * @param parts         stringul care contine id-ul device-ului, timestampul si
	 *                      temperatura
	 * @param numberOfRooms numarul total al camerelor
	 * @param timeStampRef  timestamp-ul de referinta
	 */
	public void observeMethod(HouseStructure house, String parts[], int numberOfRooms, int timeStampRef) {
		Double temp = Double.parseDouble(parts[3]);
		
		for(int i = 0; i < numberOfRooms; i++) {
			if(house.rooms.get(i).getId().equals(parts[1]) == true) {
				int time = 24 - ((timeStampRef - Integer.parseInt(parts[2])) / 3600);
				if(time > 0 && time <= 24 && timeStampRef > Integer.parseInt(parts[2]))
					house.rooms.get(i).interval.get(time).temp.add(temp);
			}
		}
	}
}
