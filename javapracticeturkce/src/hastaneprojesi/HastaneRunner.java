package hastaneprojesi;

public class HastaneRunner {
	
	
	private static Hastane hastane = new Hastane();
	
	
	
	
	
	public static void main(String[] args) {
		
		String hastaDurumu = "Diabet";
		String unvan = doktorUnvani(hastaDurumu);
		
		hastane.setDoktor((doktorBul(unvan)));
		System.out.println("Doktor ismi: "+hastane.getDoktor().getIsim());
		System.out.println("Doktor soyisim: "+hastane.getDoktor().getSoyIsim());
		System.out.println("Doktor ünvani: "+hastane.getDoktor().getUnvan());
		
		
	}
	
	public static String doktorUnvani(String aktuelDurum) {
		
		if(aktuelDurum.equals("Allerji")) {
			return hastane.unvanlar[0];
		}else if(aktuelDurum.equals("Bas agrisi")) {
			return hastane.unvanlar[1];
		}else if(aktuelDurum.equals("Diabet")) {
			return hastane.unvanlar[2];
		}else if(aktuelDurum.equals("Soguk alginligi")) {
			return hastane.unvanlar[3];
		}else if(aktuelDurum.equals("Migren")) {
			return hastane.unvanlar[4];
		}else if(aktuelDurum.equals("Kalp Hastaliklari")){
			return hastane.unvanlar[5];
		}
		return "yanlis durum";
		
		
	}
	
	public static Doktor doktorBul(String unvan) {
		
		Doktor doktor = new Doktor();
		
		for(int i=0;i<hastane.unvanlar.length;i++) {
			
			if(unvan.equals(hastane.unvanlar[i])) {
				doktor.setIsim(hastane.doctorIsimleri[i]);
				doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(hastane.unvanlar[i]);
			}
			
		}
		
		
		return doktor;
	}
	

}
