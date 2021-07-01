import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListlerdeSiralIEkleme {
	
	
	public static void bastir(LinkedList<String>gidilecekYerler) {
		
		for(String i: gidilecekYerler) {
			
			System.out.println(i);
		}
	}

	
	public static void siraliEkle(LinkedList<String>gidilecekYerler,String yeni) {
		
		ListIterator<String>iterator = gidilecekYerler.listIterator();
		
		while(iterator.hasNext()) {
			
			int karsilastir = iterator.next().compareTo(yeni);
			
			if (karsilastir == 0) {
				
				System.out.println("Bu eleman zaten var.");
				return;
				
			}else if(karsilastir<0) {
				
				
			}else if(karsilastir>0) {
				
				iterator.previous();
				iterator.add(yeni);
				
				return;
			}
			
		}
		
		iterator.add(yeni);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		
		LinkedList<String>gidilecekYerler = new LinkedList<String>();
		
		
		siraliEkle(gidilecekYerler,"Züccaciye");
		siraliEkle(gidilecekYerler,"Bakkal");
		siraliEkle(gidilecekYerler,"Manav");
		siraliEkle(gidilecekYerler, "Kuaför");
		siraliEkle(gidilecekYerler, "Kuaför");
		bastir(gidilecekYerler);
		
		

	}

}
