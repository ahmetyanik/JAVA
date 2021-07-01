
public class Main {

	public static void main(String[] args) {
	
		//IMühendis mühendis1 = new IMühendis();
		
		PcMuhendisi muhendis1 = new PcMuhendisi(false,false);
		
		muhendis1.askerlikDurumuSorgula();
		muhendis1.adliSicilSorgula();
		System.out.println(muhendis1.mezuniyetOrtalamasi(3.07));
		String[]tecrübe = {"Vestel","Havelsan","Türksat"};
		
		muhendis1.isTecrübesi(tecrübe);
		
		System.out.println("______________________________");
		
		MakineMühendisi muhendis2 = new MakineMühendisi(true,false);
		
		String[] tecrube = {};
		String[] referans = {"Mustafa Murat Coskun","Serhat Say"};
		
		muhendis2.adliSicilSorgula();
		muhendis2.askerlikDurumuSorgula();
		System.out.println(muhendis2.mezuniyetOrtalamasi(2.31));
		muhendis2.isTecrübesi(tecrübe);
		muhendis2.referans_getir(referans);

	}

}
