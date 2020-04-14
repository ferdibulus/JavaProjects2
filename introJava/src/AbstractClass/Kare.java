package AbstractClass;

public class Kare extends Sekil {
	private int kenar;
	
	public Kare(String isim,int kenar) {
		super(isim);
		this.kenar =kenar;
		// TODO Auto-generated constructor stub
	}

	@Override
	void alanHesapla() {
		// TODO Auto-generated method stub
		System.out.println(getIsim() + " alani:" + (kenar*kenar) + " dir.");
	}
	
	public void cevreHesapla() {
		System.out.println(getIsim() + " cevresi:" + (4*kenar) );
	}

}
