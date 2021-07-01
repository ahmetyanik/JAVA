package day15methodcreation;

public class AlistirmaMethod03 {

	public static void main(String[] args) {

		/*Write a Java method to display the middle character of a string. Go to the editor
		Note: a) If the length of the string is odd there will be two middle characters.
		b) If the length of the string is even there will be one middle character.
		Test Data:
		Input a string: 350
		Expected Output:

		                                                                          
		The middle character in the string: 5*/
		
		ortaKarakter("Ahmet");
		ortaKarakter("Ayse");
		ortaKarakter("Galatasaray");
		

	}
	
	public static void ortaKarakter(String str) {
		
		int length = str.length();
		
		if(length%2==0) {
			
			System.out.println(str.substring((length/2)-1,length/2+1));
		}else {
			
			System.out.println(str.substring((length/2), length/2+1));
		}
		
	}
	
	

}
