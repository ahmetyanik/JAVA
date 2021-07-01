package day22arraylist;

public class Alistirma01 {

	public static void main(String[] args) {
		// integer.dan oluşan bir arrayımız var. uzunluğu birden büyük 
		//ve ilk element 1 ise True...değilse false...
		
		
		int arr[] = {1,2,3,4};
		
		if(arr.length>1 && arr[0]==1) {
			
			System.out.println("True");
		}else {
			System.out.println("False");
			
		}		

	}

}
