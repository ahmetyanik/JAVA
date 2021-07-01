package javapracticeday6;

public class AileStaticVariable {

	static int ailePizzasi = 8;
	
	int bireyselPizza = 8;
	
	
	public static void main(String1[] args) {
		
		
		AileStaticVariable cocuk = new AileStaticVariable();
		
		cocuk.ailePizzasi -= 2;
		cocuk.bireyselPizza -=2;
		
		System.out.println(cocuk.bireyselPizza); //6
		System.out.println(cocuk.ailePizzasi);   //6
		
		AileStaticVariable anne = new AileStaticVariable();
		anne.ailePizzasi -=2;
		anne.bireyselPizza -=2;
		
		System.out.println(anne.ailePizzasi);    //4
		System.out.println(anne.bireyselPizza);  //6
		
		AileStaticVariable baba = new AileStaticVariable();
		baba.bireyselPizza -=2;
		baba.ailePizzasi -=2;
		
		System.out.println(baba.ailePizzasi);    //2
		System.out.println(baba.bireyselPizza);  //6
	
		
		
		

	}

}
