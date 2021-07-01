
public class Cokboyutluarrayler {

	public static void main(String[] args) {

		int [] array = {1,2,3,4,5,6};
		int[][] array2 = new int [2][2]; // 2 satiri 2 sütunu olan array (matris)
		
		
		array2[0][0] = 10;
		array2[0][1] = 20;
		array2[1][0] = 30;
		array2[1][1] = 40;
		
		
		//veya su sekilde de yapilabilir:
		
		int [][] array3 = {{10,20},{30,40}};
		
		
		System.out.println(array2[0][1]);
		System.out.println(array3[1][1]);

	}

}
