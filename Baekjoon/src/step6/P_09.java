// 2941번

package step6;

import java.util.Scanner;

public class P_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 입력글자 저장 배열 선언. 최대 100글자
		// 단어는 알파벳 소문자와 '-','='로만 가능.
		char[] word = new char[100];
		word = scan.nextLine().toLowerCase().toCharArray();

		// 입력글자 배열 확인
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
		System.out.println();

		// 크로아티아 알파벳 탐색
		for (int i = 0; i < word.length; i++) {
			switch (word[i]) {
			case 'c':
				if (i < word.length - 1) {
					if (word[i + 1] == '=' || word[i + 1] == '-') {
						word[i + 1] = ' ';
					}
				}
				break;
			case 'l':
			case 'n':
				if(i < word.length - 1) {
					if(word[i + 1] == 'j') {
						word[i + 1] = ' ';
					}
				}
				break;
			case 's':
			case 'z':
				if(i < word.length - 1) {
					if(word[i + 1] == '=') {
						word[i + 1] = ' ';
					}
				}
				break;
			case 'd':
				if(i < word.length - 2) {
					if(word[i+1] == 'z') {
						if(word[i+2] == '=') {
							word[i+1] = ' ';
							word[i+2] = ' ';
						}
					}
				} else if( i< word.length - 1) {
					if(word[i+1] == '-') {
						word[i+1] = ' ';
					}
				}
				break;
			}
		}
		
		// 크로아티아 알파벳으로 변경한 단어
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}
		System.out.println();
		
		// 공백을 제외하여 연결
		String newWord = "";
		for(int i = 0; i < word.length;i++) {
			if(word[i] != ' ') {
				newWord += word[i];
			}
		}
		// 결과 출력
		System.out.println(newWord);
		int count = newWord.length();
		System.out.println(count);
	}
	

}
