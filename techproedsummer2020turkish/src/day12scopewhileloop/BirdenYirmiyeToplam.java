package day12scopewhileloop;

public class BirdenYirmiyeToplam {

	public static void main(String[] args) {
	
		//1’den 20’ye kadar olan tam sayıların toplamı:
		
		int i=1;
		int toplam = 0;
		
		while(i<=20) {
		
			toplam +=i;			
			i++;
			
		}System.out.println("Sayilarin toplami: "+toplam);
		

	}

}
