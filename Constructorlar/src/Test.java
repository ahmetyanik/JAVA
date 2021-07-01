
public class Test {
	
	public static void main(String[]args) {
		
		//Account account1 = new Account ();
		
		/*account1.setHesapNo("12345");
		  account1.setBakiye(1000.0);
		  account1.setIsim("Ahmet");
		  account1.setEmail("example@gmail.com");
		  account1.setTelefonNo("12345"); */
		
		// yukardaki kismi konstruktorlar vasitasiyla kolayca yazacagiz.
		
		//Account account2 =new Account("123123", 1000.0,"Mustafa","m.murat@gmail.com","32323");
		//iste bu bir constructor yapisidir.
		
		/*account2.paraYatir(500);
		account2.paraCekme(700);
		account2.paraCekme(2000);*/
		
		Account account = new Account(); 
		account.getBakiye();
		System.out.println(account.getBakiye());
		
		Account account2 = new Account("Ahmet","gmail","775555757");
		
		System.out.println(account2.getEmail());
		System.out.println(account2.getBakiye());
		
		
		
		
		
	}
	

}
