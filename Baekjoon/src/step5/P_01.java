/* 함수 */

// 15596번

package step5;

public class P_01 {

	long sum(int[] a) {
		long sum = 0;
		
		for(int i =0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}

}
