import java.util.Scanner;

public class Zad4 {

	private static Scanner odczyt;
	public static int pr,wyn,i,i2,pkt=0,a,b,w,x;

	public static void main(String[] args) {
		System.out.println ("Podaj ilosc zadan: ");
		odczyt = new Scanner(System.in);
		i2 = odczyt.nextInt();
		for (i=0;i<=i2;i++){
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
		pr = (i2/100)*(pkt*100);
		if (pr == 100){
			System.out.println("Ocena: Bardzo dobra");
		}
		else if ( pr <= 99 && pr >= 80 ){
			System.out.println("Ocena: Dobry+");
		}
		else if ( pr <= 79 && pr >= 60 ){
			System.out.println("Ocena: Dobry");
		}
		else if ( pr <= 59 && pr >= 40 ){
			System.out.println("Ocena: DST");
		}
		else if ( pr <= 39 && pr >= 20 ){
			System.out.println("Ocena: DOP");
		}
		else{
			System.out.println("Ocena: NDST");
		}
	}

}
