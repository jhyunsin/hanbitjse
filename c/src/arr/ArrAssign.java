/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date : 2016. 6. 14.
 * @author : hb2009
 * @file : ArrAssign.java
 * @story :
 */
public class ArrAssign {
	/*
	 * 전교생이 5명인 학생의 이름과 나이를 입력받고, 이것을 출력하세요
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] name = new String[5];
		int[] age = new int[5];
		int i = 0;
		
		for (i = 0; i < 5; i++) {
			System.out.println("이름 입력");
			name[i] = scanner.next();
			System.out.println("나이 입력");
			age[i] = scanner.nextInt();
			
		}
		for (i=0; i < 5; i++) {
			System.out.printf("%s %d ", name[i], age[i]);
		}
	}
}
