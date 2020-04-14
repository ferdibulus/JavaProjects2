package GenericClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Character[] char_dizi = { 'J', 'A' , 'V' , 'A'};
		Integer[] integer_dizi = { 1,2,3,4,5};
		String[] string_dizi = { "ferdi" , "erdi"};
		Ogrenci[] ogrenci_dizi = {new Ogrenci("Basak"),new Ogrenci("emir")};
		
		YazdirmaSinifi<Character> yazdir_char = new YazdirmaSinifi<Character>();
		yazdir_char.yazdir(char_dizi);
	}
	
	
}
