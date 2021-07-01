package javapracticeday7;

public class HastaRunner {

	public static void main(String[] args) {
		
		Hasta hasta1 = new Hasta();		

		Case  durum1 = new Case();
		
		durum1.setActualCase("Romatizma");
		durum1.setEmergency("Normal");
		
		
		
		hasta1.setIsim("John");
		hasta1.setSoyIsim("Toprak");
		hasta1.setActualCase(durum1);
		
		System.out.println("Hastanin adi: "+hasta1.getIsim());
		System.out.println("Hastanin soyadi: "+hasta1.getSoyIsim());
		System.out.println("Hastanin aktuel durumu: "+hasta1.getActualCase().getActualCase());
		System.out.println("Hastanin aciliyet durumu: "+ hasta1.getActualCase().getEmergency());
		
		
		
		
	}

}
