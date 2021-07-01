package odev;
public class ConcatenationOdev02 {
	public static void main(String[] args) {
		int numA = 2;
		int numB = 3;
		String str1="Study";
	    String str2 ="Hard";
	//Yukarıdaki variable'lari kullanarak ekrana  "61 Study-1"  yazdıran bir program yazınız
		System.out.print((numA+numB)+(numB-numA));
		System.out.print((numB-numA));
		System.out.print(" "+str1+"-");
		System.out.println((numB-numA));//sonuc:61 Study-1
		
		
		System.out.println("Ali"+4+5);
		System.out.println(4+5+"Ali");
		System.out.println("Ali"+4+5+6);
		
	}}