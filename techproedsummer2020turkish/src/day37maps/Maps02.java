package day37maps;

import java.util.Hashtable;

public class Maps02 {

	public static void main(String[] args) {
		/*
		 HashTable: HashMap ile hemen hemen aynidir.
		 1) HashTable da hashMap gibi konsola yazdirdiginda rastgele sira ile yazdirir 
		 
		 Farklari:
		 1) Key ve valuelarda null'a müsaade etmez
		 2) HashTable thread safe'dir. (birkac isi ayni anda yapabilir)
		 3) HashTable daha yavastir
		  
		 */
		
		
		Hashtable<String,String> hTable = new Hashtable<>();
		hTable.put("Dil", "Kalp");
		hTable.put("Gönül", "Kalp");
		hTable.put("Dil", "Tad alma organi");
		
		// hTable.put(null, "Agizlik"); // runTime error verir
		
		// hTable.put("Kanaat", null); // runTime error verir
		
		//Ayni key degerini tekrar kullanirsaniz son value'yu kabul eder
		System.out.println(hTable); // {Dil=Tad alma organi, Gönül=Kalp}
		
		// HashMap'te kullandigimiz metotlarin tamami HashTable'da kullanilabilir
		
		
		

	}

}
