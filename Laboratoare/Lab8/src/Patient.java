
public class Patient implements Comparable<Patient>{
	
	private String name;
	private int priority;
	
	public Patient(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(Patient o) {
		if(getPriority() < ((Patient) o).getPriority())
			return 1;
		else if (getPriority() > ((Patient) o).getPriority())
			return -1;
		return 0;
	}
	
	public String toString() {
		return name + " " + priority;
		
	}

}
