// 1110번

package step3;

import java.util.Scanner;

public class P_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 숫자 입력
		int N = scan.nextInt();
		scan.close();
		
		// 입력 숫자 저장 및 카운트변수 선언.
		int answer = N;
		int count = 0;

		while (true) {
			// 새로운 수의 10의 자리 : 주어진 수의 1의자리 숫자
			int ten = (N % 10) * 10;

			// 새로운 수의 1의 자리: 주어진 수의 각 자리 숫자의 합의 1의 자리
			int one = ((N / 10) + (N % 10)) % 10;

			// 새로운 수 생성
			N = ten + one;
			count++;

			// 새로운 수가 처음 입력값과 같은 경우 종료
			if (N == answer) {
				System.out.println(count);
				break;
			}
		}

	}

}
