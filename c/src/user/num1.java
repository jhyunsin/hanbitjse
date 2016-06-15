/**
 * 
 */
package user;

import java.util.Scanner;

/**
 * @date : 2016. 6. 15.
 * @author : hb2009
 * @file : maxMin.java
 * @story :
 */
public class num1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = 0, min = 100;
		System.out.println("학생수?");
		int count = s.nextInt();
		int[] scores = new int[count];
		System.out.println("점수");
		for (int i = 0; i < count; i++) {
			scores[i] = s.nextInt();
			if (scores[i] > max) {
				max = scores[i];
			} if (scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.println("최고점: " + max + "점/최저점:" + min);

	}
}
