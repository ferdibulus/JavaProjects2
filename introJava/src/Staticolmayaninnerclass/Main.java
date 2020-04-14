package Staticolmayaninnerclass;

public class Main {
	public static class BaseA{
		private String name;
		public static  int sayac = 0;
		public BaseA(String name) {
			
			this.name = name;
			sayac++;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public  int getSayac() {
		
			return sayac;
		}
		public void setSayac(int sayac) {
			
			BaseA.sayac = sayac;
		}
		public void yazdir() {
			System.out.println(getName() + " isimli oyuncu calisiyor.");
		}
		
	}
	public static class C extends BaseA{
		
		
	
		public C(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void yazdir() {
			// TODO Auto-generated method stub
			System.out.println(getName() + " isimli oyuncu dinleniyor..");
		}
		
		
		
	}
	
	public static void main(String[] args) {
			BaseA baseA = new BaseA("ferdi");
		
		
			
			System.out.println(BaseA.sayac);
			System.out.println(System.currentTimeMillis());
			
			//System.out.println(baseA.getSayac());
	}

}
