package day20arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//Bir integer arrayin elemanlarini kücükten büyüge diziniz ve
		//ekrana iki durumu da yazdiriniz
		
		int arr[] = {2,11,0,23,7};
		
		System.out.println(Arrays.toString(arr));
		
		//Arrays.sort() methoduna parametre olarak array'in adi yazilirsa o array'in
		//elemanlari kücükten büyüge(ascending order) siralanmis olur
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
