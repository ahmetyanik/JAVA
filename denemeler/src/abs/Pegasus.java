package abs;

public class Pegasus extends Ucak {

	@Override
	void kapi() {
		System.out.println("Pegasus ucaklarinda tek kapi bulunmaktadir");
	}

	@Override
	void kanat() {
		
		System.out.println("Pegasus ucaklarinda sabit kanatlar vardir...");
	}

	@Override
	void motor() {

		System.out.println("Pegasus ucaklari tek motorludur...");
	}

}
