package day15methodcreation;

public class Alistirma04 {

	public static void main(String[] args) {
	
//		Write a Java method to count all vowels in a string. Go to the editor
//		Test Data:
//		Input the string: w3resource
//		Expected Output:
//
//		Number of  Vowels in the string: 4
		
		countVowels("veli");

	}
	
	public static void countVowels(String str) {
		
		int length = str.length();
		int count = 0;
		
		for (int i =0; i<length;i++) {
			
			if(str.contains("a")) {
				
				count +=1;
				
			}System.out.println(count);
			
		}
		
	}

}
