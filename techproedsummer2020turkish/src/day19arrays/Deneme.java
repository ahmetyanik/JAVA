package day19arrays;

public class Deneme {
	

		
		
	    public static void main(String[] args) {
	        // Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol eden
	        // bir program yazınız.
	        // Aynı eleman varsa “Aynı eleman var” yoksa “Aynı eleman yok”
	        // yazdırınız.
	        int arr[] = {3, 2, 23, 5, 3, 8, 2, 7, 9, 5, 4};
	        int arr1[] = new int[arr.length];
	        int count = 0;
	        
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    arr1[count] = arr[i];
	                    count++;
	                }
	            }
	        }
	        if (count > 0) {
	            System.out.print("Aynı eleman var ("+count + " tane elemanın aynısından var).\n");
	            System.out.print("Bu elemanlar : ");
	                for (int m = 0; m < count; m++) {
	                    System.out.print(arr1[m] + " ");
	                }
	            } else {
	                System.out.println("Aynı eleman yok");
	            }
	    }
	}