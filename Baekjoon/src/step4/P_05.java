// 8958번

package step4;

import java.util.Scanner;

public class P_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 테스트 케이스 개수
		int N = scan.nextInt();
		// 연속적인 O의 개수 카운트
		int count = 0;
		// 점수합
		int sum = 0;
		
		// 퀴즈결과 저장 배열
		String[] answer = new String[N];
		// 퀴즈결과 점수 저장
		int[] score = new int[N];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = scan.next();
			for (int j = 0; j < answer[i].length(); j++) {
				if (answer[i].charAt(j) == 'O') {
					count++;
					sum += count;
				}
				else if(answer[i].charAt(j) == 'X') {
					count = 0;
				}
			}
			score[i] = sum;
			sum = 0;
			count = 0;
		}
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(score[i]);
		}
		
		scan.close();
	}

}
