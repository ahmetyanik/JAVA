package deneme002;

public class Thy extends Türkiye{
	
	int para = 250;
	String siir = "Siir okur";
	
	
	public void hizmetleriGöster() {
		
		Türkiye obj1 = new Türkiye();
		
		System.out.println(obj1.cay);
		System.out.println(obj1.corba);
		System.out.println(obj1.dans);
		System.out.println(para);
		System.out.println(siir);
		
	}

	public static void main(String[] args) {
		
		Thy obj3 = new Thy();
		
		obj3.hizmetleriGöster();

	}

}
