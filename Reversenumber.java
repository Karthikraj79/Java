package New;

public class Reversenumber {
	
	
	public static void rev(int number) {
		
		if(number<10) {
			System.out.println(number);
			return;
			}
		else {
			
			System.out.print(number%10); // 123 % 10    
			
			rev(number/10); // 123/10 
		}
		
		
		
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		rev(123);
		rev(12345);
		rev(101020830);
		rev(111);
		rev(0);
		
		
	}

}
