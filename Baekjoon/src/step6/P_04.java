// 2675번

package step6;

import java.util.Scanner;

public class P_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// testCase 입력
		int testCase = scan.nextInt();

		// 반복횟수 & 반복할 문자열 입력
		for (int i = 0; i < testCase; i++) {
			// 반복횟수 입력
			int repeat = scan.nextInt();

			// 문자열 S 입력 받기
			String string = scan.next();

			// 문자열 S의 스펠링 저장 배열 선언.
			char[] ch = new char[20];

			// 문자열 S의 스펠링을 배열에 저장.
			for (int j = 0; j < string.length(); j++) {
				ch[j] = string.charAt(j);
			}

			// ch배열의 앞 인덱스부터 반복횟수만큼 출력
			for (int j = 0; j < string.length(); j++) {
				for (int k = 0; k < repeat; k++) {
					System.out.print(ch[j]);
				}
				if (j == string.length() - 1) {
					System.out.println();
				}
			}

		}

	}
}
