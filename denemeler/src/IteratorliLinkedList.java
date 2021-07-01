import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorliLinkedList {

	
	public static void bastir(LinkedList<String>gidilecekYerler) {
		
		ListIterator<String>iterator=gidilecekYerler.listIterator();
		
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}		
	}
	
	public static void main(String[] args) {
		
	
		LinkedList<String> gidilecekYerler = new LinkedList<String>();
		
		gidilecekYerler.add("Konya" );
		gidilecekYerler.add("Van");
		gidilecekYerler.add("Bayburt");
		gidilecekYerler.add("Hakkari");
		gidilecekYerler.add("Antalya");
		gidilecekYerler.add(3,"Kayseri");
		gidilecekYerler.remove("Konya");
		
		bastir(gidilecekYerler);

	}

}
