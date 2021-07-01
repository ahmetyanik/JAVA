package day33Interface;

public interface IcAraba {
	
	int price = 2000;
	
	public void direksiyon();
	
	public void koltuk();
	
	public void klima();
	
	
	//default keywordunu kullanirsak methoda body eklemek zorundayiz
	//aksi takdirde compile time error aliriz
	public default void  doseme() {
		
		System.out.println("Interface'de default keyword ile doseme yaptim");
	}
	
	public default void  isitma() {
		
		System.out.println("Interface'de static keyword ile isitma yaptim");
	}

}
