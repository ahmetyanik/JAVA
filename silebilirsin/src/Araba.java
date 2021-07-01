
public class Araba {
	
	private String marka;
	private String model;
	private String motor;
	private String yil;
	
	public Araba(String marka,String model, String motor, String yil) {
		
		this.marka = marka;
		this.model = model;
		this.motor = motor;
		this.yil= yil;		
		
	}
	
	public void bilgileriGöster() {
		
		System.out.println(marka);
		System.out.println(model);
		System.out.println(motor);
		System.out.println(yil);
	}
	
	public String getMarka() {
		System.out.println("Arabanizin markasi: "+marka);
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		System.out.println("Arabanizin modeli: "+model);
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		
		if (motor== "1.6" || motor == "1.4" || motor =="1.2") {
			this.motor = motor;
			
			System.out.println("Basariyla kaydedildi...");
			
			
		}
		else {
			
			System.out.println("Lütfen gecerli bir motor hacmi giriniz...");
		}
		
		
		
	}
	public String getYil() {
		return yil;
	}
	public void setYil(String yil) {
		this.yil = yil;
	}
	


}
