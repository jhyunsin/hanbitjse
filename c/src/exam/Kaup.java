/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date : 2016. 6. 10.
 * @author : hb2009
 * @file : Kaup.java
 * @story : 카우푸지수 구하는 프로그램
 */
public class Kaup {
	/**
	 * 개발자님 프로그램 제작 의뢰입니다 비만지수를 구하는 것인데요 키와몸무게를 입력하면 당사자가 비만인지 저체중인지 알려주는 프로그램을
	 * 만들어주세요 체중 / 키 2
	 */
	public static void main(String[] args) {
		// --------init------
		Scanner scanner = new Scanner(System.in);
		double kaup = 0, ki = 0, mom = 0;
		String name = "", result = "";
		// ---------op--------------
		System.out.println("이름");
		name = scanner.next();
		System.out.println("키");
		ki = scanner.nextInt();
		System.out.println("몸무게");
		mom = scanner.nextInt();
		kaup = ki / mom / mom;

				
				if (kaup < 18.5) {
			result = "저체중";
		} else if (18.5 < kaup && kaup < 22.9) {
			result = "정상체중";
		} else if (23.0 < kaup && kaup < 24.9) {
			result = "위험체중";
		} else if (25.0 < kaup && kaup < 29.9) {
			result = "비만1단계";
		} else if (40 >kaup && kaup > 30) {
			result = "비만2단계";
		} else if (kaup > 40) {
			result = "비만3단계";
		}

		// ----------out --------------
		System.out.println(name + "은" + result+"이며 비만도는"+kaup+"입니다");

	}
}
