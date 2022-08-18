// 8393번

package step3;

import java.util.Scanner;

public class P_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		scan.close();
		
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
