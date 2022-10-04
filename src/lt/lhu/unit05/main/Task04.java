package lt.lhu.unit05.main;

public class Task04 {

	public static void main(String[] args) {
			
			int a;
			int b;
			int c;
			int nod3;
			
			a = 45;
			b = 25;
			c = 74;
			
			nod3 = nod((nod(a, b)), c);
			
			System.out.println("NOD = " + nod3);
	}
			
	public static int nod(int n1, int n2) {
		    if (n2 == 0) {
		        return n1;
		    }
		    return nod(n2, n1 % n2);
		}

	}
