package day21multidimensionalarray;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {

	public static void main(String[] args) {
		// ["Ali","Can","Ayse","Ali"] listini olusturunuz
		
		List<String> list01 = new ArrayList<>();
		
		
		list01.add("Ali");
		list01.add("Can");
		list01.add("Ayse");
		list01.add("Ali");
		
		System.out.println(list01);
		
		list01.remove("Ali");//Birden fazla ayni eleman varsa ilkini siler
		System.out.println(list01);
		
		list01.remove("Ali");
		System.out.println(list01);
		
		list01.remove("Kemal"); //remove() methodu listede olmayan elemani cikarmak istersek hicbirsey yapmaz/hata vermez
		System.out.println(list01);
		
		
		System.out.println(list01.remove("Ayse"));//true
		
		System.out.println(list01.remove(0)); //0. indexteki elemani siler ve sildigi bu elemani cikti olarak verir

		//Ayse elemanini Aysegül yapalim: Bunun icin set() methodu kullanilir
		
		list01.add("Ayse");
		System.out.println(list01);
	
		
		System.out.println(list01.set(0, "Aysegül"));//Ayse  degisen elemani verir
		list01.set(0, "Aysegül");
		System.out.println(list01);
		
		//List'e "Kenan" ve "Zeynep" ekleyiniz
		
		list01.add("Kenan");
		list01.add("Zeynep");
		System.out.println(list01);
		
			
		System.out.println(list01);// [Aysegül, Kenan, Zeynep]
		
		list01.clear();
		System.out.println(list01);
		
		
		
	}

}
