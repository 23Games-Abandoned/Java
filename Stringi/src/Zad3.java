import java.util.Scanner;

public class Zad3 {
	
	public static String a;
	public static int y,x;
	public static Scanner odczyt;
	
	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj s³owo:");
		a = odczyt.nextLine();
		char tab[] = a.toCharArray();
		x = a.length()-1;
		for (int i=0;i<=a.length()-1;i++){
			if (tab[i]==tab[x-i]){
				y=1;
			} else {y=0;break;}
		}
		if (y==1)
			System.out.println(a+" jest palindromem");
		else
			System.out.println(a+" nie jest palindromem");
	}
}