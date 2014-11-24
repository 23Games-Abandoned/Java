import java.util.Scanner;

public class zad1 {

	private static Scanner odczyt;
    static int a,b;
	
	public static void main(String[] args) {
		System.out.println ("Podaj poczatek przedzialu: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj koniec przedzialu: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		System.out.println ("Liczby parzyste:");
		for (int i=a;i<=b;i++)
		{
			if (i%2==0)
			System.out.println (i);
		}
		System.out.println ("Liczby nieparzyste:");
		for (int i=a;i<=b;i++)
		{
			if (i%2==1)
			System.out.println (i);
		}
				
	}

}
