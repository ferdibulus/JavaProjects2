package Sarkicilar;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	private static Sarkicilar sarkicilar = new Sarkicilar();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void islemleriBastir() {
		System.out.println("\t 0-Islemleri Goruntule\n"
							+ "\t 1-Sarkilari Goruntule\n"
							+ "\t 2-Sarkici ekle\n"
							+ "\t 3-Sarkici goruntule\n"
							+ "\t 4-Sarkici sil\n"
							+ "\t 5-Sarkici ara\n"
							+ "\t 6-Uygulamadan ciks\n");
	}
	public static void goruntule(){
		sarkicilar.sarkicilariBastir();
	}
	public static void sarkiciEkle() {
		System.out.println("sarkici ismi:");
		String isim = scanner.nextLine();
		sarkicilar.sarkiciEkle(isim);
	}
	
	public static void sarkiciGuncelle() {
		System.out.println("Guncellemek istediginiz pozisyon:");
		int pozisyon = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Yeni sarkici ismi giriniz:");
		String yeni_isim = scanner.nextLine();
		sarkicilar.sarkiciGuncelle(yeni_isim, pozisyon-1);
	}
	public static void sil() {
		System.out.println("Silmek istediginiz pozisyon:");
		int pozisyon = scanner.nextInt();
		scanner.nextLine();
		sarkicilar.sarkiciSil(pozisyon - 1);
	}
	
	public static void ara() {
		System.out.println("Aramak istediginiz Sarkici adini giriniz:");
		String isim = scanner.nextLine();
		sarkicilar.sarkici_ara(isim);
	}
	
public static void main(String args[]) {
	
	
	System.out.println("Sarkici uygulamasina hosgeldiniz..");
	islemleriBastir();
	
	boolean cikis = false;
	int islem;
	while(!cikis) {
		System.out.println("Bir islem saciniz:");
		
		islem= scanner.nextInt();
		scanner.nextLine();
		switch(islem) {
		
		case 0:
			islemleriBastir();
			break;
		case 1:
			goruntule();
			break;
		case 2:
			sarkiciEkle();
			break;
		case 3:
			sarkiciGuncelle();
			break;
		case 4:
			sil();
			break;
		case 5:
			ara();
			break;
		case 6:
			cikis = true;
			System.out.println("Uygulamadan cikiliyor");
			break;
		}
		
		
		
		
		
			
		
	}
	
}

}
