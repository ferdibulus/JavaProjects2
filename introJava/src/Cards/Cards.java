package Cards;

public class Cards {
 private char deger;
 private boolean tahmin=false;
 		public Cards(char deger) {
 			
 			this.deger = deger;
 		}
		public char getDeger() {
			return deger;
		}
		public void setDeger(char deger) {
			this.deger = deger;
		}
		public boolean isTahmin() {
			return tahmin;
		}
		public void setTahmin(boolean tahmin) {
			this.tahmin = tahmin;
		}
 		
 
}
