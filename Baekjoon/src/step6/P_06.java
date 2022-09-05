// 1152번

package step6;

import java.util.Scanner;

public class P_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String sentence = scan.nextLine();
		String[] wordNum = sentence.split(" ");
		int count = 0;
		
		for(int i=0; i< wordNum.length;i++) {
			count++;
			if(wordNum[i].equals("")) {
				count--;
			} 
		}
		System.out.println(count);
	}

}
