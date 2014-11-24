import java.util.Scanner;

public class Zad1 {

	private static Scanner odczyt;
	public static int a,b;

	public static void main(String[] args) {
		System.out.println ("Podaj pocz¹tek przedzia³u: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj koniec przedzia³u: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		for (int i=a; i<b; i++){
			if (i%3==0 && i%4==0){
				System.out.println(i);
			}
		}

	}

}