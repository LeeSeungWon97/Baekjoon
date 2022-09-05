// 2908번

package step6;

import java.util.Scanner;

public class P_07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 비교할 숫자 입력
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		// 숫자비교를 위한 배열 선언
		int[] numArr1 = new int[3];
		int[] numArr2 = new int[3];

		numArr1 = digit(num1);
		numArr2 = digit(num2);

		// 값 크기 비교
		int i = 0;
		while (true) {
			if (numArr1[i] > numArr2[i]) {
				aTs(numArr1);
				break;
			} else if (numArr2[i] > numArr1[i]) {
				aTs(numArr2);
				break;
			}
			i++;
		}
	}

	// 숫자를 자릿수로 나누기
	public static int[] digit(int num) {
		int number = num;
		int[] digitnum = new int[3];
		int i = 0;
		while (number != 0) {
			digitnum[i] = number % 10;
			number = number / 10;
			i++;
		}

		return digitnum;
	}
	
	// 배열 값을 String처럼 출력
	public static void aTs(int[] number) {
		int[] num = number;

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}

	}
}
