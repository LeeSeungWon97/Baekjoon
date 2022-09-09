// 1316번

package step6;

import java.util.Scanner;

public class P_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 단어의 개수 입력
		int N = scan.nextInt();

		// 그룹단어 수 저장
		int cnt = N;

		for (int i = 0; i < N; i++) {
			// 단어입력
			String str = scan.next();
			// 알파벳 체크 배열
			boolean[] checkAlphabet = new boolean[26];
						
			// 단어의 마지막의 단어는 true로 체크.
			checkAlphabet[str.charAt(str.length()-1)-'a'] = true;
			for (int j = 0; j < str.length()-1; j++) {
				// 앞뒤 알파벳이 다르다면
				if (str.charAt(j) != str.charAt(j + 1)) {
					// 그리고 이전에 나온적이 없는 알파벳이라면
					if (checkAlphabet[str.charAt(j) - 'a'] == false) {
						// 알파벳 체크
						checkAlphabet[str.charAt(j) - 'a'] = true;
					} else { // 나온적 있는 알파벳이라면
						cnt--;
						break;
					}
				}
			} 

		}
		System.out.println(cnt);

	}

}
