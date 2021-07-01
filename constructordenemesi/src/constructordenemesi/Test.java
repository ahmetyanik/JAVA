package constructordenemesi;

public class Test {
	
	public static void main(String[]args) {
		
		Pastalar cilekli_pasta = new Pastalar("Cilekli Pasta","Meyveli Pastalar",(2.5),12,(2.5),(1.7));
		Pastalar muzlu_pasta =new Pastalar("Muzlu Pasta","Meyveli Pastalar",(2.9),7,(2.9),(2.3));
		
		
		/*cilekli_pasta.pastaSat(10);
		cilekli_pasta.pastaEkle(25);*/
		/*muzlu_pasta.pastaSat(4);
		muzlu_pasta.pastaEkle(21);*/
		
		/*muzlu_pasta.getPastaTürü();*/
		
		Yemekler lazanya = new Yemekler ("Lazanya","Etli Yemekler",(6),7,(6),(2.7));
		
		/*System.out.println(lazanya.getYemekFiyati());
		lazanya.setYemekFiyati(5);
		System.out.println(lazanya.getYemekFiyati());*/
	
		System.out.println(lazanya.getYemekMiktari());
		
		lazanya.yemekSat(2);
	
	
	}
		

	
	
	

}
