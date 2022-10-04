package lt.lhu.unit05.main;

public class Task07 {

	public static void main(String[] args) {
		int x;
		int result = 0;
				
		for(x = 1;x <= 9; ++x) {
			result = x;
			System.out.println("armstrong number > " + x);
		}
		for(x = 10;x <= 99; ++x) {
			result = 0;
		}
		for(x = 100;x <= 999; ++x) {
			result = armstrong(x);
		}
	}
	public static int armstrong(int abc) {
		int number = abc, originalNumber, remainder, result = 0; 
		originalNumber = number; 
		
		while (originalNumber != 0) {
			remainder = originalNumber % 10; 
			result += Math.pow(remainder, 3); 
			originalNumber /= 10; 
		}
			if(result == number) {
				System.out.println("Armstrong number > " + number); 
			}else{
				return result;
			}
			return result;
	}

}
