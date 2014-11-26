package stringi;

import functions.str;

public class zad8 {

	public static void main(String[] args) {
		String str_;
		str_=str.load_S("Podaj liczbe : ");
		System.out.println(str.toArabic(str_));
	}
}