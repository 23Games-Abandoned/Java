import java.util.Scanner;

public class Zad3 {

	public static Scanner cin;
	public static int a,b;

	public static void main(String[] args) {
		cin = new Scanner(System.in);
		System.out.println("Podaj pocz¹tek przedzia³u:");
		a = cin.nextInt();
		System.out.println("Podaj koniec przedzia³u:");
		b = cin.nextInt();
		System.out.println("Liczby nadmiarowe");
		nadmiarowa(a,b);
	}
	
	public static void nadmiarowa (int x, int y){
		for (int i=a;i<=b;i++){ //Przedzia³
			int z=0;
			for (int j=1;j<=i;j++){ //Dzielniki
				if (i%j==0){
					z+=j;
				}
			}
			if (z<i)
				System.out.println(i);
		}
	}
}
