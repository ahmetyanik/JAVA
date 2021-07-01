package denemeler;

import java.util.Arrays;
import java.util.Scanner;

public class Sil03 {

	public static void main(String[] args) {

	
	Scanner scanner = new Scanner(System.in);
	System.out.print("What is your gender?: ");
	String gender = scanner.nextLine();
	
	System.out.print("How old are you?: ");
	int age= scanner.nextInt();
	
	

	
	if(age>65 && gender.equals("male")) {
		
		System.out.println("Hey man you retired!");
		
	}else {
		
		System.out.println("No need to work");
	}
	
	
	
	
	
	
	
			}
		}