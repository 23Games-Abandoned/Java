import java.util.Scanner;

public class Zad2 {
	
	public static Scanner odczyt;
	public static String slowo;
	public static char siewo;

	public static void main(String[] args) {
		System.out.println("Podaj s³owo");
		odczyt = new Scanner(System.in);
		slowo = odczyt.nextLine();
		char tab[]	=	slowo.toCharArray();
		for (int i=0; i<tab.length-1;i+=2){
			siewo	=	tab[i];
			tab[i]	=	tab[i+1];
			tab[i+1]=	siewo;
		}
		System.out.println();
		for (int i=0; i<tab.length;i++){
			System.out.print(tab[i]);
		}
	}

}

