package tema1;

/**
 * @author Irina Grigore - 325CB
 *
 */
public abstract class Passenger {
	Person[] pers;
	String id;

	/**
	 * @param p vector de persoane
	 * @param id id-ul corespunzator fiecarui vector de persoane
	 */
	protected Passenger(Person[] p, String id) {
		this.pers = p.clone();
		this.id = id;
	}

	/**
	 * @return puntajul pe varsta pentru toti membrii unei entitati
	 */
	public abstract int getPointsForAge();

	/**
	 * @return puntajul pentru tipul de bilet ai tuturor membrilor unei entitati
	 */
	public abstract int getPointsForTicket();

	/**
	 * @return puntajul pentru pesoanele care au nevoi speciale
	 */
	public abstract int getPointsForSpecialNeeds();

	/**
	 * @return punctajul pentru persoanele cu imbarcare prioritara
	 */
	public abstract int getPointsForPriority();

	/**
	 * @return prioritatea totala, aceasta obtinandu-se insumand puntajele obtinute de catre 
	 * toti membrii entitatii, precum si punctajul aferent fiecarei entitati 
	 */
	public abstract int getPriority();

	/**
	 * @return id-ul corespunzator fiecarei entitati
	 */
	public abstract String getId();
}
