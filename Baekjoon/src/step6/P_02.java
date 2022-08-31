// 11720번

package step6;

import java.util.Scanner;

public class P_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 입력할 숫자의 자릿 수
		int N = scan.nextInt();

		// 입력할 숫자
		String num = scan.next();

		// 입력한 숫자의 각자릿수 합
		int sum = 0;

		for (int i = 0; i < N; i++) {
			sum += num.charAt(i) - '0'; // ASCII 코드 활용
		}

		System.out.println(sum);

	}

}


