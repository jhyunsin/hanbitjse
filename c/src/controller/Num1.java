/**
 * 
 */
package controller;

import java.util.Scanner;

/**
 * @date : 2016. 6. 14.
 * @author : hb2009
 * @file : Num1.java
 * @story :
 */
public class Num1 {
	/**
	 * 학생수는 입력 받습니다 학생의 점수만 입력해서 최고점과 최저점만 출력하는 로직을 작성하시오 for문안에 if문
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0, max = 0, min = 0, count = 0;
		int[] score = new int[count];

		System.out.println("학생수를 입력하세요");
		count = scanner.nextInt();
		
		System.out.println("점수를입력하세요");
		score[i] = scanner.nextInt();

		for (i = 0; i < count; i++) {

			System.out.println("최고점" + max + "최저점" + min);

		}

	
}}
