/**
 * 
 */
package loop;

/**
 * @date : 2016. 6. 13.
 * @author : hb2009
 * @file : ForLoopEx.java
 * @story : 3의배수를 제외한 1부터 10까지 급수
 */
public class ForLoopEx4 {
	public static void main(String[] args) {
		int i = 0, sum = 0;

		for (i = 1; i <= 10; i++) {

			if (i % 3 != 0) {
				sum += i;

			}

		}
		System.out.print("\t" + sum);

	}
}
