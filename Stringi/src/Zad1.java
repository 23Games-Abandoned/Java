import java.util.Scanner;

public class Zad1 {
	
	public static String imie;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj imiê:");
		imie = odczyt.nextLine();
		if (imie.endsWith("a")){
			System.out.println("Kobieta");
		} else System.out.println("Facet");
	}
}