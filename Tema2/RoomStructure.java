package tema2;

import java.util.HashMap;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class RoomStructure {
	private String room;
	private String id;
	private int surface;
	HashMap<Integer, TimeInterval> interval = new HashMap<Integer, TimeInterval>(24);

	public RoomStructure() {

	}

	/**
	 * @param room    numele camerei
	 * @param id      device-id
	 * @param surface suprafata camerei
	 */
	public RoomStructure(String room, String id, int surface) {
		this.room = room;
		this.id = id;
		this.surface = surface;
		for (int i = 1; i <= 24; i++) {
			interval.put(i, new TimeInterval());
		}
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSurface() {
		return surface;
	}

	public void setSurface(int surface) {
		this.surface = surface;
	}

}
