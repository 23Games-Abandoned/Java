import java.util.Scanner;

public class Zad1 {
	
	public static Scanner odczyt;
	public static String slowo;	

	public static void main(String[] args) {
		System.out.println("Podaj s³owo");
		odczyt = new Scanner(System.in);
		slowo = odczyt.nextLine();
		char tab[]	=	slowo.toCharArray();
		for (int i=2; i<tab.length-1;i+=3){
			tab[i]	=	'a';
		}
		System.out.println();
		for (int i=0; i<tab.length;i++){
			System.out.print(tab[i]);
		}
	}

}

