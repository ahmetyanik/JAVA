
public class Y�netici extends Calisan {
	
	private int sorumlu_kisi;
	
	public Y�netici (String isim, int maas, String departman, int sorumlu_kisi) {
		
		super(isim,maas,departman);	
		this.sorumlu_kisi = sorumlu_kisi;
		
	}
	
	public void zam_yap(int zam_miktari) {
		
		System.out.println("Calisanlara "+zam_miktari+" TL zam yapildi.");
	
	}

	public void bilgilerig�ster() {
		
		super.bilgileri_g�ster();
		System.out.println("Sorumlu Kisi Sayisi"+ this.sorumlu_kisi);
		
		/*System.out.println("Isim:  " + getIsim());
		System.out.println("Maas: " + getMaas());
		System.out.println("Departman: "+ getDepartman());		
		*/
	}

}


