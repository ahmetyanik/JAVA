// arrayleri, arraylistlei ekrana bastirabilecegimiz kolay bir d�ng�d�r.


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
	
			
	// arraylist'i for d�ng�s� yardimiyla yazdirmak
	
	for (int i=0; i<groups.size(); i++) {
		System.out.println("Eleman: "+ groups.get(i));
		
			
	}
	System.out.println("......for each d�ng�s�.......");
	
	for(String s:groups) {
		System.out.println("Eleman: "+ s);
	}
	
	System.out.println("......for each d�ng�s� ile indeks g�sterme.......");
	
	for(int i:arr) {
		System.out.println("Eleman: "+ i);
	
	
	
	
		
	}}}