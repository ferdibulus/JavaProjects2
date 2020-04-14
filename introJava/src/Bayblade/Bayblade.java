package Bayblade;

public class Bayblade {
	private String baybladeci;
	private int donuzHizi;
	private int saldiriGucu;
	public Bayblade(String baybladeci, int donuzHizi, int saldiriGucu) {
	
		this.baybladeci = baybladeci;
		this.donuzHizi = donuzHizi;
		this.saldiriGucu = saldiriGucu;
	}
	public String getBaybladeci() {
		return baybladeci;
	}
	public void setBaybladeci(String baybladeci) {
		this.baybladeci = baybladeci;
	}
	public int getDonuzHizi() {
		return donuzHizi;
	}
	public void setDonuzHizi(int donuzHizi) {
		this.donuzHizi = donuzHizi;
	}
	public int getSaldiriGucu() {
		return saldiriGucu;
	}
	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}
	
	public void saldir() {
		System.out.println(baybladeci + " " + saldiriGucu + " ve " + donuzHizi + " ile saldiriyor");
	}
	
	public void kutsalCanavarOrtayaCikar() {
		System.out.println("Bu bayblade'in kutsal gucu yok");
	}
	
	public void bilgiler() {
		System.out.println("Baybladeci ismi:" + baybladeci);
		System.out.println("Saldiri gucu:" + saldiriGucu);
		System.out.println("Donus hizi:" + donuzHizi);
	}
}
