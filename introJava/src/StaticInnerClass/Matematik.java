package StaticInnerClass;

import java.util.Scanner;

public class Matematik {
	private double PI = Math.PI;
	
	
	public class faktoriyel{
		
		public void faktoriyel() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Bir sayi giriniz:");
			int fact = 1;
			int sayi = scanner.nextInt();
			for(int i=2; i<=sayi; i++) {
				fact *=i;
			}
			System.out.println("Faktoriyel : " + fact);
		}
	}
	
	public class asal{
		public boolean asalmi(int sayi) {
			int i =2;
			while(i<sayi) {
				if(sayi%i == 0) {
					return false;
				}
				i++;
			}
			return true;
		}
	}
	
	public class alan{
		public void daireAlan(int yaricap) {
			System.out.println("Dairenin alani:" + (yaricap *yaricap*PI));
		}
	}
}
