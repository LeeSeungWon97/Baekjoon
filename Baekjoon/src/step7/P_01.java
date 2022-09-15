/* Step7 - 기본 수학1 */
// 1712번 - 손익분기점

package step7;

import java.util.Scanner;

public class P_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// fixCost - 고정비용, varCost - 가변비용, sellPrice - 판매가격
		int fixCost = scan.nextInt();
		int varCost = scan.nextInt();
		int sellPrice = scan.nextInt();
		int breakPoint = 0;
		
		if(sellPrice <= varCost) {
			breakPoint = -1;
		} else {
			breakPoint = fixCost / (sellPrice - varCost) + 1;
		}
		
		System.out.println(breakPoint);
	}

}
