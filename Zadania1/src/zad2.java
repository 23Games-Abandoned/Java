import java.util.Scanner;

public class zad2 {

	private static Scanner odczyt;
    static int a,b,c;
	
	public static void main(String[] args) {
		System.out.println ("Podaj poczatek przedzialu: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj koniec przedzialu: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		System.out.println ("Podaj dzielnik: ");
		odczyt = new Scanner(System.in);
		c = odczyt.nextInt();
		System.out.println ("Liczby podzielne przez "+c+":");
		for (int i=a;i<=b;i++)
		{
			if (i%c==0)
			System.out.println (i);
		}
				
	}

}
