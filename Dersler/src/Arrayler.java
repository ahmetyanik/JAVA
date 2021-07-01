import java.util.Scanner;

public class Arrayler {

	public static void main(String[] args) {
		
		int[] x;     // int arrayi cinsinden bir a degiskeni olusturduk
		
		double[] b;
		
		
		int[] a = new int[10]; // c referansimiz bu arrayin icinde 10 adet integer deger olacagini gösteriyor.
								// yani bellekte 10 adet integerlik yer olusturuldu.
		
		
		// arrayler tanimlandiktan sonra genisletilemiyor.
		
		
		//arrayin elemanina erismek icin indeksleme yapilacak
		
		
		a[5] =32;   //arrayin 5. indeksine 32 degeri eklendi
		a[9] =50;
		
		//yukardaki gibi tek tek tanimlamak yerine daha kolay bir sekilde deger atanabilir:
		
		
		int[] y = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(y[4]);
	  //System.out.println(y11); //hata verir  /*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
									//y11 cannot be resolved to a variable at Arrayler.main(Arrayler.java:30)*/
		
		
		// for döngüsünden 5 adet int degeri array'e atmak
		
		for (int i = 0; i<5 ;i++ ) {
			
			a[i] = i * 4 + 2;
			
			System.out.println(a[i]);
			
		}
		// kullanicidan alinan 5 adet degeri array'e atamak (scanner objesi yardimiyla)
		
			int [] k = new int[5];
		
			Scanner scanner = new Scanner(System.in);
			for(int i = 0; i<5; i++) {
				k[i] = scanner.nextInt();			
				
				
				
			}		}		}

		
			
			
			
			
			
			
			
			
			
		
		
		
	


