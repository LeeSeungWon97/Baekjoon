// 1546번

package step4;

import java.util.Scanner;

public class P_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		double[] score = new double[N];
		double max = 0;
		double sum = 0;
		double[] newScore = new double[N];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
			if(max<score[i])
				max = score[i];
		}
		for(int i = 0; i < score.length;i++) {
			newScore[i] = score[i]/max * 100;
			sum += newScore[i];
		}
		
		double avg = sum / newScore.length;
		System.out.println(avg);
		
		scan.close();
	}

}
