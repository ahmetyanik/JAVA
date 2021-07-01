package day16overloading;

public class AHayvanlar {

		String hayvanAdi;
		String tür;
		String familya;
		
		AHayvanlar(String hayvanAdi, String tür, String familya){
			
			this.hayvanAdi = hayvanAdi;
			this.tür = tür;
			this.familya = familya;					
			
		}

		public void BilgileriGöster() {
			
			System.out.println("Adi: "+hayvanAdi);
			System.out.println("Türü: "+tür);
			System.out.println("Familyasi: "+familya);
			System.out.println("*****************");
			
		}

		AHayvanlar(){
			
		}
		
		
		

}
