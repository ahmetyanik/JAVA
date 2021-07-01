package day16overloading;

public class Araba {
	
	String marka;
	String model;
	String yakit;
	double motor;
	boolean otomatik;
	int yas;
	

	
	Araba(String marka,String model,String yakit,double motor,boolean otomatik,int yas){
		
		this.marka= marka;
		this.model=model;
		this.yakit=yakit;
		this.motor=motor;
		this.otomatik=otomatik;
		this.yas = yas;
		
	}
	
	
	public void bilgileriGöster(){
		
		System.out.println("Marka: "+marka);
		System.out.println("Model: "+model);
		System.out.println("Yakit: "+yakit);
		System.out.println("Motor: "+motor);
		System.out.println("Vites: "+otomatik);
		System.out.println("Yas  : "+yas);
		System.out.println("************************");
	}
	
	
	

}
