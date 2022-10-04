package lt.lhu.unit05.main;

import java.math.*;

	public class Task06 {

		 public static void main(String args[]) {
		        String a = new String("3999988889999999995555558888999444333333333222229998877666555444888888");
		        String b = new String("56867865876989679765465456412332199");
		        int loop1 = 0;
		        int loop2 = 0;
		        StringBuilder sum = new StringBuilder("");
		        int carry = 0;
		        for (loop1 = a.length() - 1, loop2 = b.length() - 1; loop1 >= 0 || loop2 >= 0; loop1--, loop2--) {
		            int indiv1 = 0;
		            if (loop1 >= 0)
		                indiv1 = Integer.parseInt("" + a.charAt(loop1));
		            int indiv2 = 0;
		            if (loop2 >= 0)
		                indiv2 = Integer.parseInt("" + b.charAt(loop2));
		            int summation = indiv1 + indiv2 + carry;
		            double d = Math.floor(summation / 10);
		            carry = (int) d;
		            int sum2 = summation % 10;
		            sum.append(sum2);
		        }
		        System.out.println(sum.reverse());
		    }
		}