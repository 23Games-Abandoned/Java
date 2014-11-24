import java.util.Scanner;

public class zad4 {

	private static Scanner odczyt;
	static int d1,d2,d3;
	
	public static boolean poda(int a)
	{
		int d=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			  d++;
		}
		if(d>2)
		  return true;
	    else
	      return false;
	}
	
	public static void main(String[] args) {
		System.out.println ("Podaj poczatek przedzialu: ");
		odczyt = new Scanner(System.in);
		d1 = odczyt.nextInt();
		System.out.println ("Podaj koniec przedzialu: ");
		odczyt = new Scanner(System.in);
		d2 = odczyt.nextInt();
		for(int i=d1;i<=d2;i++)
		{
			System.out.print (i+" to ");
			if (poda(i))
				System.out.println ("Liczba pierwsza");
			else
				System.out.println ("Liczba z³o¿ona");
		}
	}

}
