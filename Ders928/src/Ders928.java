// inheritance metodu : bir class'in baska bir class'tan özelliklerini miras almasidir


public class Ders928 {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Mustafa Murat", "Bilisim", 3000); //employee kisminda tanimlanan sinifa göre bu bilgileri atadik
		employee.showInfos();
		System.out.println("**************Simdi de manager classinda bilgilerini employeeden miras alan manager olusturalim..");
		Manager manager = new Manager("Mustafa Murat Coskun","Bilisim", 4000,10);
		manager.showInfos();
		manager.raiseSalary(100);
		// dikkat 29. ders icerigi burada kayitli------>alt sinif olan managera ekstra bilgi kaydetmek
		
		
		
		
		
		
		

	}

}
