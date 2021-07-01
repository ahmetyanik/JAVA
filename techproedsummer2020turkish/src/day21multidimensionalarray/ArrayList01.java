package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
				
		// Arraylerde length sabittir degistirilemez. Arraylistlerde (bundan sonra list denilecek)
		//length esnektir. Biz eleman ekledikce list lengtini artirir, siz eleman sildikce
		//list lengthini azaltir.
		
		
		//Arraylistin farkli sekilde üretilmesi
		List<String> list01 = new ArrayList<>(); //Bu daha cok kullanilir
		ArrayList<String> list02 = new ArrayList<>();
		
		System.out.println(list01); //List'i bastirmak cok kolaydir
		
		//Liste eleman eklemek icin add() methodu kullanilir.
		//List önce ekleneni öne koyar
		
		list01.add("Ali");
		System.out.println(list01);// [Ali]
		
		list01.add("Can");
		System.out.println(list01);//[Ali, Can]
		
		//Veli'yi Ali ile Can'in arasina ekleyelim
		
		list01.add(1, "Veli");
		System.out.println(list01); //[Ali, Veli, Can]
		
		// list01'i [Han, Ali, Kemal, Veli, Can, Ayse] sekline getirin
		
		list01.add(0, "Han");
		list01.add(2, "Kemal");
		list01.add("Ayse");
		
		System.out.println(list01); // [Han, Ali, Kemal, Veli, Can, Ayse] olustu
		
		//list01'in eleman sayisini ekrana yazdiriniz
		
		System.out.println("List'in eleman sayisi: "+list01.size());
		
		
		

	}

}
