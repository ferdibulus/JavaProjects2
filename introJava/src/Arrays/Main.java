package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	 public static int[] array_doldur(int sayi) {
			Scanner scanner = new Scanner(System.in);
			int[] cikti = new int[sayi];
			for(int i = 0; i<sayi; i++) {
				cikti[i] = scanner.nextInt();
			}
			return cikti;
		}
	 public static void arrayi_bastir(int[] array) {
		 for(int i =0; i<array.length; i++) {
			 System.out.println("element:" + (i+1) + ":" + array[i]);
		 }
	 }
	 public static void arraySort(int[] array) {
		 Arrays.sort(array);
		 arrayi_bastir(array);
	 }
public static void main(String args[]) {
//		int[] a = array_doldur(5);
//		arrayi_bastir(a);
//		arraySort(a);
		
	int[] a1 = {1,2,3,4,5,6};
	int[] a2 = {1,2,3,4,5,6};
	if(a1.length == a2.length){
		System.out.println("uzunluklar esit");
	}
	
	if(Arrays.equals(a1, a2)) {
		System.out.println("esitmi");
	}
}
}
