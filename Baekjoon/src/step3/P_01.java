/***** 반복문 *****/

// 2739번

package step3;

import java.util.Scanner;

public class P_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		scan.close();
		
		for (int i = 0; i < 9; i++) {
			System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
		}

	}

}