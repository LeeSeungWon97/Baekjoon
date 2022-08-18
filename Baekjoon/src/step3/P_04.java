// 25304번

package step3;

import java.util.Scanner;

public class P_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int totalPrice = scan.nextInt();
		int product = scan.nextInt();

		for (int i = 0; i < product; i++) {
			int productPrice = scan.nextInt();
			int productNum = scan.nextInt();
			totalPrice -= productPrice * productNum;
		}
		scan.close();
		
		if (totalPrice == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
