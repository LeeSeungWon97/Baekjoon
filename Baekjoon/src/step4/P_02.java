// 3052번

package step4;

import java.util.Scanner;

public class P_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] num = new int[9];

		int count = 0;

		for (int i = 0; i < 9; i++) {
			num[i] = scan.nextInt();
		}

		int max = num[0];

		for (int i = 0; i < 9; i++) {
			if (max < num[i]) {
				max = num[i];
				count = i;
			}
		}

		System.out.println(max);
		System.out.println(count + 1);
		
		scan.close();
	}

}
