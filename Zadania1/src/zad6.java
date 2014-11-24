import java.util.Scanner;

public class zad6 {

	private static Scanner odczyt;
	private static int a,b,c;
	
	public static void main(String[] args) {
		System.out.println ("Podaj 1 odcinek: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj 2 odcinek: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		System.out.println ("Podaj 3 odcinek: ");
		odczyt = new Scanner(System.in);
		c = odczyt.nextInt();
		if (((a*a+b*b-c*c)*(a*a+c*c-b*b)*(b*b+c*c-a*a))==0)
			System.out.println ("Jest to trójk¹t prostok¹tny");
		else
			System.out.println ("Nie jest to trójk¹t prostok¹tny");
	}

}