// 3052번

package step4;

import java.util.Scanner;

public class P_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] mod = new int[10];
		int count = 0;
		boolean compare = false;

		for (int i = 0; i < 10; i++) {
			mod[i] = scan.nextInt() % 42;
		}

		for (int i = 0; i < mod.length; i++) {
			compare = false;
			for (int j = i + 1; j < mod.length; j++) {
				if (mod[i] == mod[j]) {
					compare = true;
					break;
				}
			}
			if (compare == false) {
				count++;
			}
		}

		System.out.println(count);
		scan.close();
	}

}
