import java.util.ArrayList;

// arraylistler
// dinamik bir veri tipidir. arraylerden farki budur.


public class Ders925 {
	public static void main(String[] args) {
		
		ArrayList<String> groups = new ArrayList<String>();
		
		groups.add("Metallica");
		groups.add("Iron Maiden");
		groups.add("Guns' n Roses");
		groups.add("Black Sabbath");		
	
	System.out.println("0.indeks: "+ groups.get(0));
	System.out.println("1.indeks: "+ groups.get(1));
	System.out.println("2.indeks: "+ groups.get(2));
	System.out.println("3.indeks: "+ groups.get(3));
	
	 //arraylist'in boyutunu bulmak
	
	System.out.println("Arraylist uzunluk: "+ groups.size());
		
	// arraylist'i for döngüsü yardimiyla yazdirmak
	
	for (int i=0; i<groups.size(); i++) {
		System.out.println("Eleman: "+ groups.get(i));
	}
		
	// daha sonradan bir ögeyi silmek istersek:
	
	groups.remove(1);
	
	System.out.println("Eleman1: "+ groups.get(1));
		
	// ögemizin indeksini ögrenmek icin
	
	System.out.println(groups.indexOf("Metallica"));  // 0. indexte oldugu görülüyor
		
	}
	
	
	
	
	

}
