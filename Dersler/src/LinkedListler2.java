import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListler2 {    //***SEKILLI KAGITLA BIRLIKTE CALIS

	
	//LinkedList'imizi bir metod yardimiyla bastiralim:
	public static void listeyiBastir(LinkedList<String>gidilecekYerler) {
		
		ListIterator<String> iterator = gidilecekYerler.listIterator();
		
		while (iterator.hasNext()) {  //kosulumuz: iteratordan sonra nesne var mi? true
			System.out.println(iterator.next());  // ise nesneyi bastir
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
		
		System.out.println("______________________");
		
		gidilecekYerler.add(4,"Alisveris Merkezi");  // LinkedListlere veri ekleme
		
		listeyiBastir(gidilecekYerler);
		
		/*Cikti
		 * Postane
		   Market
		   Okul
		   Kütüphane
		   Spor Salonu
		   Ev
		   */
		/*______________________
		Postane
		Market
		Okul
		Kütüphane
		Alisveris Merkezi
		Spor Salonu
		Ev */
		
		System.out.println("_______________");

		gidilecekYerler.remove(3);  // Linkedlist'ten veri cikartma
		listeyiBastir(gidilecekYerler);
	}

}
