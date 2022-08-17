// 2480번

package step2;

import java.util.Scanner;

public class P_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int dice1 = scan.nextInt();
		int dice2 = scan.nextInt();
		int dice3 = scan.nextInt();

		scan.close();

		if (dice1 == dice2 && dice1 == dice3) {
			System.out.println(10000 + (dice1 * 1000));
		} else if (dice1 == dice2 || dice1 == dice3) {
			System.out.println(1000 + (dice1 * 100));
		} else if (dice2 == dice3) {
			System.out.println(1000 + (dice2 * 100));
		} else {
			int max = 0;
			if(dice1>dice2 && dice1>dice3) {
				max = dice1;
			} else if(dice2>dice1 && dice2>dice3) {
				max = dice2;
			} else {
				max = dice3;
			}
			System.out.println(max * 100);
		}

	}

}
