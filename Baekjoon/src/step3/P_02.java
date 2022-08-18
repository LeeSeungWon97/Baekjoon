// 10950번

package step3;

import java.util.Scanner;

public class P_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();

		for (int i = 0; i < testCase; i++) {
			int numA = scan.nextInt();
			int numB = scan.nextInt();
			System.out.println(numA + numB);
		}
		
		scan.close();

	}

}
