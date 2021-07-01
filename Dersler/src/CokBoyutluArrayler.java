
public class CokBoyutluArrayler {

	public static void main(String[] args) {
		
		//TEK BOYUTLU ARRAY TANIMLAMA
		
		int []a= {1,2,3,4,5,6};
		
		//COK BOYUTLU ARRAY TANIMLAMA
		
		int[][]b= new int[2][2];  //2 satiri ve 2 sütunu olan bir cok boyutlu array tanimladik
		
								// simdi tanimladigimiz arraye degerler atayalim
		
		b[0][0]=10;				// 1. YOL
		b[0][1]=20;
		b[1][0]=30;
		b[1][1]=40;
		
		//COK BOYUTLU ARRAY'E DEGER ATAMAK IKINCI YOL
		int[][]c= {{10,20},{30,40}}; //2. YOL
		
		//ARRAY'IN ELEMANINI BASTIRMAK
		
		System.out.println(c[0][1]);
		System.out.println(c[1][1]);

	}

}
