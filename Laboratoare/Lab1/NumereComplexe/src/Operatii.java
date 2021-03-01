import java.util.Scanner;

public class Operatii {
	public static NumarComplex adunare(NumarComplex a, NumarComplex b) {
		NumarComplex rez = new NumarComplex();
		rez.im = a.im + b.im;
		rez.re = a.re + b.re;
		return rez;
	}
	
	public static NumarComplex inmultire(NumarComplex a, NumarComplex b) {
		NumarComplex rez = new NumarComplex();
		rez.re = (a.re * b.re) - (a.im * b.im);
		rez.im = (a.re * b.im) + (a.im * b.re);
		return rez;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NumarComplex z = new NumarComplex();
		NumarComplex y = new NumarComplex();
		NumarComplex a = new NumarComplex();
		NumarComplex b = new NumarComplex();
		System.out.print("a.re = ");
		a.re = scanner.nextFloat();
		System.out.print("a.im = ");
		a.im = scanner.nextFloat();
		System.out.print("b.re = ");
		b.re = scanner.nextFloat();
		System.out.print("b.im = ");
		b.im = scanner.nextFloat();
		
		z = adunare(a, b);
		y = inmultire(a, b);
		System.out.println("z = " + z.re + " + " + "i * " + z.im);
		System.out.println("z = " + y.re + " + " + "i * " + y.im);
		
	}
}
