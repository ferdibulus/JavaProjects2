package TrainingArray;

import java.util.ArrayList;

public class Main {
public static void main(String args[]) {
	Hayvan hayvan = new Hayvan("Timoti");
	ArrayList<String> arrayList = new ArrayList<String>();
	hayvan.arrayOlustur();
	hayvan.arrayGoruntule(arrayList);
 }
}
