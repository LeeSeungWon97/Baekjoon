// 10818번

package step4;

import java.util.Scanner;

public class P_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 정수의 개수 입력
		int N = scan.nextInt();

		// 입력한 정수의 크기의 배열 선언.
		int[] num = new int[N];

		// 배열에 데이터 입력
		for (int i = 0; i < N; i++) {
			num[i] = scan.nextInt();
		}
		
		// 최대값 최소값 변수 선언.
		int max = num[0];
		int min = num[0];

		// 최대값 최소값 검출
		for (int i = 0; i < N; i++) {
			if (max < num[i]) {
				max = num[i];
			}

			if (min > num[i]) {
				min = num[i];
			}
		}
		scan.close();
		System.out.println(min + " " + max);
	}

}