import java.util.LinkedList;

public class LinkedListler {

	
	//LinkedList'imizi bir metod yardimiyla bastiralim:
	public static void listeyiBastir(LinkedList<String>gidilecekYerler) {
		
		for (String s: gidilecekYerler) {
			
			System.out.println(s);	
			
			
		}	
		
	}
	public static void main(String[] args) {
		
		LinkedList<String> gidilecekYerler = new LinkedList<String>(); //LinkedList tanimlamak
		//tanimlama yapildiktan sonra ctrl shift o ile import islemi yapilir
		
		gidilecekYerler.add("Postane");  // linkedListe deger atamak
		
		gidilecekYerler.add("Market");
		
		gidilecekYerler.add("Okul");
		
		gidilecekYerler.add("Kütüphane");
		
		gidilecekYerler.add("Spor Salonu");
		
		gidilecekYerler.add("Ev");
		
		
		listeyiBastir(gidilecekYerler);
		
		/*Cikti
		 * Postane
		   Market
		   Okul
		   Kütüphane
		   Spor Salonu
		   Ev
		   */
		
		

	}

}
