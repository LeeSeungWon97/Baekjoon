// 2292번 (벌집)

package step7;

import java.util.Scanner;

public class P_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		int lastnum = 1;
		int cnt = 1;
		while (true) {
			if(num <= lastnum) {
				break;
			}
			lastnum = lastnum + 6*cnt;
			cnt++;
		}
		System.out.println(cnt);
	}
}
