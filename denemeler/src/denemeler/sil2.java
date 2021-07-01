package denemeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sil2 {
	

	  public static void main(String[] args) {
		
		 String arr []= {"alim","veli","ahmet"}; 
		  
		isFourLetters(arr);
	 
	  }
	  public static String[] isFourLetters(String[] s) {
	  
	    //write your code here
		  
		  List<String> list = new ArrayList<>();
		 
	    
		  for(int i=0; i<s.length;i++) {			  
			
				  
				  if(s[i].length()==4) {
					  
					  list.add(s[i]);
				  
				  
			  }
			  
			  
		  }
		  
		  System.out.println(list);
		  
		  String arr[] = new String[list.size()];
		  
		  for(int i=0; i<list.size();i++) {
			  
			  arr[i]=list.get(i);
			  
		  }
		  
		  System.out.println(Arrays.toString(arr));
		  return arr;
		  
	  }
	  

	
	
	
}
