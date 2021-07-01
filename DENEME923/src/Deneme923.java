import java.util.Scanner;

public class Deneme923 {

	public static void faktöriyel() {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Lütfen sayi giriniz: ");	
	int sayi = scanner.nextInt();
	
	int faktöriyel = 1;
	
	for (int i= 1; i<=sayi;i++)  {
		
		faktöriyel *= i;		
	}
	System.out.println("Faktöriyel: "+faktöriyel);	
	
	}
	
	public static void main(String[] args) {
		
	faktöriyel();
	faktöriyel();

	}
	
}
