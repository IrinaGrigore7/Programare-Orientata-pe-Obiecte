package tema2;

import java.io.PrintWriter;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class Trigger {
	/**
	 * metoda calculeaza media ponderata dintre temperaturile, respectiv umiditatile
	 * minime din ultima ora si suprafatele camerelor, vazand daca este nevoie de
	 * pornirea centralei sau nu
	 * 
	 * @param house         array-ul de camere
	 * @param numberOfRooms numarul camerelor din house
	 * @param temperature   temperatura globala
	 * @param humidity      umiditatea globala
	 * @param output        fisierul in care se face scrierea
	 */
	public void triggerMethod(HouseStructure house, int numberOfRooms, double temperature, double humidity,
			PrintWriter output) {
		double sum = 0;
		double sumOfSurface = 0;
		if (humidity == 0) {
			for (int i = 0; i < numberOfRooms; i++) {
				int ok = 0;
				for (int j = 24; j >= 1; j--) {
					if (house.rooms.get(i).interval.get(j).temp.isEmpty() == false) {
						ok = 1;
						sum = sum + (house.rooms.get(i).interval.get(j).temp.first() * house.rooms.get(i).getSurface());
						break;
					}
				}
				if (ok == 1) {
					sumOfSurface = sumOfSurface + house.rooms.get(i).getSurface();
				}
			}
			double weightedAverage = 0;
			weightedAverage = sum / sumOfSurface;

			if (temperature > weightedAverage)
				output.println("YES");
			else
				output.println("NO");
		} else {
			for (int i = 0; i < numberOfRooms; i++) {
				int ok = 0;
				for (int j = 24; j >= 1; j--) {
					if (house.rooms.get(i).interval.get(j).humidity.isEmpty() == false) {
						ok = 1;
						sum = sum + (house.rooms.get(i).interval.get(j).humidity.first()
								* house.rooms.get(i).getSurface());
						break;
					}
				}
				if (ok == 1) {
					sumOfSurface = sumOfSurface + house.rooms.get(i).getSurface();
				}
			}
			double weightedAverage = 0;
			weightedAverage = sum / sumOfSurface;

			if (humidity < weightedAverage)
				output.println("YES");
			else
				output.println("NO");
		}
	}
}
