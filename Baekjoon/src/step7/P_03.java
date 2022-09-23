// 1193 - 분수찾기

package step7;

import java.util.Scanner;

public class P_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int selectNum = scan.nextInt();

		boolean run = true;

		// 초기값 설정
		int cntFraction = 1; // 분모+분자 값이 동일한 분수의 개수
		int count = 1; // 분수 순서
		int denominator = 0; // 분모 값
		int numerator = 0; // 분자 값

		while (run) {
			// 분모와 분자의 합
			int sumNumber = cntFraction + 1;

			// 분수의 개수가 홀수인 경우
			if (cntFraction % 2 != 0) {
				for (int i = 1; i < cntFraction + 1; i++) {
					// 입력한 숫자 순서의 분수인 경우
					if (count == selectNum) {
						denominator = i;
						numerator = sumNumber - i;
						run = false;
						break;
					} else {
						count++;
					}
				}
			} else { // 분수의 개수가 짝수인 경우
				for (int i = cntFraction; i > 0; i--) {
					if (count == selectNum) {
						denominator = i;
						numerator = sumNumber - i;
						run = false;
						break;
					} else {
						count++;
					}
				}
			}

			cntFraction++;

		}
		System.out.println(numerator + "/" + denominator);

	}

}
