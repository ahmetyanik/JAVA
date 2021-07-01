package day29polymorphismexception;

public class Polymorphism01 {

	public static void main(String[] args) {
		// polymorphism coklu yapi demektir
		// Overloading ve Overriding ile bir method polymorphism haline getirilir
		// Polimorfizmi Overloading ile yaparsaniz "Compile Time Polimorfizm" denir 
		// diger adi: "Static Polimorfizm"dir
		// Polimorfizmi overriding ile yaparsaniz "Runtime Polimorfizm" denir
		// diger adi: "Dinamik Polimorfizm"dir
		
		
	}
		public void eat() {
			System.out.println("Ye");
		}
		
		//overloading ile polimorfizm
		public void eat(String name) {
			System.out.println(name+"Ye");
		}
		
		class Yeni extends Polymorphism01{
			
			//overriding ile polimorfizm
			public void eat() {
				System.out.println("Lütfen Ye!");
			}
		}

	}


