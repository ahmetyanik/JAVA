package day15methodcreation;

public class AlistirmaMethod02 {

	public static void main(String[] args) {
	
		/*Write a Java method to compute the average of three numbers. Go to the editor
		Test Data:
		Input the first number: 25
		Input the second number: 45
		Input the third number: 65
		Expected Output:

		The average value is 45.0*/
		
		average(12,34,67);
		average(1,2,3);
		

	}

	public static void average(double num1, double num2, double num3) {
		
		double averageNums = (num1+num2+num3)/3;
		System.out.println(averageNums);
		System.out.println("******************");
		
	}
	
	
	
	
}
