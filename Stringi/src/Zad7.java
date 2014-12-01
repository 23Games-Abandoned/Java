import java.util.Scanner;

public class Zad7 {
	
	public static int a;
	public static Scanner odczyt;
	
	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê:");
		a = odczyt.nextInt();
		System.out.println(Integer.toString(a,2));		
	}
}