package lt.lhu.unit05.main;

public class Task01 {

	public static void main(String[] args) {
		int a;
		int b;
		int nok;
		int nod;
		
		a = 48;
		b = 216;
		
		nok = a * b / nod(a, b);
		
		System.out.println("NOK (a, b) = " + nok);
	}
		
		public static int nod(int n1, int n2) {
		    int gcd = 1;
		    for (int i = 1; i <= n1 && i <= n2; i++) {
		        if (n1 % i == 0 && n2 % i == 0) {
		            gcd = i;
		        }
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    return gcd;
		}
}
