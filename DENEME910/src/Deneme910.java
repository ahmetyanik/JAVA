import java.util.Scanner;

public class Deneme910 {
	 public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 
		 
		 System.out.println("Lütfen Boyunuzu Girin: ");
		 double boy = scanner.nextDouble();	 
		 
		 System.out.println("Lütfen Kilonuzu Girin: ");
		 double kilo= scanner.nextDouble();		 

		 
		 double Beden_Kitle_Endeksi = kilo / (boy * boy);
		 
		 System.out.println("Beden Kitle Indeksiniz: "+ Beden_Kitle_Endeksi);
		 
		 	      

	 
	 if (Beden_Kitle_Endeksi>=30) {
		 System.out.println("OBEZ");
	 }
	 
	 else if(Beden_Kitle_Endeksi>=25){
		 System.out.println("Fazla Kilolu");
	 }
	 
	 else if(Beden_Kitle_Endeksi>=18.5){
		 System.out.println("Normal");
	 }
	 
	 else
		 System.out.println("Zayif"); 
	 
	 {
	 
	 
	 }}}
	 
	 
	 
	 
	 
	 
	 
	


