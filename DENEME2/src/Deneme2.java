import java.util.Scanner;

public class Deneme2 {
	
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Araciniz km'de ne kadar yakiyor?: ");
	double yakit = scanner.nextDouble();
	
	System.out.print("Araciniz kac kilometre yol katetti?: ");
	double km = scanner.nextDouble();
	
	double tutar = (yakit*km);
	
	System.out.print("Ödemeniz gereken tutar: "+ tutar+" Tl ödemeniz gerekmektedir.");
	

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
