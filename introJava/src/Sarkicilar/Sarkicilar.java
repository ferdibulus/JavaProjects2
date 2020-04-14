package Sarkicilar;

import java.util.ArrayList;

public class Sarkicilar {
	private ArrayList<String> sarkici_listesi = new ArrayList<String>();
	
	public void sarkicilariBastir() {
		System.out.println("Sarkici listesinde:" + sarkici_listesi.size() + " kadar sarkici var");
		for(int i=0; i<sarkici_listesi.size(); i++) {
			System.out.println((i+1) + " .Sarkici :" +sarkici_listesi.get(i));
		}
	}
	
	public void sarkiciEkle(String isim) {
		sarkici_listesi.add(isim);
		System.out.println("Sarkici eklendi...Isim:" + isim);
	}
	public void sarkiciGuncelle(String yeni_isim,int pozisyon) {
		sarkici_listesi.set(pozisyon,yeni_isim);
		System.out.println("Sarkici guncellendi.");
	}
	
	public void sarkiciSil(int pozisyon) {
		String isim = sarkici_listesi.get(pozisyon);
		sarkici_listesi.remove(pozisyon);
		System.out.println(isim + " silindi." );
	}
	public void sarkici_ara(String sarkici_ismi) {
		int pozisyon = sarkici_listesi.indexOf(sarkici_ismi);
		if(pozisyon >=0) {
			System.out.println("Sarkici bulundu");
			System.out.println(sarkici_ismi + " isimli sarkici" + (pozisyon +1) +" pozosyonda.");
		}
		else {
			System.out.println("sarkici bulunamadi.");
		}
	}
}
