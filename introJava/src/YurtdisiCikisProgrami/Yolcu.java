package YurtdisiCikisProgrami;

import java.util.Scanner;

public class Yolcu implements YurtdisiKurallari {
	private int harc;
	private boolean siyasiYasak;
	private boolean vizeDurumu;
	
	public Yolcu() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Yatirdiginiz harc bedeli:");
			this.harc = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Herhangi bir siyasi yasaginiz bulunuyormu?");
			String cevap = scanner.nextLine();
			if(cevap.equals("evet")) {
				this.siyasiYasak = true;
				
			}
			else {
				this.siyasiYasak= false;
			}
			
			System.out.println("Vizeniz bulunuyormu?");
			String cevap2 = scanner.nextLine();
			if(cevap2.equals("evet")) {
				this.vizeDurumu = true;
				
			}
			else {
				this.vizeDurumu= false;
			}
		
	}
	@Override
	public boolean yurtdisiHarci() {
		// TODO Auto-generated method stub
		if(this.harc <15) {
			System.out.println("Lutfen yurt disi cikis harcini tam yatirin");
			return false;
		}
		else {
			System.out.println("Yurt disi harci islemi tamam");
			return true;
		}
	}
	@Override
	public boolean siyasiYasak() {
		// TODO Auto-generated method stub
		if(this.siyasiYasak == true) {
			System.out.println("SIyasi yasaginiz oldugundan yurt disina cikamazsiniz..");
			return false;
		}
		else {
			System.out.println("Siyasi yasaginiz bulunmuyor.");
			return true;
		}
	}
	@Override
	public boolean vizeDurumu() {
		// TODO Auto-generated method stub
		if(this.vizeDurumu == false) {
			System.out.println("Vize durumunuz onaylanmamistir yurt disina cikamazsiniz..");
			return false;
		}
		else {
			System.out.println("Vizeniz onaylanmistir");
			return true;
		}
	}
	
}
