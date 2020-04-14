package TrainingArray;


import java.util.ArrayList;
import java.util.Scanner;

public class Hayvan {
	private String name;
	
	public Hayvan(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static ArrayList<String> arrayOlustur() {
		ArrayList<String> arrayList = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Eklemek istediginiz ad:");
		String isim = scan.nextLine();
		arrayList.add(isim);
		return arrayList;
		
	}
	public static void arrayGoruntule(ArrayList<String> arrayList) {
		System.out.println("Dizi goruntuleniyor..");
		for(String a : arrayList) {
			System.out.println(a);
		}
	}
	public static void ekle(String name) {
	
	}
	
	
}	
