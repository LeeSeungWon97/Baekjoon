// 3003번

package step1;

import java.util.Scanner;

public class P_10 {

	public static void main(String[] args) {

		int[] chess = { 1, 1, 2, 2, 2, 8 };
		int length = chess.length;

		int[] piece = new int[length];
		int[] result = new int[length];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < length; i++) {
			piece[i] = scan.nextInt();
			result[i] = chess[i] - piece[i];
			System.out.print(result[i] + " ");
		}
		scan.close();
	}
}
