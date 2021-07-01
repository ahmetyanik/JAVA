
public class Main {

	public static void main(String[] args) {

		Araba araba = new Araba("Ford", "Fiesta", "1.6", "2015");
		Araba araba2 = new Araba("Renault", "Clio","1.4","2011");

		
		
		araba2.setMotor("1.6");
		araba2.bilgileriGöster();
		araba.setMotor("1.6");
	}

}
