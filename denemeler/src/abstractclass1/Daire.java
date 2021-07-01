package abstractclass1;

public class Daire extends Sekil{

	private int yaricap;
	
	public Daire(String isim,int yaricap) {
		super(isim);
		this.yaricap = yaricap;
		
	}

	@Override
	public void alan() {
		
		System.out.println(getIsim()+"'nin alani "+Math.PI*yaricap*yaricap+" cm2'dir.");
		
		
	}

	@Override
	public void cevre() {
		
		System.out.println(getIsim()+"'nin cevresi "+2*Math.PI*yaricap+"'dir.");
		
	}

}
