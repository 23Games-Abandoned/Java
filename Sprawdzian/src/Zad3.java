import java.util.Scanner;

public class Zad3 {

	private static Scanner odczyt;
	public static int a=1,suma;

	public static void main(String[] args) {
		if (a!=0){
			while (a!=0){
				System.out.println ("Podaj liczbe: ");
				odczyt = new Scanner(System.in);
				a = odczyt.nextInt();
				if(a%3!=0){
					suma+=a;
					System.out.println (suma);
				}
			}
		}

	}

}
