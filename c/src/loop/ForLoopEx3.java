/**
 * 
 */
package loop;

import java.util.Iterator;

/**
 * @date : 2016. 6. 13.
 * @author : hb2009
 * @file : ForLoopEx.java
 * @story : 1부터 10까지 홀수 급수 단,공차는1
 */
public class ForLoopEx3 {
	public static void main(String[] args) {
		int i = 0, oddSum = 0, evenSum = 0;
		for (i = 0; i <= 10; i++) {
			if (i % 2 == 0) {

				evenSum += i;

			} else if (i % 2 == 1) {
				oddSum += i;

			}

		}
		System.out.printf("홀수합" + oddSum);
		System.out.printf("짝수합" + evenSum);

	}
}
