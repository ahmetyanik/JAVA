package day29polymorphismexception;

public class Exception01 {

	public static void main(String[] args) {
		// Exceptions : İstisnai hata
		//Kaç tür Exception var?
		//İki tür Exception var;
		//					1)Compile Time Exception (Checked)
		//					2)Run Time Exception
		
		// Compile Time Exception'a örnek?
		//			1) FileNotFoundException ==> Dosya bulunamadığı durumda ortaya çıkar
		//			2) IOException (InputOutput Exception) Input veya Output yapılırken oluşan problemlerde ortaya çıkar
		//NOT: FileNotFoundException, IOException'in child'idir.
		
		//NOT: Compile Time Exception mutlaka Handle edilmelidir.(halledilmelidir)
		
		
		
		
		// Exception aslında istisna i problem-problem olan istisnalar demek
				//sayi/0 ==> bolme islemi icin istisna bir durum ama problemli istisna
				//temelde 2 tür exception var.
				// arabanın lastiği patladı. ama kenarı çekip tekerleği degistirebilirim.
				//yani üstesinden gelebilirim. bunlara handling exception denir.
				
				
				// araba üstüne bir kaplan saldırsa bagırabilirsin sadece. buna throwing exception
		        //ilan ediyorum. bana kaplan saldırdı. yardım isteme
				
				
			  // compile time exception un diğer adı checked exception da denir.
			 //bazı exceptionlar handler edilmelidr. checked exceptionlar mutlaka handle(tamir) edilmelidir
			
			//ne tip check exceptionlar var.?
		//1-) FileNotFoundException: dosya bulunamadı hatası ne zaman veirlir? dosya bulunamadıgı zaman
		//biri dosyayı silmiş olabilir ben yanlıs yazmıs olabilirm
		//2-) IOException: input out exception. ne zaman verilir?
		//input içeri birşey almak output dışarı bir sey vermek. file bulma koduma dısardan bir sey alak demektir. file almak input faaliyetidir.
		//FileNotFoundException: IOException nun alt kümesidir.
		
		
		//****************Checked exceptionlar nasıl handle edilir?**********
				// iki türlü yapıyoruz:
				// 1*) throws yazmak: javaya: "problem varsa yardım iste demektir."
				// 2-)try-catch blocks. try: dene, catch= yakala demketir.
				// 3-) dene- hata cıkarsa -yakala-yapamazsan-bana mesaj at. readable dır.
				//aradaki fark: try catch önce dener. olmazsa mesaj atar.
				//ama throw da hazır mesajları ekrana atar problem hakkında.
				//try da ayrıntı ve hatanın yerini özetleyen bir mesaj yazabilirz. bu yüzden readable dir.
	}

}
