// 2439번

package step3;

import java.util.Scanner;

public class P_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = "*";

		int n = scan.nextInt();
		scan.close();

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println(str.repeat(i + 1));
		}

	}

}
