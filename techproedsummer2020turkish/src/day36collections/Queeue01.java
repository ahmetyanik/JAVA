package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queeue01 {

	public static void main(String[] args) {
		// Queue: Queue'ye eklenen elemanlar en sona eklenir, List'lerde 
		// oldugu gibi
		// Queue'da silinen elemanlar en bastan silinir
		// [1,2,3] Bu Queue'dan eleman silmeye basladiginizda önce 1 silinir
		// Bunun icin tabir vardir. FIFO==> First In First Out
		
		
		//  PriorityQueue elemanlari Natural Order'a göre siralar
		Queue<String> q = new PriorityQueue<>();
		
		q.add("B");
		q.add("A");
		q.add("C");
		
		System.out.println(q); // [A, B, C]
		
		//remove() methodu kullanalim (parametresiz)
		
		System.out.println(q.remove()); // A==> remove() methodu sildigi elemani return eder ve
		// her zaman ilk elemani siler
		System.out.println(q);  // [B, C]
		
		System.out.println(q.remove("C")); // true  yazar, cünkü biz java'ya hangi elemani
		// silmesi gerektigini söyledik java true return ederek islem tamam mesaji verir
		System.out.println(q); // [B]  kalan eleman
		
		
		// LinkedList elemanlari sizin girdiginiz siraya göre siralar
		Queue<String> qll = new LinkedList<>();
		
		qll.add("B");
		qll.add("A");
		qll.add("C");
		
		System.out.println(qll); // [B, A, C]
		
		System.out.println(qll.element()); //B ilk elemani döndürür
		
		System.out.println(qll.poll()); // B  poll() remove() gibi ilk elemani sildi ve return etti
		// remove() methodu bos queue'lar icin kullanilamaz fakat poll() methodu bos queue'dan eleman
		// silerken hata vermez ayni zamanda sonuc olarak null verir
		System.out.println(qll); // [A, C]
		
		
		// Not: remove() methodu bos queue'lar icin kullanilirsa exception verir. Poll() methodu
		//bos queue'lar icin kullanilirsa null verir. Ama dolu queue'lar icin ayni isi yaparlar farklari
		//yoktur.		

	}

}
