import java.util.Scanner;

public class Zad2 {
	
	public static String a;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj s³owo:");
		a = odczyt.nextLine();
		for (int i=a.length()-1;i>=0;i--){
			System.out.print(a.charAt(i));
		}
	}
}