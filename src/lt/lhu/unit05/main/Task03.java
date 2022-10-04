package lt.lhu.unit05.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

			int t;
			int g;
			int itog;
			
			g = inputIntFromConsole("Enter an integer >");
			t = inputIntFromConsole("Enter an integer >");
			
			g = (int) dlinna(g);
			t = (int) dlinna(t);
			
			printResult("Length of the first number = ", g);
			printResult("Length of the second number = ", t);
			
			itog = naibolszee(g, t);
			
			printResult("The most big number has digits = ", itog);
	}
			
	public static int dlinna(int a) {
		
			int length = (int) (Math.log10(a) + 1);
		
		return length;
	}
	
	public static int naibolszee(int a, int b) {	
			int itog = 0;
			
			if(a > b) {
				return a;
			}else if(b > a) {
				return b;
			}else{
			    printMessege("a = b");
			    return itog;
			}
			
	}
	
	public static void printResult(String massege, int a) {
    	System.out.println(massege + a);
    }
	
	public static void printMessege(String messege) {
		System.out.println(messege);
	}
	
	public static int inputIntFromConsole(String message) {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}
		value = sc.nextInt();
		
		return value;
	}
}
