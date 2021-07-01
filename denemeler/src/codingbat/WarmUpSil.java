package codingbat;

public class WarmUpSil {

	public static void main(String[] args) {
	
	
	
		
	}
	

	public static boolean noTriples(int[] nums) {
		
		int sabit;
		int count = 0;
		
		for(int i=0; i<nums.length; i++) {
			
			sabit = nums[i];
			
			for(int j= 0; j<=i ; j++) {
				
				if(sabit == nums[j]) {
					
					if(nums[j+1]==sabit && nums[j+2]==sabit)
					
					count ++;
				}
			}
			
			
		}
		
		if(count>=3) {
			return false;
		}return true;
		
		
		  
	}

	
	
}	
	
	

	
	
	
	
	



