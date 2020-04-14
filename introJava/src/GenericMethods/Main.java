package GenericMethods;

import GenericClass.Ogrenci;

public class Main {

	public static void main(String[] args) {
		Character[] char_dizi = { 'J', 'A' , 'V' , 'A'};
		Integer[] integer_dizi = { 1,2,3,4,5};
		String[] string_dizi = { "ferdi" , "erdi"};
		Ogrenci[] ogrenci_dizi = {new Ogrenci("Basak"),new Ogrenci("emir")};
		yazdir(char_dizi);
		yazdir(integer_dizi);
		yazdir(string_dizi);
		yazdir(ogrenci_dizi);
	}
	public static <E> void yazdir(E[] dizi) {
		for(E e: dizi) {
			System.out.println(e);
		}
	}
}
