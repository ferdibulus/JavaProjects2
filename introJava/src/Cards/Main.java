package Cards;

import java.util.Scanner;

public class Main {
	public static Cards[][] kartlar = new Cards[4][4];
public static void main(String args[]) {
	Cards[][] kartlar = new Cards[4][4];
		kartlar[0][0] = new Cards('A');
		kartlar[0][1] = new Cards('B');
		kartlar[0][2] = new Cards('C');
		kartlar[0][3] = new Cards('D');
		
		kartlar[1][0] = new Cards('E');
		kartlar[1][1] = new Cards('F');
		kartlar[1][2] = new Cards('G');
		kartlar[1][3] = new Cards('H');
		
		kartlar[2][0] = new Cards('A');
		kartlar[2][1] = new Cards('B');
		kartlar[2][2] = new Cards('C');
		kartlar[2][3] = new Cards('D');
		
		kartlar[3][0] = new Cards('E');
		kartlar[3][1] = new Cards('F');
		kartlar[3][2] = new Cards('G');
		kartlar[3][3] = new Cards('H');
		oyunTahtasi();
		
	
}	
public static void oyunTahtasi() {
		for(int i = 0; i<4; i++) {
			for(int j = 0; i<4; i++) {
				if(kartlar[i][j].isTahmin()) {
					System.out.print(" |" +kartlar[i][j].getDeger() + "| ");
				}
				else {
					System.out.print(" | | ");
				}
			}
			System.out.println("");
		}
}
}
