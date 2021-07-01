package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
		//integer Array olusturalim
		
		int arr1[] = new int[5];
		
		
		System.out.println(arr1);//array'in adresini verir
		System.out.println(arr1[0]);//0. indexteki elemani verir 
		System.out.println(arr1[3]);//3. indexteki elemani verir

		arr1[0] = 12; //0. indekse atama yaptik
		System.out.println(arr1[0]);

		arr1[1] = 25; //1. indekse atama yaptik
		System.out.println(arr1[1]);
		
		arr1[2] = 76; //2. indekse atama yaptik
		System.out.println(arr1[2]);
		
		arr1[3] = 39; //3. indekse atama yaptik
		System.out.println(arr1[3]);
		
		arr1[4] = 22; //4. indekse atama yaptik
		System.out.println(arr1[4]);
		
		//array'deki elemanlari ekrana yazdirmak icin for döngüsü kullaniniz
		
		
		for(int i=0; i<=(arr1.length)-1;i++) {
			
			System.out.println(i+" "+arr1[i]);
			
		//array'de olmayan indexse deger atamasi yapilirsa runtime error alinir
		//java.lang.ArrayIndexOutOfBoundsException: 
			
			arr1[5] = 23;
			
		 
			
		}
		
		
	}

}
