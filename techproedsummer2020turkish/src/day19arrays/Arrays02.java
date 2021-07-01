package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// 4 elemanli char bir array olusturun, bu array'e elemanlar yerlestirin
		//Tüm elemanlari for döngüsü kullanarak ekrana yazdirin
		//Sadece son elemani ekrana yazdirin
		
		char arr[] = new char[4];
		
		arr[0] = 'a';
		arr[1] = 'b';
		arr[2] = 'c';
		arr[3] = 'd';
		
		for(int i=0; i<arr.length;i++) {
			
			System.out.println(i+". index= "+arr[i]);
		}
			System.out.println("Son index="+arr[arr.length-1]);
			
		//Array'in length'ini bulmak icin array'isminden sonra nokta koyup
		//length yapariz
		//DIKKAT: Stringlerde de length methodu kullanilir ama Stringlerdeki
		//length methodu parantezlidir. length()
			
		System.out.println(arr.length); //4

	}

}
