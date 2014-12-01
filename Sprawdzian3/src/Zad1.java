import java.util.Scanner;

public class Zad1 {

	public static Scanner cin;
	public static int a,b;

	public static void main(String[] args) {
		cin = new Scanner(System.in);
		System.out.println("Podaj pocz¹tek przedzia³u:");
		a = cin.nextInt();
		System.out.println("Podaj koniec przedzia³u:");
		b = cin.nextInt();
		for (int i=a;i<=b;i++){
			System.out.println(i+"="+dzielniki1(i));
		}
	}

	public static int dzielniki1 (int x){
		int p=0,np=0;
		for (int i=x;i>=1;i--)
			if (x%i==0)
				if (i%2==0)
					p++;
				else np++;
		if (p>np)
			return 1;
		else return 0;
	}
}
