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
public class ArrAssign_1 {
	/*
	 * 전교생이 5명인 학생의 이름과
	 *  나이를 입력받고, 이것을 출력하세요
	 **/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = 0, count = 0;
		System.out.println("학생수?");
		count = scanner.nextInt();
		int[] hak = new int[count];
		int[] age = new int[count];
		String[] name = new String[count];
		System.out.println("?명의 이름,나이를 입력하세요");
		for (i = 0; i < age.length; i++) {
			// ------학번
			
			name[i] = scanner.next();
			age[i] = scanner.nextInt();

		}
		System.out.println("=================\n");
		System.out.println("학번| 이름 | 나이\n");
		System.out.println("=================\n");

		for (i = 0; i < count; i++) {
			System.out.printf("%s\t%s\t %d\n ",i+1, name[i], age[i]);
		}

	
}}
