package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// toArray() methodu list'i array'e cevirmek icin kullanilir
		
		List<String>list = new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		System.out.println(list);
		
		System.out.println("re: "+list.retainAll(list));
		
				
		//1. Yol: toArray() methodunun icinde parametre olarak new String(0) kullaniniz
		String arr[] = list.toArray(new String[0]);		
		System.out.println(Arrays.toString(arr));
		
		//2.Yol: Olusturdugunuz array'in data taype'ini object olarak secin
		//Object javada bütün class'larin parent'idir (yani üst klas). Yani Object class
		//ortak atadir
		//Object class javada parent'i olmayan tek class'tir
		//String object class'in child'i oldugundan data type olarak bazi durumlarda String yerine
		//Object kullaniriz
		
		Object[] arr1 = list.toArray();
		System.out.println(Arrays.toString(arr1));
		
		//asList() methodu array'leri list'e cevirmek icin kullanilir
		//asList() methodu parametre olarak array'in ismini kabul eder
		
		String arr2[] = {"Aliye","Canan"};
		
		List<String> list1 =Arrays.asList(arr2);
		System.out.println(list1);
		
		
		//DIKKAT: Array'den List'e cevirme yaptiginizda elde ettiginiz List uzunluk olarak esnek degildir
		//Yani arrayden olusturdugumuz List'e ekleme ve cikarma yapamayiz
		
		list1.add("Emine");//UnsupportedOperationException RunTime Error verir
		list1.remove("Kemal");//Bu da Run Time Error verir
		

	}

}
