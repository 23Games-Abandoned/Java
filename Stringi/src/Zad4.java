import java.util.Scanner;

public class Zad4 {
	
	public static String a;
	public static int x=0;
	public static Scanner odczyt;
	
	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj s³owo:");
		a = odczyt.nextLine();
		char tab[] = a.toCharArray();
		for (int i=0;i<=a.length()-1;i++){
			if (tab[i]=='a'){
				x++;
			}
		}
		System.out.println("W s³owie "+a+" jest "+x+" literek a");
	}
}