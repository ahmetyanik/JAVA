
public class ArraylerVeForEachDöngüsü {

	public static void main(String[] args) {
		// FOR EACH DÖNGÜSÜ ARRAYLERLE BIRLIKTE ETKLI BIR SEKILDE KULLANILMAKTADIR
		
		String[]array = {"Elma","Armut","Kiraz"};
		int[]array2 = {1,2,3,4,5,6};
		
		for(String a: array) {			//for each döngüsü bu kadardir. ve her bir elemani bastirir
			System.out.println(a);
			
			/*cikti:
				Elma
				Armut
				Kiraz*/
		
		}
		for (int b: array2) {
			System.out.println(b);
			
			/*cikti:
				1
				2
				3
				4
				5
				6	*/		
			
		}	}}
