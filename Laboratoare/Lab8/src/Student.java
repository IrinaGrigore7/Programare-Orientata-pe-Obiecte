
public class Student implements Comparable {
	public String nume;
	public float media;
	
	public Student(String nume, float media) {
		this.nume = nume;
		this.media = media;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		this.media = media;
	}
	
	public String toString() {
		return nume + " " + media;
		
	}
	@Override
	public int compareTo(Object o) {
		if(getMedia() > ((Student) o).getMedia())
			return 1;
		else if (getMedia() < ((Student) o).getMedia())
			return -1;
		return 0;
	}
	
}
