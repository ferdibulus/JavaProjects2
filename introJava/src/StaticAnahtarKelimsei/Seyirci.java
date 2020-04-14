package StaticAnahtarKelimsei;

public class Seyirci {
	private String isim;
	
	public static int seyirci_sayisi=0;
	
	public Seyirci(String isim) {
	
		this.isim = isim;
		seyirci_sayisi++;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	
	public void oyun_seyret() {
		System.out.println(getIsim() + " oyun seyrediyor..");
	}
}
