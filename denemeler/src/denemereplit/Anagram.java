package denemereplit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	
		
	public static void main(String[] args) {
		
		isAnagram ("samet", "samt");
	}
	
	 public static boolean isAnagram(String word1, String word2) {		
		 
		int sum = 0; 
		 
		 
		for(int i=0; i<word1.length();i++) {
			
			for(int j=0; j<word2.length();j++) {
				
				if(word1.charAt(i)==word2.charAt(j)) {
					
					sum++;
				}
				
				
				
				}
			}
		
		if(sum==word2.length()) {
			System.out.println("true");
			return true;
		}else {
			System.out.println("false");
			return false;
		}
		
		}
	 }
