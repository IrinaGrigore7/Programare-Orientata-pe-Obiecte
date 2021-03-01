
public class Verificari {
	public static boolean dubluExemplar(Carte c1, Carte c2) {
		if(c1.titlu.equals(c2.titlu) == false)
			return false;
		if(c1.autor.equals(c2.autor) == false)
			return false;
		return true;	
	}
	
	public static Carte carteGroasa(Carte c1, Carte c2) {
		if(c1.numarPagini > c2.numarPagini)
			return c1;
		else
			return c2;
	}
}
