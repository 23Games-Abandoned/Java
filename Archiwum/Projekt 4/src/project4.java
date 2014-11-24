import java.util.Scanner;

public class project4 {

	private static Scanner odczyt;
    static int i1,i2;
	
	public static void main(String[] args) {
		System.out.println ("Podaj pierwsz¹ zmienn¹: ");
		odczyt = new Scanner(System.in);
		i1 = odczyt.nextInt();
		System.out.println ("Podaj drug¹ zmienn¹: ");
		odczyt = new Scanner(System.in);
		i2 = odczyt.nextInt();
		if (i1==i2)
			System.out.println ("Zmienne s¹ równe");
		else if (i1>i2)
			System.out.println ("Pierwsza zmienna jest wieksza");
		else
			System.out.println ("Druga zmienna jest wiêksza");
				
	}

}
