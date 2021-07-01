import java.util.LinkedList;

public class LinkedListDeneme01 {

	public static void listeyiBastir(LinkedList<String>gidilecekYerler) {
		
		for(String i:  gidilecekYerler) {
			
			System.out.println(i);
			
		}
		
		
	}
		
	
	
	
	public static void main(String[] args) {
		
		LinkedList<String> gidilecekYerler = new LinkedList<String>();
		
		gidilecekYerler.add("Ankara");
		gidilecekYerler.add("Adana");
		gidilecekYerler.add("Afyon");
		gidilecekYerler.add("Antalya");		
		

		listeyiBastir(gidilecekYerler);
		
		
	}

}
