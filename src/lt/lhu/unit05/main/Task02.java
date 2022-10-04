package lt.lhu.unit05.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		double x1;
        double x2;
        double x3;
        double sum;
        
        x1 = inputDoubleFromConsole("Введите первое значение: ");
        x2 = inputDoubleFromConsole("Введите второе значение: ");
        x3 = inputDoubleFromConsole("Введите третье значение: ");
        
        sum = menszee(x1, x2, x3);
        
        printResult(sum);
	}
    
	public static double inputDoubleFromConsole(String message) {
		double value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}
		value = sc.nextDouble();
		
		return value;
	}

    public static double menszee (double o, double d, double w) {
    	double sum;
    	sum = 0;
    	
    	if((o < d) & (d < w)) {
			sum = o + w;
			return sum;
		}else if ((w < d) & (d < o)) {
			sum = o + w;
			return sum;
		}else if ((d < o) & (o < w)) {
			sum = d + w;
			return sum;
		}else if ((w < o) & (o < d)) {
			sum = d + w;
			return sum;
		}else if ((d < w) & (w < o)) {
			sum = d + o;
			return sum;
		}else if ((o < w) & (w < d)) {
			sum = d + o;
			return sum;
	    }
    	return sum;
    }
    
    public static void printResult(double a) {
    	System.out.println("sum = " + a);
    }

}
