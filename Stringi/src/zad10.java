import java.util.Scanner;


public class zad10 {
	
	public static Scanner odczyt;
	public static String tak;
	
	public static void main(String[] args) {
		System.out.print("Podaj tekst");
		odczyt = new Scanner(System.in);
		tak = odczyt.nextLine();
		System.out.print("Liczba duzych liter: "+string_u(tak)+"   Liczba malych liter: "+(tak.length()-string_u(tak)));
			
	}
	
	public static int string_u(String str){
		int s=0;
		for(int i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i))){
				s++;
			}
		}
		return s;
	}

}