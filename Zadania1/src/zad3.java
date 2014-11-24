import java.util.Scanner;

public class zad3 {

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
		if (poda(d1))
			System.out.println ("Liczba pierwsza");
		else
			System.out.println ("Liczba z³o¿ona");
	}

}
