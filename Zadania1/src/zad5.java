import java.util.Scanner;

public class zad5 {

	private static Scanner odczyt;
	private static int l1,l2,l3;
	
	public static void main(String[] args) {
		System.out.println ("Podaj 1 odcinek: ");
		odczyt = new Scanner(System.in);
		l1 = odczyt.nextInt();
		System.out.println ("Podaj 2 odcinek: ");
		odczyt = new Scanner(System.in);
		l2 = odczyt.nextInt();
		System.out.println ("Podaj 3 odcinek: ");
		odczyt = new Scanner(System.in);
		l3 = odczyt.nextInt();
		if (l1+l2>l3)
			if (l1+l3>l2)
				if(l2+l3>l1)
					System.out.println("Da siê zbudowaæ trójk¹t");
				else
					System.out.println("Nie da siê zbudowaæ trójk¹ta");
			else
				System.out.println("Nie da siê zbudowaæ trójk¹ta");
		else
			System.out.println("Nie da siê zbudowaæ trójk¹ta");
	}

}