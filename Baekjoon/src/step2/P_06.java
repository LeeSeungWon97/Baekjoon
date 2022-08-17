// 2525번

package step2;

import java.util.Scanner;

public class P_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int currentHour = scan.nextInt();
		int currentMin = scan.nextInt();
		int needTime = scan.nextInt();

		scan.close();
		
		int plusHour = needTime / 60;
		int plusMin = needTime % 60;

		int resultHour = currentHour + plusHour;
		int resultMin = currentMin + plusMin;

		if (currentMin + plusMin >= 60) {
			resultHour += 1;
			resultMin -= 60;
		}

		if (resultHour > 23) {
			resultHour -= 24;
		}

		System.out.println(resultHour + " " + resultMin);

	}

}
