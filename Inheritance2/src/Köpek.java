
public class K�pek extends Hayvan {
	
	private int dis_sayisi;
	
	public K�pek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi) {
		
		super (isim,kilo,boy, bacak_sayisi);
		
		this.dis_sayisi = dis_sayisi;
		
		
	}
	
	public void kos(int hiz) {
		
		System.out.println("K�pek kosuyor...");
		
		super.harekete_gec(hiz);
	}
	

	public int getDis_sayisi() {
		return dis_sayisi;
	}

	public void setDis_sayisi(int dis_sayisi) {
		this.dis_sayisi = dis_sayisi;
	}
	

}
