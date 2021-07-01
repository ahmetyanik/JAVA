package okul2;

public class Ögrenci {
	
	 private String adSoyad ;
	 private int sifre;
	 private int tcNo;
	 private String adres;
	 private int matematik;
	 private int türkce;
	 private int tarih;
	
	
	public Ögrenci(String adSoyad, int sifre, int tcNo, String adres, int matematik, int türkce, int tarih){
		this.adSoyad = adSoyad;
		this.sifre = sifre;
		this.tcNo = tcNo;
		this.adres = adres;
		this.matematik = matematik;
		this.türkce = türkce;
		this.tarih = tarih;
		
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

	public void bilgiler() {
		
		System.out.println("___________________________________________");
		System.out.println("100. Yil Ilkögretim Okulu Ögrenci Bilgileri");
		System.out.println();
		System.out.println(adSoyad.toUpperCase());
		System.out.println();
		System.out.println("***NOTLAR***");
		System.out.println("Matematik: "+matematik);
		System.out.println("Türkce: "+ türkce);
		System.out.println("Tarih: "+tarih);
		System.out.println();
		System.out.println("***KISISEL BILGILER***");
		System.out.println("Kimlik Numarasi: "+tcNo);
		System.out.println("Adres: "+adres);
		System.out.println("___________________________________________");
		
		
	}

	public String getAdSoyad() {
		return adSoyad;
	}



	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}



	public int getSifre() {
		return sifre;
	}



	public void setSifre(int sifre) {
		this.sifre = sifre;
	}



	public int getTcNo() {
		return tcNo;
	}



	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}



	public String getAdres() {
		return adres;
	}



	public void setAdres(String adres) {
		this.adres = adres;
	}



	public int getMatematik() {
		return matematik;
	}



	public void setMatematik(int matematik) {
		this.matematik = matematik;
	}



	public int getTürkce() {
		return türkce;
	}



	public void setTürkce(int türkce) {
		this.türkce = türkce;
	}



	public int getTarih() {
		return tarih;
	}



	public void setTarih(int tarih) {
		this.tarih = tarih;
	}

}
