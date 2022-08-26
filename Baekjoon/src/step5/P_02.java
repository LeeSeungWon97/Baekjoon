// 4673번

package step5;

public class P_02 {

	public static void main(String[] args) {

		boolean[] a = new boolean[10001];

		for (int i = 1; i < a.length; i++) {
			int n = d(i);

			if (n < a.length) {
				a[n] = true;
			}
		}

		for (int i = 1; i < a.length; i++) {
			if (a[i] == false) {
				System.out.println(i);
			}
		}

	}

	//n과 n의 각자리 수를 더하는 메소드
	public static int d(int n) { 
		int sum = n;

		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

}
