
public class Test {
	
	public static void main(String[] args) {
		
		//Account account1 = new Account();
		
		Account account2 = new Account("12121",1000.0,"Ahmet","gmail","878878788");
		Account account3 = new Account("868686", 6780.0,"Veli","hotmail","989898989");
		
		account2.paraYatir(500);
		account2.paraCekme(700);
		account2.paraCekme(2000);
		account3.paraCekme(1800);
		account3.paraCekme(4000);
		account3.paraCekme(356);
		account3.paraYatir(1234590);
		account2.setIsim("Ali");
		
		System.out.println("isim: "+account2.getIsim());
		
	
	}}
		
		/*account1.setHesapNo("123456");
		account1.setBakiye(1000.0);
		account1.setIsim("Ahmet Yanik");
		account1.setEmail("gmail.com");
		account1.setTelefonNo("1234");
		
		
		System.out.println("Bakiye: "+ account1.getBakiye());		
		
	}}*/
	
	
	
	
	
	
	


