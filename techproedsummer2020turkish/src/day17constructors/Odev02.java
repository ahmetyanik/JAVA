package day17constructors;

public class Odev02 {

	
		int x = 3;
		int y = 5;
	
		Odev02(){
			x+=1;
			System.out.println("-x"+x);
		}
		
		Odev02(int i){
			this();
			this.y = i;
			x +=y;
			System.out.println("-x"+x);
			
		}
		
		Odev02(int i, int i2){
			this(3);
			this.x -= 4;
			System.out.println("-x"+x);
			
		}
		


	public static void main(String[] args) {
		
		Odev02 mc1 = new Odev02(4,3);
			
	}

}
