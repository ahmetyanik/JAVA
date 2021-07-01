package abstractclass1;

public class Dikdörtgen extends Sekil {

	private int kenar1;
	private int kenar2;
	
	public Dikdörtgen(String isim,int kenar1,int kenar2) {
		super(isim);
		this.kenar1=kenar1;
		this.kenar2=kenar2;
		
	}

	@Override
	public void alan() {
	
		System.out.println(getIsim() + "'nin alani "+kenar1*kenar2);
		
	}

	@Override
	public void cevre() {
		
		
		
	}

}
