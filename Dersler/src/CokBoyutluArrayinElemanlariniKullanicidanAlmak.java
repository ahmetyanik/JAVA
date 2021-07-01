import java.util.Scanner;

public class CokBoyutluArrayinElemanlariniKullanicidanAlmak {

	public static void main(String[] args) {
		
		
		int [][]array = new int[2][2];  //bu kisimda arrayin kac sütun ve satirdan olusacagi belirleniyor.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen birinci satir birinci sütun elemanini giriniz: "); 
		array[0][0]=scanner.nextInt();
		System.out.println("Lütfen birinci satir ikinci sütun elemanini giriniz: "); 
		array[0][1]=scanner.nextInt();
		System.out.println("Lütfen ikinci satir birinci sütun elemanini giriniz: "); 
		array[1][0]=scanner.nextInt();
		System.out.println("Lütfen ikinci satir ikinci sütun elemanini giriniz: ");
		array[1][1]=scanner.nextInt();
		
		System.out.println(array[1][1]);
		

	}

}
