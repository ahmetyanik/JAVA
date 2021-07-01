package day17constructors;

public class Constructor02 {

	//buyume() methodu bu class'ta degil Constructor01 classinda o yüzden
	//java kullanmamiza müsade etmez  (durum2)
	
	//Eger baska bir classtaki methodu kullanmak istersek o classtan bir tane
	//obje olusturup o obje sayesinde istedigimiz methodu kullanabiliriz (durum3)
	
	public static void main(String[] args) {
		
//		buyume(33); //durum2 (hata veriyor)
		
		Constructors01 obj1 = new Constructors01(); //durum3
		obj1.buyume(33);//durum3
		obj1.isimDegistir("Kemal Can");//durum3
		System.out.println(obj1.isim); //durum3
		System.out.println(obj1.yas);  //durum3
		
		
		//Bir variable veya method static olarak olusturulmussa, o variable veya
		//metoda object olusturmadan sadece class ismini kullanarak ulasabilirsiniz.(durum4)
		System.out.println(Constructors03.ad);//Ali Can
		System.out.println(Constructors03.kilo); //33
		Constructors03.artirma(45);//46
		Constructors03.degistir("Ayhan Isik");//Ayhan Isik
		
		//buyume methodu static oldugu icin Java object kullanarak buyume() methodunu
		//cagirmamizi istemez ve kodun altini sari renkle cizer örnek durum3
		//cözüm:
		Constructors01.buyume(33); //altini cizmedi
		
	}

}
