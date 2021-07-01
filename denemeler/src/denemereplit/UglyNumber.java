package denemereplit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UglyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayıyı giriniz: ");
		
		List<Integer> asalBölen = new ArrayList();
		
		int sayi=scanner.nextInt();
		int bolen=2;
		int bolunen=sayi;
		
		
		
		
		while(bolen<=sayi){
			if(bolunen%bolen==0){
				
				asalBölen.add(bolen);
				bolunen/=bolen;
				
		}
			else{
				bolen++;
					}
				}
		
		System.out.println(asalBölen);
		
		
		if(asalBölen.contains(2)|| asalBölen.contains(3)||asalBölen.contains(5)) {
			
			
			System.out.println("ugly number");
			
			
			
		}else if(sayi==1){
			
			System.out.println("ugly number");
			
			
		}
		
		else {
			
			System.out.println("ugly number  degildir");
		}
		
			}
		}