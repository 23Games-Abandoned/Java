import java.util.Scanner;

public class Drugi {

	private static Scanner odczyt;

	public static void main(String[] args) {
		System.out.println ("Podaj swoje imiê: ");
		String imie;
		odczyt = new Scanner(System.in);
		imie = odczyt.nextLine();
		System.out.println ("Witaj "+imie);

	}

}
