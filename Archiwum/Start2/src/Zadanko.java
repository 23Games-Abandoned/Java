import java.util.Scanner;

public class Zadanko {

	private static Scanner odczyt;

	static Double a,b;
	
	public static void main(String[] args) {
		System.out.println ("Podaj pierwsz¹ zmienn¹: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextDouble();
		System.out.println ("Podaj druga zmienn¹: ");
		b = odczyt.nextDouble();
		System.out.println ("Wynik dodawania: "+(a+b));
		System.out.println ("Wynik odejmowania: "+(a-b));
		System.out.println ("Wynik mno¿enia: "+(a*b));
		System.out.println ("Wynik dzielenia: "+(a/b));
	}

}
