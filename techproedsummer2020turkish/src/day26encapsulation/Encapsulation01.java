package day26encapsulation;

public class Encapsulation01 {
	
	private String kimlikNo = "34212367512";
	private int krediKartNo = 12345678;
	private boolean soguk = true;

	public static void main(String[] args) {
		// Encapsulation data saklama (data-hiding) yöntemidir
		// Encapsulation iki stepte yapilir
		// 1) Data'yi (variable, method) private yapmalisiniz
		// 2) public olan getter() setter() methodlar üretmeliyim
		// getter() datayi sadece okumamiza yarar, getter() methodu degisiklik yapamaz
		// setter() data'yi degistirmemize yarar
		


	}
	//getter() üretmek icin; 1) Access Modifier public olmali
	//						 2) Return Type variable'in return type'i ile ayni olmali
	//						 3) Method ismi "get+variable ismi" seklinde olmali
	
	public String getKimlikNo() {
		return kimlikNo;
		
	}
	public int getKrediKartNo() {
		return krediKartNo;
	}
	//return type boolean ise getter() metodun ismi "is" ile baslar. "get" kullanilmaz.
	
	public boolean isSoguk() {
		return soguk;
	}
	
	
	//setter() üretmek icin; 1) Access modifier public olmali
	//						 2) return type void olmali
	//						 3) method ismi "set+variable ismi" olmali
	//						 4) parametre kullanilmali (%99)
	//						 5) setter() methodlarin ismi boolean'lar icin de "set" ile baslar
	
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo=kimlikNo;		
		
	}
	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo=krediKartNo;
	}
	public void setSoguk(boolean soguk) {
		this.soguk=soguk;
	}
	
	
	
}
