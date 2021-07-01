package rastgele;

import java.util.Scanner;

public class IkibinOnaltiYilininAylarininGünSayisi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen Yili Giriniz: ");
		int year = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Lütfen Ayi Yazi Olarak Giriniz: ");
		String month = scanner.nextLine();
		
		
		
		
		if (year%4==0 && month.equals("Subat")) {
			
			System.out.println(year+" yilinin "+month+" ayi 29 gündür.");
		
		} else if (year%4!=0 && month.equals("Subat")) {
			
			System.out.println(year+" yilinin "+month+" ayi 28 gündür.");
			
		}else if (month.equals("Ocak") || month.equals("Mart") || month.equals("Mayis") || month.equals("Temmuz") || month.equals("Agustos") || month.equals("Ekim") || month.equals("Aralik")) {
			
			System.out.println(year+" yilinin "+month+" ayi 31 gündür.");
		} else if (month.equals("Nisan") || month.equals("Haziran") || month.equals("Agustos") || month.equals("Ekim") || month.equals("Aralik")) {
			
				
			System.out.println(year+" yilinin "+month+" ayi 30 gündür.");
		} 
			
			

	}

	}
