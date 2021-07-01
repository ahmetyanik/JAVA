package day20arrays;

public class Alistirma04 {

	public static void main(String[] args) {
		// Arrayin icindeki elemanlari toplayan bir program yaziniz
		
		
		int arr[] = {2,3,4,5,6};
		
		int length = arr.length;
		int sum=0;
		
		for(int i=0; i<length; i++) {
			
			sum +=arr[i];
		}
		System.out.println(sum);

	}

}
