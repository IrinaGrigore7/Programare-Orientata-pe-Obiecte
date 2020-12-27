package tema1;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class Person {
	private String name;
	private int age;
	private String ticket;
	private boolean priorityEmbark;
	private boolean specialNeeds;
	private boolean remove;

	/**
	 * @param name numele persoanei
	 * @param age varsta
	 * @param ticket tipul de bilet
	 * @param priorityEmbark imbarcare prioritara
	 * @param specialNeeds nevoi speciale
	 * @param remove parametru folosit la stergerea unei persoane dintr-o entitate
	 */
	protected Person(String name, int age, String ticket, boolean priorityEmbark, boolean specialNeeds, boolean remove) {
		this.name = name;
		this.age = age;
		this.ticket = ticket;
		this.priorityEmbark = priorityEmbark;
		this.specialNeeds = specialNeeds;
		this.remove = remove;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public boolean getPriorityEmbark() {
		return priorityEmbark;
	}

	public void setPriorityEmbark(boolean priorityEmbark) {
		this.priorityEmbark = priorityEmbark;
	}

	public boolean getSpecialNeeds() {
		return specialNeeds;
	}

	public void setSpecialNeeds(boolean specialNeeds) {
		this.specialNeeds = specialNeeds;
	}
	
	public boolean getRemove() {
		return remove;
	}
	
	public void setRemove(boolean remove) {
		this.remove = remove;
	}

	public String toString() {
		return name + "  " + age + "  " + ticket + "  " + priorityEmbark + "  " + specialNeeds;
	}
}
