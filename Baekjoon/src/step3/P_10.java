// 10871번

package step3;

import java.util.Scanner;

public class P_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int sizeN = scan.nextInt();
		int X = scan.nextInt();
		int[] N = new int[sizeN];
		
		for(int i = 0; i < sizeN; i++) {
			N[i] = scan.nextInt();
			if(N[i] < X) {
				System.out.print(N[i]);
				System.out.print(" ");
			}
		}
		scan.close();
	}

}
