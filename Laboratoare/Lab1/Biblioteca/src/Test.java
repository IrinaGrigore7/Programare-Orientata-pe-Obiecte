import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Carte carte1 = new Carte();
		carte1.titlu = scanner.next();
		carte1.autor = scanner.next();
		carte1.editura = scanner.next();

		do {
			System.out.print("Please enter a positive number: ");
			while (!scanner.hasNextInt()) {
				String input = scanner.next();
				System.out.printf("\"%s\" is not a valid number.\n", input);
			}
			carte1.numarPagini = scanner.nextInt();
		} while (carte1.numarPagini <= 0);

		System.out.printf("You have entered a positive number %d.\n", carte1.numarPagini);

	
	
		Carte carte2 = new Carte();
		carte2.titlu = scanner.next();
		carte2.autor = scanner.next();
		carte2.editura = scanner.next();

		do {
			System.out.print("Please enter a positive number: ");
			while (!scanner.hasNextInt()) {
				String input = scanner.next();
				System.out.printf("\"%s\" is not a valid number.\n", input);
			}
			carte2.numarPagini = scanner.nextInt();
		} while (carte2.numarPagini <= 0);

		System.out.printf("You have entered a positive number %d.\n", carte2.numarPagini);
	
		if(Verificari.dubluExemplar(carte1, carte2) == true)
			System.out.println("Cartea este in dublu exemplar");
		else
			System.out.println("Cartea nu este in dublu exemplar");
	
		if(Verificari.carteGroasa(carte1, carte2) == carte1)
			System.out.println("Cartea 1 este mai groasa");
		else
			System.out.println("Cartea 2 este mai groasa");
		
		System.out.println(carte1.titlu.toUpperCase() + " " + carte1.autor + " " + carte1.editura.toLowerCase());
	}

}
