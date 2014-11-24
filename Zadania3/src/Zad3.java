import java.util.Scanner;

public class Zad3 {

	private static Scanner odczyt;
	public static int i,pkt=0,a,b,w,x;

	public static void main(String[] args) {
		/*System.out.println ("Podaj dzieñ: ");
		odczyt = new Scanner(System.in);
		d = odczyt.nextInt();*/
		for (i=0;i<=10;i++){
			a = (int)(Math.random()*10);
			b = (int)(Math.random()*10);
			w = a*b;
			System.out.println(a+"*"+b+"=");
			odczyt = new Scanner(System.in);
			x = odczyt.nextInt();
			if (x == w){
				pkt++;
			}
		}
		if (pkt == 10){
			System.out.println("Ocena: Bardzo dobra");
		}
		else if ( pkt == 9 || pkt == 8 ){
			System.out.println("Ocena: Dobry+");
		}
		else if ( pkt == 7 || pkt == 6 ){
			System.out.println("Ocena: Dobry");
		}
		else if ( pkt == 5 || pkt == 4 ){
			System.out.println("Ocena: DST");
		}
		else if ( pkt == 3 || pkt == 2 ){
			System.out.println("Ocena: DOP");
		}
		else{
			System.out.println("Ocena: NDST");
		}
	}

}
