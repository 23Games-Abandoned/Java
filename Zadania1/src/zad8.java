import java.util.Scanner;

public class zad8 {

	private static Scanner odczyt;
	public static int a,b;
	
	public static void main(String[] args) {
		System.out.println ("Podaj dzien: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj miesiac: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		if (b==1)
			System.out.println ("Zima");
		if (b==2)
			System.out.println ("Zima");
		if (b==3)
			if (a<21)
				System.out.println ("Zima");
			else
				System.out.println ("Wiosna");
		if (b==4)
			System.out.println ("Wiosna");
		if (b==5)
			System.out.println ("Wiosna");
		if (b==6)
			if (a<21)
				System.out.println ("Wiosna");
			else
				System.out.println ("Lato");
		if (b==7)
			System.out.println ("Lato");
		if (b==8)
			System.out.println ("Lato");
		if (b==9)
			if (a<22)
				System.out.println ("Lato");
			else
				System.out.println ("Jesien");
		if (b==10)
			System.out.println ("Jesien");
		if (b==11)
			System.out.println ("Jesien");
		if (b==12)
			if (a<22)
				System.out.println ("Jesien");
			else
				System.out.println ("Zima");
		
	}

}