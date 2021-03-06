package Polymorphisim;
	
	class Hayvan{
		private String isim;

		public Hayvan(String isim) {
			
			this.isim = isim;
		}

		public String getIsim() {
			return isim;
		}

		public void setIsim(String isim) {
			this.isim = isim;
		}
		
		public String konus() {
			return this.isim + " konusuyor";
		}
		
	}
	
	class Kedi extends Hayvan{

		public Kedi(String isim) {
			super(isim);
			
		}

		@Override
		public String konus() {
			// TODO Auto-generated method stub
			return this.getIsim() + " miyavliyor";
		}
		
		
	}
	
	class Kopek extends Hayvan{
		

		public Kopek(String isim) {
			super(isim);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String konus() {
			// TODO Auto-generated method stub
			return this.getIsim() + " havliyor";
		}
		
	}
	
	
	
	public class Main {
		public static void konustur(Object object) {
			if(object instanceof Kopek) {
				Kopek kopek = (Kopek)object;
				System.out.println(kopek.konus());
			}
			else if(object instanceof Kedi) {
				Kedi kedi = (Kedi)object;
				System.out.println(kedi.konus());
			}
			else if(object instanceof Hayvan) {
				Hayvan hayvan = (Hayvan)object;
				System.out.println(hayvan.konus());
			}
			
		}
	  public static void main(String[] args) {
		  Hayvan hayvan = new Hayvan("tIMOTII");
		  Kopek kopek = new Kopek("Karabas");
		  Kedi kedi = new Kedi("Rambo");
		  
		  konustur(hayvan);
		  konustur(kopek);
		  konustur(kedi);
	  }
	}
