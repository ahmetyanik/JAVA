package day11stringmethods;

public class ForLoop02 {

	public static void main(String[] args) {
		//100'den kücük 3'ün kati olan sayma sayilarini ekrana yanyan yazdiran for loop olusturunuz.
		
		for(int i =3;i<100;i+=3) {
			
			System.out.print(i+" ");
		}
		System.out.println();
		
		int toplam = 0;
		
		for(int i=1;i<6;i++) {
			
			toplam += i;
		}
		System.out.println("Toplam: "+toplam);//sadece en son adimi ekranda görmek istersek yazdirma islemini
		//for loop'un disinda yapiniz
	
		int sum=0;
		for(int i=11;i<14;i++) {
			sum+=i;
		}
		System.out.println("Toplam: "+sum);
	
		// 20'den büyük ilk 5 sayma sayisinin toplamini veren for loop olusturunuz
		
		int sum1=0;
		for(int i=21;i<26;i++) {
			sum1+=i;
		}System.out.println("toplam: "+sum1);
		//ilk 50 sayma sayisinin toplamini veren for loop olusturunuz
		int sum2=0;
		for(int i=1;i<51;i++) {
			sum2+=i;
		}System.out.println("toplam: "+sum2);
		
		int sum4=0;
		for(int i=0;i<100;i=i+5) {
			sum4+=i;
		}System.out.println("Toplam: "+sum4);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
