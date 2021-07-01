package day26encapsulation;


//Inheritance01, Inheritance02'nin parent'i olsun
//"extends" den sonraki parent önceki child olur

public class Inheritance02 extends Inheritance01 {

	public static void main(String[] args) {
	
		//Child'in birden fazla parent'i olur mu?
		//Cevap: Olmaz! Java "multiple inheritance"i desteklemez
		//Java "single inheritance"i destekler
		
		//Parent'in birden fazla child'i olur mu?
		//Cevap: Olur. Buna "hiyerarsik inheritance" denir.
		
		//child[a,b]==>parent[c,d,e]==>grandparent[f,g]
		//child nelere sahiptir? a,b,c,d,e,f,g
		//parent nelere sahiptir? c,d,e,f,g
		//grandparent nelere sahiptir? f,g		

	}

}
