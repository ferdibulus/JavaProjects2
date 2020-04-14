package Interfaces;

public class Main {
	 public static void main(String args[]) {
		 
		// IMuhendis muhendis1 = new IMuhendis() {
//	pcMuhendisi muhendis1 = new pcMuhendisi(false,false);
//	
//	muhendis1.askerlikDurumuSorgula();
//	muhendis1.adliSicilSorugula();
//	System.out.println(muhendis1.mezuniyetOrtalamasi(3.07));
//	String[] tecrube = {"Alarko" , "Ahtapot" , "Mergentech"};
//	muhendis1.isTecrubesi(tecrube);
//		 
		 MakineMuhendisi makineMuhendisi = new MakineMuhendisi(true,false);
		 String[] tecrube={};
		 String[] referans = {"huseyin","muhammed", "ozge"};
		 makineMuhendisi.adliSicilSorugula();
		 makineMuhendisi.askerlikDurumuSorgula();
		 System.out.println(makineMuhendisi.mezuniyetOrtalamasi(2.86));
		 makineMuhendisi.isTecrubesi(tecrube);
		 makineMuhendisi.referansGetir(referans);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
}
