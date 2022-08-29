// 1065번

package step5;

import java.util.Scanner;

public class P_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		// 한수의 개수를 저장할 변수
		int count = 0;
		
		// 1~Num까지 한수의 개수를 구하는 반복문
		for (int i = 1; i <= num; i++) {
			// true: 등차수열O , false: 등차수열X
			if (equival(i) == true) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static boolean equival(int num) {
		// 주어진 숫자의 각자리수를 저장할 배열(1~1000)
		int[] digitNum = new int[4];	// 최대 4자리
		
		// 주어진 숫자의 자리수를 저장한 변수
		int count = 0;

		// 주어진 숫자의 자리수를 구할 반복문
		for (int i = 0; i < digitNum.length; i++) {
			if (num != 0) {
				digitNum[i] = num % 10;
				num = num / 10;
				count++;
			}
		}
		
		// 각 자리수의 차이를 저장할 배열
		int[] sub;

		// 한자리 숫자일 경우
		if (count == 1) {
			sub = new int[1];
			sub[0] = num;
			return true;
		}
		
		// 한자리 숫자가 아닐경우
		else {
			sub = new int[count - 1]; // 각 자리 숫자의 차는 자릿수-1 개
			for (int i = 0; i < count - 1; i++) {
				sub[i] = digitNum[i] - digitNum[i + 1];
			}
		}

		// sub배열의 각 요소들의 중복값의 개수를 저장하는 변수
		int cnt = 0;
		for (int i = 0; i < sub.length - 1; i++) {	// sub.length - 1: 까지 반복해야 마지막값과의 비교로 끝이 남
			if (sub[i] == sub[i + 1]) { // 
				cnt++;
			}
		}

		// sub배열이 모두 같은 값인 경우
		if (cnt == sub.length - 1) {
			return true;
		} else {
			return false;
		}
	}

}
