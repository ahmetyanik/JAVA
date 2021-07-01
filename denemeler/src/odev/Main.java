package odev;

public class Main {

	public static void main(String[] args) {
		
		Müsteriler ahmetCan = new Müsteriler("Ahmet Can",535353,"Berlin",true);
		Müsteriler hasanAli = new Müsteriler("Hasan Ali",989898,"Münih",false);
		Müsteriler veliUcar = new Müsteriler("Veli Ucar",97979,"Giresun",true);
		
		
		
		ahmetCan.setAdSoyad("Ali Can");
		ahmetCan.setTcNo(76789);
		ahmetCan.setAdres("Konya");
		ahmetCan.setEvli(true);
		
		veliUcar.bilgiler();		
		

	}

}
