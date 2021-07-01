
public class Hesap {
	
	private String isim;
	private int hesapNo;
	private int bakiye;
	private String email;
	private String telefonNo;
	
	
	//public Hesap constructor'i olusturalim:
	public Hesap (String isim, int hesapNo, int bakiye, String email, String telefonNo) { 
	
	
		this.isim = isim;
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.email = email;
		this.telefonNo = telefonNo;				

	}

	//constructor'i farkli sekilde tanimlamak
	public Hesap (String isim, int hesapNo,int bakiye) { 
		
		
		this.isim = isim;
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.email = "Bilgi Yok";
		this.telefonNo = "Bilgi Yok";	
	}
	

	public void para_yatir(double miktar) {
		
		this.bakiye += miktar;
		System.out.println("Yeni bakiye: "+ bakiye);
		
	}

	public void para_cek(double miktar) {
		
		
		if (bakiye ==0) {
			System.out.println("Hesabinizda para bulunmamaktadir.");
			
		}
		
		else {
			
			this.bakiye -= miktar;
				
			}
		
		System.out.println("Yeni bakiye: "+ bakiye);
		
	}
	public void bilgileri_göster() {
		
		System.out.println(isim+" kisisinin bilgileri:");
		System.out.println("Hesap numarasi: "+hesapNo);
		System.out.println("Bakiyesi: "+bakiye);
		System.out.println("E-mail adresi: "+email);
		System.out.println("Telefon numarasi: "+telefonNo);
	
	}
	
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(int hesapNo) {		
		this.hesapNo = hesapNo;
	}
	public int getBakiye() {
		return bakiye;
				
	}
	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
		
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
	
	
	
	
	
	
	

}
