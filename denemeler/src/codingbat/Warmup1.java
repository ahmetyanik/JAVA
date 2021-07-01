package codingbat;

public class Warmup1 {

	public static void main(String[] args) {
		
		String x = "Ayse";
		
		System.out.println(x.charAt(2)+x.charAt(0));

	}
	
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  
		if(!weekday || vacation) {
			System.out.println("true");
			return true;
		}else {
			System.out.println("false");
			return false;
		}
		  
		}

}
