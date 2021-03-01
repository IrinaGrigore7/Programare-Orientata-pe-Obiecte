import java.util.Scanner;
import java.util.*;

public class Persoana {
	String name;
	String CNP;

	protected Persoana() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name");

		this.name = input.nextLine();

		System.out.println("Enter CNP");
		this.CNP = input.nextLine();

	}

	public boolean verify() {

		class CheckPerson {

			public boolean check() {

				if ((Character.isUpperCase(name.charAt(0))) && (CNP.length() == 13)
						&& (CNP.charAt(0) == '1' || CNP.charAt(0) == '2') && isNumeric(CNP))
					return true;
				else
					return false;

			}

			public boolean isNumeric(final String str) {

				if (str == null || str.length() == 0) {
					return false;
				}

				for (char c : str.toCharArray()) {
					if (!Character.isDigit(c)) {
						return false;
					}
				}

				return true;
			}

		}
		CheckPerson person = new CheckPerson();
		return person.check();
	}

	public static void main(String[] args) {
		Persoana pers1 = new Persoana();
		System.out.println("Datele introduse sunt valide: " + pers1.verify());
		Persoana pers2 = new Persoana();
		System.out.println("Datele introduse sunt valide: " + pers2.verify());
	}
}
