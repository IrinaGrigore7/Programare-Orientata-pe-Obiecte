package Inheritance;

public class Persoana {

	protected String nume;

	public Persoana(){
	}
	
	public Persoana(String nume) {
		this.nume = nume;
	}
	
	public String toString() {
		return "Persoana [nume=" + nume + "]";
	}	
	
	public static void main(String args[])
	{
		
		Persoana persoana[] = new Persoana[4];
		persoana[0] = new Profesor("Ionescu", "POO");
		persoana[1] = new Student("Popescu", 5);
		persoana[2] = new Student("Dumitru", 6);
		persoana[3] = new Student("Baciu", 7);
		
		for(int i = 0; i < persoana.length; i++)
		{
			if(persoana[i] instanceof Profesor)
			{
				((Profesor)persoana[i]).toString();
				((Profesor)persoana[i]).preda();
			}
			
			if(persoana[i] instanceof Student)
			{
				((Student)persoana[i]).toString();
				((Student)persoana[i]).invata();
			}
				
		}

}
}
