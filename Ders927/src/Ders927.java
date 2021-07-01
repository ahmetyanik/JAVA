import java.util.Scanner;

public class Ders927 {
	public static void main(String[] args) {  // asagida iki farkli sekilde string olusturuldu
		String s1 = "Mustafa";
		String s2 = new String("Mustafa");
		
		
		System.out.println(s2.length());   //stringin uzunlugunu bulma
		
		System.out.println("0. indeks: " + s2.charAt(0));  // stringteki bir indeksi cagirmak
		
		System.out.println("5. indeks: " + s2.charAt(5));
		
		System.out.println("Son elemani: " + s2.charAt(s2.length()-1));  //stringin son elemanini cagirmak
		
		System.out.println(s2.startsWith("Mu")); //stringin nasil basladigini sorgular ve true veya false sonuc verir
		
		System.out.println(s2.endsWith("fa")); //stringin nasil bittigini sorgular ve true veya false sonuc verir
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lutfen adinizi ve soyadinizi giriniz");
		String adSoyad = scanner.nextLine();
		System.out.println(adSoyad);
		
		System.out.print("lutfen yasinizi giriniz");
		int yas = scanner.nextInt();
		System.out.println(yas);
		
		/*System.out.println("lutfen adresinizi giriniz.");
		String adres = scanner.nextLine();
		System.out.println(adres);*/
		
		System.out.print("Istanbul`da mi yasiyorsunuz? True/False");
		boolean yasam = scanner.nextBoolean();
		System.out.println(yasam);
		
		System.out.print("baba adinizi giriniz");
		String babaAdi = scanner.nextLine();
		System.out.println(babaAdi);
		
		
	}

}
