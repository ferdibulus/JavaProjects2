package AbstractClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sekil sekil = new Sekil("Sekil");
		Sekil sekil;
		sekil = new Kare("Kare2", 3);
		Kare kare = new Kare("Kare1", 5);
		Daire daire = new Daire("Daire", 2);
		kare.alanHesapla();
		daire.alanHesapla();
		sekil.alanHesapla();
		
	}

}
