// 14681번
package step2;

import java.util.Scanner;

public class P_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();
		
		int quadrant;

		if (x > 0 && y > 0) {
			quadrant = 1;
		} else if (x < 0 && y > 0) {
			quadrant = 2;
		} else if (x < 0 && y < 0) {
			quadrant = 3;
		} else {
			quadrant = 4;
		}
		System.out.println(quadrant);

	}

}
