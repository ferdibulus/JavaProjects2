package YurtdisiCikisProgrami;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Istanbul Havalimanina Hosgeldiniz");
		String sartlar = "Yurtdisi cikis kurallari\n"
						+"Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor\n"
						+"15 tl harc ucretini tam olarak yatirmaniz gerekiyor\n"
						+"Gideceginiz ulkeye vizenizin olmasi gerekiyor.";
		String message = "Yurtdisi sartlarinin hepsini saglamaniz gerekiyor.";
		while(true) {
			System.out.println("****************************");
			System.out.println(sartlar);
			System.out.println("****************************");
	
			
			Yolcu yolcu = new Yolcu();
			System.out.println("Harc bedeli kontrol ediliyor..");
			
			Thread.sleep(3000);
			if(yolcu.yurtdisiHarci()==false) {
			
			continue;
			}
			System.out.println("Siyasi yasak kontrol ediliyor.");
			Thread.sleep(3000);
			if(yolcu.siyasiYasak()==false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Vize durumu kontrol ediliyor.");
			Thread.sleep(3000);
			if(yolcu.vizeDurumu()==false) {
				System.out.println(message);
				continue;
			}
			System.out.println("Islemleriniz tamam!Yurtdisina cikabilirsiniz.");
			break;
		}
	}
}
