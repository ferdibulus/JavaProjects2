package AbstractClass;

public class Daire extends Sekil {
	private int yaricap;
	public Daire(String isim,int yaricap) {
		super(isim);
		this.yaricap =yaricap;
		// TODO Auto-generated constructor stub
	}

	@Override
	void alanHesapla() {
		// TODO Auto-generated method stub
		System.out.println(getIsim() + " alani:" + (Math.PI * yaricap * yaricap));
	}
	
}
