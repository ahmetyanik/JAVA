import java.util.Scanner;

public class Deneme929 {
	
	public static int toplama(int a,int b,int c) {
		return (a+b+c);
		
	}
	public static int toplama(int a,int b) {		
		return (a+b);
	}
	public static int carpma(int a,int b,int c) {		
		return (a*b*c);
	}
	public static int carpma(int a,int b) {		
		return (a*b);
	}
	public static int cikarma(int a,int b) {		
		return (a-b);
	}
	public static double bölme(double a,double b) {		
		return (a/b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("*****Hesap Makinesi*****");
		
		
		while (true) {	
		System.out.print("Islem Seciniz:");
		Scanner scanner = new Scanner(System.in);
		int islem = scanner.nextInt();

			
		if (islem ==1) {
			
			System.out.println("Programdan cikiliyor...");
			break;
		}
		else if(islem ==2) {
			
			System.out.println("Kac deger toplayacaksiniz? (2 veya 3): ");
			int kacsayi = scanner.nextInt();
			
			if (kacsayi==2) {
				System.out.print("Birinci Sayi: ");
				int a= scanner.nextInt();
				System.out.print("Ikinci Sayi: ");
				int b= scanner.nextInt();
				System.out.print(toplama(a,b));
				
			}
			else if (kacsayi==3) {
				System.out.print("Birinci Sayi: ");
				int a= scanner.nextInt();
				System.out.print("Ikinci Sayi: ");
				int b= scanner.nextInt();
				System.out.print("Ücüncü Sayi: ");
				int c= scanner.nextInt();
				System.out.print(toplama(a,b,c));
				
			}
			else {
				System.out.println("Bunun icin uygun metod bulunmuyor!");
			}}
		else if (islem == 3) {
			System.out.println("Kac deger carpacaksiniz? (2 veya 3): ");
			int kacdeger = scanner.nextInt();
			
			if (kacdeger==2) {
				System.out.print("Birinci sayi: ");
				int a= scanner.nextInt();
				System.out.print("Ikinci sayi: ");
				int b= scanner.nextInt();
				
			System.out.println("Carpim: "+ carpma(a,b));
			}
			else if (kacdeger==3){
				System.out.print("Birinci sayi: ");
				int a=scanner.nextInt();
				System.out.print("Ikinci sayi: ");
				int b=scanner.nextInt();
				System.out.print("Ücüncü sayi: ");
				int c=scanner.nextInt();
				
				System.out.println("Carpim: "+carpma(a,b,c));
				
			}
			else {
				
				System.out.println("Gecersiz islem...");
				
			}			}			
		}			
		}			
		}


	


	


