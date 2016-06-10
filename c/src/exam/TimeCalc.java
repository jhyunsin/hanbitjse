/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : 신재현
 * @file : TimeCalc.java
 * @story : 초를 가지고 시간 분 초로 환산하기
 */
public class TimeCalc {
	/**
	 * 초를 시간,분,초로 나누어서 표현하기 Ex) 50000초를 25시간 32분 15초 이렇게 보이게
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int hour = 0, min = 0, sec = 0;
		
		System.out.println("초입력");
		sec = scanner.nextInt();
		
		hour=sec/60/60;
		min=(sec/60%60);
		sec= sec%60;
		
		
		System.out.println(hour + "시간 " + min + "분 " + sec + "초");

	}

}
