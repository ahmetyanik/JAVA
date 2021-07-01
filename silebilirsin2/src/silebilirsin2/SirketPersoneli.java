package silebilirsin2;

public class SirketPersoneli extends Calisanlar {
	
	private String sirketAdi;
	
	public SirketPersoneli (String isim, String tcNo, String dogumYeri, String dogumTarihi, String departman, String sirketAdi) {
	
		super(isim,tcNo,dogumYeri,dogumTarihi,departman);
		this.sirketAdi=sirketAdi;
	
	
	
	
	
	
	
	}

	public String getSirketAdi() {
		return sirketAdi;
	}

	public void setSirketAdi(String sirketAdi) {
		this.sirketAdi = sirketAdi;
	}	

	public void bilgileriGöster() {
		
		System.out.println("Calisanin Adi         : "+isim);
		System.out.println("Calisanin TC Numarasi : "+tcNo);
		System.out.println("Calisanin Dogum Yeri  : "+dogumYeri);
		System.out.println("Calisanin Dogum Tarihi: "+dogumTarihi);
		System.out.println("Calisanin Departmani  : "+departman);
		System.out.println("Calisanin Sirketi     : "+sirketAdi);
		
	}
	
	
	
}
