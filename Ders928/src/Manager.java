
public class Manager extends Employee { // extends metodu ile employee classindan bilgileri miras aldi

	private int sorumlu_oldugu_calisan;//29.ders olarak manager alt sinifina ekstra bilgi eklemek
	public Manager(String name, String department, int salary,int sorumlu_oldugu_calisan) {
		
		super(name,department,salary); // super anahtar kelimesi ile employee classini kullandik
		this.sorumlu_oldugu_calisan = sorumlu_oldugu_calisan; // burada ekstra bilgi eklendi
				
				
				
	} 

	public void raiseSalary(int amount) {
		System.out.println("Calisanlara "+ amount+" tl zam yapildi... ");
	}


	}


