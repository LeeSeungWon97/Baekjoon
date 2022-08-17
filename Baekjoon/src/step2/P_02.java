// 9498번

package step2;

import java.util.Scanner;

public class P_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();
		scan.close();
		
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}

}
