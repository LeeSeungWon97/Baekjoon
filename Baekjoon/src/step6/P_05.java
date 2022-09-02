// 1157번

package step6;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class P_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 알파벳 배열 생성
		char[] alphabet = new char[26];

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) ('A' + i);
		}

		// 알파벳 일치 카운터 배열 선언
		int[] count = new int[26];

		// 단어 입력
		String word = scan.next().toUpperCase();
		
		/*
		 toUpperCase(): 입력문자를 대문자로
		 toLowerCase(): 입력문자를 소문자로
		 */

		// 단어를 스펠링 단위로 저장.
		char[] spelling = new char[word.length()];

		for (int i = 0; i < spelling.length; i++) {
			spelling[i] = word.charAt(i);
		}

		// 단어 스펠링의 각 알파벳 개수 저장
		for (int i = 0; i < spelling.length; i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (spelling[i] == alphabet[j]) {
					count[j]++;
				}
			}
		}

		// 가장 많이 나온 알파벳 검출
		int max = 0;
		boolean check = false;
		int idx = -1;
		for (int i = 0; i < count.length; i++) {
			if(max < count[i]) {
				max = count[i];
				check = false;
				idx = i;

			} else if(max == count[i]) {
				check = true;

			}
		}

		// 결과 출력
		if(check) {
			System.out.println("?");
		} else {
			System.out.println(alphabet[idx]);
		}
		
	}
}
