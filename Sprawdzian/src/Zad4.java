import java.util.Scanner;

public class Zad4 {

	private static Scanner odczyt;
	public static String n;

	public static void main(String[] args) {
		System.out.println ("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		n = odczyt.toString();
		for (int i=1;i<n;i++){
			n.length();
		}

	}

}