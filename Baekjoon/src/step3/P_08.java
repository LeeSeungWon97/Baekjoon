// 3428번

package step3;

import java.util.Scanner;

public class P_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = "*";

		int n = scan.nextInt();
		scan.close();

		for (int i = 0; i < n; i++) {
			System.out.println(str.repeat(i + 1));
			// .repeat(n): String 문자열을 파라미터의 주어준 값(n)만큼 반복한 결과를 리턴해주는 method.
		}

	}

}
