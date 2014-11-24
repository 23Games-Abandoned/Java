import java.util.Scanner;

public class Zad3 {

	private static Scanner odczyt;
	public static int a,b,c;
	
	public static void main(String[] args) {
		for (int i=0;i<=6;i++)
		{
		System.out.println ("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		System.out.println ("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		c = odczyt.nextInt();
		if (a>b && a>c && b>c)
			System.out.println (a+" "+b+" "+c);
		else if (a>b && b<c && a>c)
			System.out.println (a+" "+c+" "+b);
		else if (b>a && b>c && a>c)
			System.out.println (b+" "+a+" "+c);
		else if (b>a && b>c && c>a)
			System.out.println (b+" "+c+" "+a);
		else if (c>a && c>b && b>a)
			System.out.println (c+" "+a+" "+b);
		else if (c>a && b>a && c>b)
			System.out.println (c+" "+b+" "+a);
		}
	}

}