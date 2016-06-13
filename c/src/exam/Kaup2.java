/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : hb2009
 * @file : Kaup2.java
 * @story : 카우푸지수 구하는 프로그램
 */
public class Kaup2 {
	/**
	 * 소수점 2자리에서 끊기
	 */
	public static void main(String[] args) {
		// ----------init---------
		Scanner scanner = new Scanner(System.in);
		String name = "", result = "";
		double kaup = 0.0, height = 0.0, weight = 0.0;
		// --------op
		System.out.println("이름?");
		name = scanner.next();
		System.out.println("키?");
		height = scanner.nextDouble();
		System.out.println("몸무게?");
		weight = scanner.nextDouble();

		kaup = weight / (height / 100) / (height / 100);

		if (kaup < 18.5) {
			result = "저체중";
		} else if (18.5 < kaup && kaup < 22.9) {
			result = "정상체중";
		} else if (23.0 < kaup && kaup < 24.9) {
			result = "위험체중";
		} else if (25.0 < kaup && kaup < 29.9) {
			result = "비만1단계";
		} else if (40 > kaup && kaup > 30) {
			result = "비만2단계";
		} else if (kaup > 40) {
			result = "비만3단계";
		}

		double d = Double.parseDouble(String.format("%.2f", kaup));
		/* d 자리에 짤라서 넣는것이 좋다*/

		System.out.println(name + "은 bmi 지수는 " + d + "이고, " + result + "이다");

System.out.printf("%s은 bmi지수는 %.2f이고 %s이다",name,d,result); 		
		
		
	}
}
