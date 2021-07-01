import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList3 {

	public static void listeyiBastir(LinkedList<String>gidilecekYerler) {
		
		for (String s: gidilecekYerler) {
			
			System.out.println(s);	
		}
			
		}
	
	public static void siraliEkle(LinkedList<String>gidilecekYerler,String yeni) {
		
		ListIterator<String> iterator = gidilecekYerler.listIterator(); //önce iterator olusturalim
		
		while (iterator.hasNext()) {
			
			int karsilastir = iterator.next().compareTo(yeni);
			
			if(karsilastir == 0) {
				// iki deger esit
				System.out.println("Listenizde bu eleman zaten var.");
				return;
				
			}else if(karsilastir<0) {
				
				// yeni deger iterator.next'ten daha büyük
			
			}else if (karsilastir > 0) {
				
				iterator.previous();
				iterator.add(yeni);
				return;
			}
			
		}
		iterator.add(yeni);
		
		
		
	}
	public static void main(String[] args) {
	
		LinkedList<String> gidilecekYerler = new LinkedList<String>();
		
		siraliEkle(gidilecekYerler, "Postane");
		siraliEkle(gidilecekYerler, "Market");
		siraliEkle(gidilecekYerler, "Ev");
		siraliEkle(gidilecekYerler, "Züccaciye");
		siraliEkle(gidilecekYerler, "Manav");
		siraliEkle(gidilecekYerler, "Restoran");
		
		listeyiBastir(gidilecekYerler);
		

	}

}
