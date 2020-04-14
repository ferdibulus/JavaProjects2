package TrainingArrays;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir kelime giriniz:");
		String isim = scan.nextLine();
		int sayac= 0;
		for(int i=0; i<isim.length(); i++) {
			if(isim.charAt(i)!= isim.charAt(isim.length()-1-i)) {
				sayac++;
			}			
		}
		if(sayac==0) {
			System.out.println("Palidromik");
		}
		else {
			System.out.println("Not Palidromik");
		}
		
	}
}
