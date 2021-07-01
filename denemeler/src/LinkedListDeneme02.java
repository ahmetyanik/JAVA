import java.util.LinkedList;

public class LinkedListDeneme02 {

	public static void bastir (LinkedList<String>yemekler) {
		
		for(String i: yemekler) {
			
			
			System.out.println(i);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<String>yemekler = new LinkedList<String>();
		
		yemekler.add("Imambayildi");
		yemekler.add("Kebap");
		yemekler.add("Salad");
		yemekler.add("Sütlac");
		yemekler.add("pilav");
		yemekler.add(2, "Karpuz");
		
		
		bastir(yemekler);
		
		

	}

}
