// 4344번

package step4;

import java.util.Scanner;

public class P_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testNum = scan.nextInt();

		for (int i = 0; i < testNum; i++) {

			int studentNum = scan.nextInt();
			int[] score = new int[studentNum];
			double sum = 0;
			double average = 0;

			for (int j = 0; j < studentNum; j++) {
				score[j] = scan.nextInt();
				sum += score[j];
			}

			average = sum / studentNum;

			double passNum = 0;
			for (int k = 0; k < studentNum; k++) {
				if (score[k] > average) {
					passNum++;
				}
			}

			double perPass = (double) (passNum * 100) / studentNum;

			System.out.println(String.format("%.3f%%", perPass));
		}
		scan.close();
	}

}
