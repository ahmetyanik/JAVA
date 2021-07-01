package day37maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		/* Map bir Interface'dir. Map Interface'inin 3 tane child class'i vardir.
		 
		
		   1) HashMap: HashMap key-value yapisini kullanir. Key ve Value programci
		   tarafindan yazilir. Key ve value'da null degeri kullanilabilir. Key'de
		   birden fazla null degeri kullanilirsa Java son kullanilan null'i kabul eder.
		   Value'da birden fazla null degeri kullanilabilir.
		   HashMap consola yazdirildiginda hem key degerleri hem de value degerleri ara-
		   larina esittir sembolü konularak yazdirilir 
		   
		   HashMapler ekrana yazdirirken rastgele siralama yapar
		   HashMap Mapler arasinda en hizlisidir
		   
		   HashMap'ler "thread safe" degildir
		   
		   
		   */
		   
		   HashMap<Integer, String> hashMap = new HashMap<>();
		   hashMap.put(3, "Ali");
		   hashMap.put(1, "Veli");
		   hashMap.put(4, "Kemal");
		   hashMap.put(2, "Mine");
		   System.out.println(hashMap); // {1=Veli, 2=Mine, 3=Ali, 4=Kemal}
		   
		   System.out.println(hashMap.remove(4)); // Kemal ==>kemal silinir ve ekranda gösterilir
		   System.out.println(hashMap); // {1=Veli, 2=Mine, 3=Ali}
		   
		   System.out.println(hashMap.remove(1, "Veli")); //true==> Burada Java true veya false verir
		   System.out.println(hashMap.remove(4, "Ayse")); //false==> Burada false verir
		   
		   System.out.println(hashMap); // {2=Mine, 3=Ali}
		   
		   System.out.println(hashMap.get(2)); // Mine
		   System.out.println(hashMap.get(100)); // null
		   
		   System.out.println(hashMap.keySet()); // [2, 3] keyleri yazdirir
		   
		   System.out.println(hashMap.values()); // [Mine, Ali]  valueleri verir
		   
		   System.out.println(hashMap.size());  // 2 eleman sayisini verir
		   
		   System.out.println(hashMap.containsKey(3)); // true
		   System.out.println(hashMap.containsKey(4)); // false
		   
		   System.out.println(hashMap.containsValue("Mine")); // true
		   System.out.println(hashMap.containsValue("Emin")); // false
		   
		   hashMap.clear(); // Tüm elemanlari siler
		   System.out.println(hashMap); // {}
		   

	}

}
