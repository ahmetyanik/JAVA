package abstractclass1;

public class Kare extends Sekil {

	private int kenar;
	
	public Kare(String isim,int kenar) {
		super(isim);
		this.kenar = kenar;
		
		
	}

	@Override
	public void alan() {
		
		System.out.println(getIsim() + "'nin alani "+(kenar*kenar)+"'dir.");
		
		
	}
	
	public void cevre() {
		
		System.out.println(getIsim()+"'nin cevresi "+4*kenar+" dir.");
	}

}
