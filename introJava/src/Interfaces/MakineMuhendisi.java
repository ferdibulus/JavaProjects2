package Interfaces;

public class MakineMuhendisi implements IMuhendis{
	private boolean askerlik;
	private boolean adli_sicil;
	
	public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
	
		this.askerlik = askerlik;
		this.adli_sicil = adli_sicil;
	}

	
	@Override
	public void askerlikDurumuSorgula() {
		// TODO Auto-generated method stub
		if(askerlik) {
			System.out.println("Askerligimi yaptim");
		}
		else {
			System.out.println("Askerligimi henuz yapmadim");
		}
		
	}

	@Override
	public String mezuniyetOrtalamasi(double derece) {
		// TODO Auto-generated method stub
		
		return "Ortalamam:" + derece;
	}

	@Override
	public void adliSicilSorugula() {
		// TODO Auto-generated method stub
		if(adli_sicil) {
			System.out.println("Adli sicil kaydim var.");
		}
		else {
			System.out.println("Adli sicilim temiz.");
		}
	}

	@Override
	public void isTecrubesi(String[] array) {
		// TODO Auto-generated method stub
		if(array.length == 0) {
			System.out.println("Bir tecrubem yok");
		}
		else {
			System.out.println("Makine muhendisi olarak su sirketlerde calistim.");
			for(String s:array) {
				System.out.println(s);
			}
		}
	}
	
	public void referansGetir(String[] array) {
		if(array.length==0) {
			System.out.println("Herhangi bir referasim yok");
		}
		else {
			
			System.out.println("Referanslarim");
			for(String a:array) {
				System.out.println(a);
			}
		}
	}
	
}
