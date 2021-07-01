package day09switchoperator;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
//		Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın. 
//		Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın. 
//		Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
//		Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir ay adi giriniz: ");
		String month = scanner.nextLine();
		
		if (month.equalsIgnoreCase("Ocak")||month.equalsIgnoreCase("Mart")||
			month.equalsIgnoreCase("Mayis")||month.equalsIgnoreCase("Temmuz")||
			month.equalsIgnoreCase("Agustos")||month.equalsIgnoreCase("Ekim")||month.equalsIgnoreCase("Aralik")) {
			
			month = "31";
		}else if  (month.equalsIgnoreCase("Nisan")||month.equalsIgnoreCase("Haziran")||
				month.equalsIgnoreCase("Eylül")||month.equalsIgnoreCase("Kasim")){
			
			month = "30";
		}else if  (month.equalsIgnoreCase("Subat")){
			
			month ="28"; 
		}
		
		switch (month) {
		
		case "31":
			System.out.println("Bu ay 31 gündür.");
			break;
		case "30":
			System.out.println("Bu ay 30 gündür.");
			break;
		case "28":
			System.out.println("Bu ay Subat ayidir.");
			break;
		default:
			System.out.println("Gecersiz ay ismi!");
		
		}
		scanner.close();

	}

}
