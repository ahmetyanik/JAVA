import java.util.ArrayList;

public class ArrayListler {

	public static void main(String[] args) {

		//ÖNCE ARRAYLIST NASIL TANIMLANIR ONU GÖRELIM
		ArrayList<String> arraylist = new ArrayList<String>();
		// daha sonra ctrl+shift+o ile import edilir
		
		// simdi arrayliste deger ekleyelim bunun icin add metodunu kullanacagiz
		
		arraylist.add("Metallica");
		arraylist.add("Black Sabbat");
		arraylist.add("Iron Maiden");
		arraylist.add("Guns' n Roses");
		
		//Arraylist'in indekslenmesi arraylerle birebir aynidir
		
		System.out.println(arraylist.get(0)); //arraylistin elemanina ulasmak icin get metodu kullanildi
		//cikti: metallica
		
		//arraylistin boyu yani icinde kac tane eleman var bulmak icin size() metodu kullanilir;
		
		System.out.println(arraylist.size());   //cikti:4
		
		//arraylisti nasil bastiririz
		
		for (int i=0;i<arraylist.size();i++) {
			
			System.out.println(arraylist.get(i));
			
			/*cikti:
				Metallica
				Black Sabbat
				Iron Maiden
				Guns' n Roses*/

		}// arraylist'ten bir degerin cikarilmasi: remove metodu
		
		arraylist.remove("Metallica"); // bu sekilde cikarttik  remove'un icine direkt indeks sirasini da yazabiliriz
		
		
		for (int i=0;i<arraylist.size();i++) {
			
			System.out.println(arraylist.get(i));
			
			/* cikti:
			 * Black Sabbat
			   Iron Maiden
			   Guns' n Roses
			 */
		
		}
		// Bir Elemanin Indeksini Ögrenmek   indexOf metodu
		
		System.out.println(arraylist.indexOf("Iron Maiden"));  //cikti:1		
		
		//Dikkat burada söyle bir olay var: 0. indexten baslayip ilk gördügü Iron Maiden'da durup onun indexini veriyor.
		//Peki ya iki tane Iron Maiden degerimiz olsaydi? onu da sondan aratabiliriz: lastIndexOf metodu
		// eger arattigimiz herhangi bir deger arraylistin icinde yoksa arraylist bize -1 döner	
	
	
		// arraylist'te bir degeri güncelleme arraylist.set metodu
		//önce indexsi girecegiz sonra degerimizi girecegiz
		
		arraylist.set(1, "Kirac");
		System.out.println(arraylist.get(1)); // cikti: Kirac
	
	}
}
