package LinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import org.w3c.dom.ls.LSInput;

public class Main {
	public static void listeyi_bastir(LinkedList<String> gidilecekyerler) {
//		for(String s:gidilecekyerler) {
//			System.out.println(s);
//		}
		ListIterator<String> iterator = gidilecekyerler.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void siraliEkle(LinkedList<String> gidilecek_yerler,String yeni) {
		ListIterator<String> iterator = gidilecek_yerler.listIterator();
		while(iterator.hasNext()) {
			int karsilatir = iterator.next().compareTo(yeni);
			if(karsilatir == 0) {
				//ikid eger esit
				System.out.println("Listenizde bu eleman zaten var");
				return;
			}
			
			else if(karsilatir < 0) {
				
			}
			else if(karsilatir > 0) {
				iterator.previous();
				iterator.add(yeni);
				
				return;
			}
		}
		iterator.add(yeni);
	}
public static void main(String args[]) {
	LinkedList<String> gidilecekyerler  = new LinkedList<String>();
	
//	gidilecekyerler.add("Posthane");
//	gidilecekyerler.add("Markeet");
//	gidilecekyerler.add("Okul");
//	gidilecekyerler.add("Kutuphane");
//	gidilecekyerler.add("Spor salonu");
//	gidilecekyerler.add("Ev");
//	listeyi_bastir(gidilecekyerler);
//	System.out.println("*************************");
//	gidilecekyerler.add(4,"Avm");
//	listeyi_bastir(gidilecekyerler);
	siraliEkle(gidilecekyerler, "Postane");
	siraliEkle(gidilecekyerler, "Avm");
	listeyi_bastir(gidilecekyerler);
	
	
}
}
