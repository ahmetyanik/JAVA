package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		//List olusturun adi list01 olsun
		//Listler data type olarak primitivleri kabul etmez
		//Primitivlerde data type'ini non-primitiv yapmak icin Wrapper Classlari kullaniriz		
		
		List<Integer> list01 = new ArrayList<>();
		
		// Bu list'in icinde eleman olup olmadigini kontrol ediniz  isEmpty() methodu kullanilir
		//isEmpty() list bos ise true dolu ise false return eder
		
		System.out.println(list01.isEmpty()); //true
		
		//Bu list'e bir eleman ekleyin
		
		list01.add(2);
		System.out.println(list01);
		
		System.out.println(list01.isEmpty()); //false
		
		//List'ten eleman silmek: remove() methodu kullanilir
		list01.add(124);
		list01.add(125);
		list01.add(124);
		
		System.out.println(list01); //[2, 124, 125, 124]
		list01.remove(1); //index'i 1 olan elemani siler
		System.out.println(list01); //[2, 125, 124]
		list01.remove(0);
		System.out.println(list01); // [125, 124]
		
		//List'teki son elemani silin
		
		list01.remove(list01.size()-1);
		System.out.println(list01); // [125]	
		

	}

}
