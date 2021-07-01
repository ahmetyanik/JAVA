// arrayleri, arraylistlei ekrana bastirabilecegimiz kolay bir döngüdür.


import java.util.ArrayList;

// arraylistler
// dinamik bir veri tipidir. arraylerden farki budur.


public class Ders926 {
	public static void main(String[] args) {
		
		ArrayList<String> groups = new ArrayList<String>();
		int[] arr = {10,20,30,40,50};
		
		
		
		groups.add("Metallica");
		groups.add("Iron Maiden");
		groups.add("Guns' n Roses");
		groups.add("Black Sabbath");		
	
			
	// arraylist'i for döngüsü yardimiyla yazdirmak
	
	for (int i=0; i<groups.size(); i++) {
		System.out.println("Eleman: "+ groups.get(i));
		
			
	}
	System.out.println("......for each döngüsü.......");
	
	for(String s:groups) {
		System.out.println("Eleman: "+ s);
	}
	
	System.out.println("......for each döngüsü ile indeks gösterme.......");
	
	for(int i:arr) {
		System.out.println("Eleman: "+ i);
	
	
	
	
		
	}}}