import java.util.Scanner;

public class Zad2 {

	private static Scanner odczyt;
	public static int a,b,c;
	
	public static void main(String[] args) {
		System.out.println ("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		System.out.println ("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		c = odczyt.nextInt();
		if (a>b)
			if (a<c)
				System.out.println ("Œrodkowa liczba: "+a);
			else
				System.out.println ("Œrodkowa liczba: "+c);
		else if (b<c)
			System.out.println ("Œrodkowa liczba: "+b);
			else
				System.out.println ("Œrodkowa liczba: "+c);
	}

}