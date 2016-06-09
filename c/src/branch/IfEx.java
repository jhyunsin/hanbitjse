/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author : hb2009
 * @file : IfEx.java
 * @story : branch 구문 예제
 */
public class IfEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정사값 하나입력?");
		int input = 0;
		if (input == 10) {

			System.out.println("입력된 값 " + input + "이 10 보다 ");
		} else {
			System.out.println("입력된 값 " + input + "이 10 보다 큽니다");

		}

	}

}
