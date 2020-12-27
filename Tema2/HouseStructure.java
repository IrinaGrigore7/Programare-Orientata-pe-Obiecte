package tema2;

import java.util.ArrayList;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class HouseStructure {
	ArrayList<RoomStructure> rooms = new ArrayList<>();
	
	/**
	 * metoda adauga camere in locuinta
	 * 
	 * @param room camera care trebuie adaugata in array
	 */
	public void addRooms(RoomStructure room) {
		rooms.add(room);
	}
}
