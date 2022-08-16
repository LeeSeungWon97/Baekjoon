// 10869번

package step1;

import java.util.Scanner;

public class P_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numA = scan.nextInt();
		int numB = scan.nextInt();
		
		scan.close();
		
		System.out.println(numA+numB);
		System.out.println(numA-numB);
		System.out.println(numA*numB);
		System.out.println(numA/numB);
		System.out.println(numA%numB);

	}

}
