package day23date;

import java.util.Arrays;
import java.util.Scanner;

public class Alistirma03 {

	public static void main(String[] args) {
		// Integer arrayimiz var bu arayın uzunluğunu kullanıcıdan alıyoruz 
		//ve değerleri for döngüsü ile 1er artan şekilde otomatik yazdırılmasını istiyoruz
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen eleman sayisi giriniz: ");
		int eleman = scanner.nextInt();
		int arr[] = new int[eleman];
		
		
		
		for(int i=0; i<eleman;i++) {
			
		int	x=scanner.nextInt();
			arr[i]=x+1;
			
		}
		System.out.println(Arrays.toString(arr));		

	}

}
