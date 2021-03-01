package Inheritance;

public class Profesor extends Persoana{

	private String materie;
	
	public Profesor()
	{
		super();
	}
	
	public Profesor(String nume, String materie)
	{
		super.nume = nume;
		this.materie = materie;
	}

	
	public String toString() {
		return super.toString() + " Profesor: " + nume + ", " + materie;
	}
	
	public void preda()
	{
		System.out.println( "Profesorul " + nume + " preda materia " + materie);
	}
	
		
}
