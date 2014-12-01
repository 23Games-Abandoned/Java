import java.util.Scanner;

public class Zad0 {
	
	public static int a;
	public static Scanner odczyt;
	
	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê:");
		a = odczyt.nextInt();
		for (int i=2;i<=a;i++){
			System.out.println(i+"="+Integer.toString(a,i));	
		}	
	}
}