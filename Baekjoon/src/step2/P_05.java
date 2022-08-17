// 2884번

package step2;

import java.util.Scanner;

public class P_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int hour = scan.nextInt();
		int min = scan.nextInt();

		scan.close();

		if (min >= 45) {
			min -= 45;
		} else {
			min += 15;
			if (hour > 0) {
				hour--;
			} else {
				hour = 23;
			}
		}

		System.out.println(hour + " " + min);
	}

}
