import java.util.Scanner;

public class Deneme1 {
	 public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 
		 
		 System.out.println("L�tfen Boyunuzu Girin: ");
		 double boy = scanner.nextDouble();	 
		 
		 System.out.println("L�tfen Kilonuzu Girin: ");
		 double kilo= scanner.nextDouble();		 

		 
		 double Beden_Kitle_Endeksi = kilo / (boy * boy);
		 
		 System.out.println("Beden Kitle Indeksiniz: "+ Beden_Kitle_Endeksi);
		 
		 	      
	    }
	}


