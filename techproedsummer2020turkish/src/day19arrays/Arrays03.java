package day19arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Elemanlari 1,2,3,4,5 olan bir integer array olusturunuz
		//Bu array'de 3 elemaninin olup olmadigini kontrol ediniz
		//3 varsa ekrana "3 var" yazdirin 3 yoksa ekran "3 yok" yazdirin
		//Kac tane 3 oldugunu da yazdirin
		
		
		//Array olusturup eleman eklemek icin 1. yol
		
		int arr[] = new int[5]; 
		
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		arr[4] =5;
		
		//Array olusturup eleman eklemek icin 2. Yol
		
		int arr1[] = {1,2,3,4,5};
		
		int count =0; //flag(bayrak) 
		
		
		for(int i =0; i<5;i++) {
			
			if(arr1[i]==3) {
				count ++;
			}
			
		}
		
		if(count>0) {
			System.out.println("3 var");
		}else {
			System.out.println("3 yok");
		}		
		
		
		
	}

}
