package day30exceptions;

public class TryCatch02 {

	public static void main(String[] args) {
		
		
		String s = ""; // bunun lengthi 0'dir
		
		try {
			s+="t";
		}catch(Exception e) {
			s+="c";
			
		}finally {
			s+="f";
		}
		s+="a";
		
		System.out.println(s);
		
		//String'e null atandigi zaman veya instance variable'a deger atamasi yapilmadiginda
		//length() methodu calismaz ve NullPointerException hatasi alinir
		
		String n = null; // bunun length methodu calismaz exception verir
		
		System.out.println(n.length());
	}

}
