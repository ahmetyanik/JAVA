
public class Test {

	public static void main(String[] args) {

		Araba araba1 = new Araba();
		
		araba1.setModel("Renault");
		
		
		System.out.println("Arabanin modeli "+ araba1.getModel());

		araba1.setKapilar(3);
		
		System.out.println("Arabanin kapi sayisi "+araba1.getKapilar()+" adettir.");

	}

}
