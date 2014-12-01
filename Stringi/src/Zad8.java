import java.util.Scanner;

public class Zad8 {
	
	public static String a;
	public static Scanner odczyt;
	
	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê:");
		a = odczyt.nextLine();
		System.out.println(Integer.parseInt(a,2));		
	}
}