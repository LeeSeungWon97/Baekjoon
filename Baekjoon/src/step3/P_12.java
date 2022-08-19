// 10951번

package step3;

import java.util.Scanner;

public class P_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		// hasNext(), hasNextInt() : 입력받는 값이 있는지 확인하는 메소드
		while (scan.hasNextInt()) {
			int A = scan.nextInt();
			int B = scan.nextInt();

			System.out.println(A + B);
		}
		scan.close();
	}

}
