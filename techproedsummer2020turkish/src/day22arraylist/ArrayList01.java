package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// equals() methodu iki listin iceriginin birbirine esit olup olmadigini kontrol eder
		//List'lerin elemanlari ve elemanlarin indexleri ayni ise "true" degilse "false" return eder
		//equals() methodu objelerin referanslarina bakmaz
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		System.out.println(list1.equals(list2));//true
		
		list1.add("A");
		System.out.println(list1.equals(list2));//false
		
		System.out.println(list2.add("A"));//true
		
		
	}

}
