// 2588번

package step1;

import java.util.Scanner;

public class P_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		scan.close();
		
		int num2Hundred = num2/100;
		int num2Ten = (num2%100)/10;
		int num2One = (num2%10);
		
		System.out.println(num1*num2One);
		System.out.println(num1*num2Ten);
		System.out.println(num1*num2Hundred);
		System.out.println(num1*num2);
		
	}

}
