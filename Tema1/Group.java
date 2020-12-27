package tema1;

/**
 * @author Irina Grigore - 325CB
 *
 */
public class Group extends Passenger {

	/**
	 * @param p vector de persoane
	 * @param id id-ul corespunzator vectorului de persoane
	 */
	protected Group(Person[] p, String id) {
		super(p, id);
	}

	@Override
	public int getPointsForAge() {
		int points = 0;
		for (int i = 0; i < pers.length; i++) {
			if(pers[i] != null) {
				if (pers[i].getAge() >= 0 && pers[i].getAge() < 2)
					points = points + 20;
				if (pers[i].getAge() >= 2 && pers[i].getAge() < 5)
					points = points + 10;
				if (pers[i].getAge() >= 5 && pers[i].getAge() < 10)
					points = points + 5;
				if (pers[i].getAge() >= 10 && pers[i].getAge() < 60)
					points = points + 0;
				if (pers[i].getAge() >= 60)
					points = points + 15;
			}
		}
		return points;
	}

	@Override
	public int getPointsForTicket() {
		int points = 0;
		for (int i = 0; i < pers.length; i++) {
			if(pers[i] != null) {
				if (pers[i].getTicket().equals("b"))
					points = points + 35;
				if (pers[i].getTicket().equals("p"))
					points = points + 20;
				if (pers[i].getTicket().equals("e"))
					points = points + 0;
			}
		}
		return points;
	}

	@Override
	public int getPointsForSpecialNeeds() {
		int points = 0;
		for (int i = 0; i < pers.length; i++) {
			if(pers[i] != null)
				if (pers[i].getSpecialNeeds() == true)
					points = points + 100;
			}
		return points;
	}

	@Override
	public int getPointsForPriority() {
		int points = 0;
		for (int i = 0; i < pers.length; i++) {
			if(pers[i] != null)
				if (pers[i].getPriorityEmbark() == true)
					points = points + 30;
			}
		return points;
	}

	@Override
	public int getPriority() {
		return 5 + getPointsForAge() + getPointsForTicket() + getPointsForSpecialNeeds() + getPointsForPriority();
	}

	@Override
	public String getId() {
		return this.id;
	}

}
