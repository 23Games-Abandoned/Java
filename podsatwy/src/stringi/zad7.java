package stringi;

import functions.str;

public class zad7 {

	public static void main(String[] args) {
		String str_;
		str_=str.load_S("Podaj liczbe : ");
		System.out.println(Integer.parseInt(str_, 2));
	}
}
