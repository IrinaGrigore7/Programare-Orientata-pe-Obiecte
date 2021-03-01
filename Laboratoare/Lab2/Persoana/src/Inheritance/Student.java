package Inheritance;


public class Student extends Persoana{

	private int nota;
		
	public Student()
	{
		super();
	}
	
	public Student(String nume, int nota)
	{
		super.nume = nume;
		this.nota = nota;
	}

	
	public String toString() {
		return super.toString() + " Student: " + super.nume + ", " + nota;
	}
	
	public void invata()
	
	{
		System.out.println("Studentul " + nume + " a invatat si a luat nota " + nota);
	}
	
}
