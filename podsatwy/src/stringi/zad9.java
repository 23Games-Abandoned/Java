package stringi;

import functions.str;

public class zad9 {
	public static void main(String[] args) {
		String str_;
		str_=str.load_S("Podaj s�owo : ");
		System.out.print("Liczba duzych liter: "+str.string_u(str_)+"   Liczba malych liter: "+(str_.length()-str.string_u(str_)));
			
	}
	
}
