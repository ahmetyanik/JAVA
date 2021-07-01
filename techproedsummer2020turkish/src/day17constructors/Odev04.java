package day17constructors;

public class Odev04 {
	
	int count;
	static int stCount;
	
	public Odev04() {
		count ++;
		stCount ++;
	}
	public int getCount() {
		return count;
	}
	public static int getStCount() {
		return stCount;
	}
	
	public static void main(String[] args) {
		Odev04 cs1 = new Odev04();
		Odev04 cs2 = new Odev04();
		Odev04 cs3 = new Odev04();
		Odev04 cs4 = new Odev04();
		Odev04 cs5 = new Odev04();
		Odev04 cs6 = new Odev04();
		
		cs1.count= 5;
		cs1.count= cs1.count+3;
		
		System.out.println(cs1.count);
		System.out.println(cs2.count);
		
		System.out.println("count is: "+cs6.getCount());
		System.out.println("stCount is: "+cs6.getStCount());
	}

}
