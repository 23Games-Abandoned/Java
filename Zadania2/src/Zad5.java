import java.util.Scanner;

public class Zad5 {

	private static Scanner odczyt;
	public static int a,b,x;
	
	public static void main(String[] args) {
		System.out.println ("Podaj liczbe a: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj liczbe b: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		
		if (a>0)
			System.out.println ("Funkcja rosn¹ca, przecinaj¹ca siê w punkcie (0,"+b+")");
		else if (a==0)
			System.out.println ("Funkcja sta³a, przecinaj¹ca siê w punkcie (0,"+b+")");
		else
			System.out.println ("Funkcja malej¹ca, przecinaj¹ca siê w punkcie (0,"+b+")");
	}

}