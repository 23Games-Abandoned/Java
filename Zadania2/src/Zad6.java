import java.util.Scanner;

public class Zad6 {

	private static Scanner odczyt;
	public static int a,b,c,x0,d;
	static double x1,x2;
	
	public static void main(String[] args) {
		System.out.println ("Podaj liczbe a: ");
		odczyt = new Scanner(System.in);
		a = odczyt.nextInt();
		System.out.println ("Podaj liczbe b: ");
		odczyt = new Scanner(System.in);
		b = odczyt.nextInt();
		System.out.println ("Podaj liczbe c: ");
		odczyt = new Scanner(System.in);
		c = odczyt.nextInt();
		d = b*b+4*a*c;
		if ( d>0 ){
			x1 = (-b-Math.sqrt(d))/2*a;
			x2 = (-b+Math.sqrt(d))/2*a;
			System.out.println ("Funkcja ma rozwi¹zania x1="+x1+" oraz x2="+x2);
		}
		else if ( d==0 ){
			x0 = -b/(2*a);
			System.out.println ("Funkcja ma 1 rozwi¹zanie x0="+x0);
		}
		else
			System.out.println ("Brak rozwi¹zañ");
	}

}