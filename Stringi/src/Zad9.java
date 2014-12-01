import java.util.Scanner;

public class Zad9 {
	
	public static String a;
	public static Scanner odczyt;
	
	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê:");
		a = odczyt.nextLine();
		System.out.println(toArabic(a));		
	}
	
	public static int toArabic(String number) {
		int i=0;
        while (number.length()>0) {
        if (number.endsWith("M")){ 
        	i+= 1000;
        	number=number.substring(0, number.length()-1);
        }
        if (number.endsWith("CM")){
        	i+= 900 ;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("D")){ 
        	i+= 500 ;
        	number=(number.substring(0, number.length()-1));
        }
        if (number.endsWith("CD")){
        	i+= 400 ;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("C")){ 
        	i+= 100 ;
        	number=(number.substring(0, number.length()-1));
        }
        if (number.endsWith("XC")){ 
        	i+= 90 ;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("L")){ 
        	i+= 50 ;
        	number=(number.substring(0, number.length()-1));
        }
        if (number.endsWith("XL")){ 
        	i+= 40;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("X")){ 
        	i+= 10 ;
        	number=(number.substring(0,number.length()-1));
        }
        if (number.endsWith("IX")){ 
        	i+= 9;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("V")){ 
        	i+= 5 ;
        	number=(number.substring(0, number.length()-1));
        }
        if (number.endsWith("IV")){ 
        	i+= 4 ;
        	number=(number.substring(0,number.length()-2));
        }
        if (number.endsWith("I")){ 
        	i+= 1 ;
        	number=(number.substring(0, number.length()-1));
        	
        }
        }
        return i;
    }
}