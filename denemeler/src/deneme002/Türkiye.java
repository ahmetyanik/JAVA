package deneme002;

public class Türkiye extends UluslararasiHavayollari{
	
	String corba = "Corba var";
	String dans = "Yöresel danslar";

	
	public void hizmetleriGöster() {
		
		Türkiye obj1 = new Türkiye();
		
		System.out.println(obj1.cay);
		System.out.println(obj1.corba);
		System.out.println(obj1.dans);
		
	}
	
	public static void main(String[] args) {
		
		Türkiye obj2 = new Türkiye();
		
		obj2.hizmetleriGöster();
		
	}

}
