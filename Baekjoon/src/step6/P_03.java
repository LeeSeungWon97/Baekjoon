// 10809번

package step6;

import java.util.Scanner;

public class P_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 알파벳 배열 생성
		char[] alphabet = new char[26];

		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) ('a' + i);
		}

		// 입력받을 단어
		String word = scan.next();

		// 단어의 스펠링을 저장할 배열 선언
		char[] spell = new char[word.length()];

		// 입력한 단어를 스펠링으로 분리.
		for (int i = 0; i < word.length(); i++) {
			spell[i] = word.charAt(i);
		}

		// 스펠링의 위치를 저장할 배열
		int[] position = new int[alphabet.length];
		
		// 입력 단어의 스펠링 확인 및 인덱스 검출
		for (int i = 0; i < alphabet.length; i++) {
			position[i] = -1;
			for (int j = 0; j < word.length(); j++) {
				if (alphabet[i] == spell[j]) {
					if(position[i] == -1) {
						position[i] = j;						
					}
				} 
			}
		}

		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(position[i]);
			if(i != alphabet.length - 1) {
				System.out.print(" ");
			}
		}

	}

}
