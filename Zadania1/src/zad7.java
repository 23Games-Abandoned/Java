import java.util.Scanner;

public class zad7 {

	private static Scanner odczyt;
	private static int a=1,i=0;
	
	public static void main(String[] args) {
		System.out.println ("Program bêdzie dodawa³ liczby do siebie póki nie wpiszesz 0");
		while (a!=0)
		{
			System.out.println ("Podaj liczbe: ");
			odczyt = new Scanner(System.in);
			a = odczyt.nextInt();
			i = i+a;
			System.out.println ("Wynik:"+i);
		}
	}

}