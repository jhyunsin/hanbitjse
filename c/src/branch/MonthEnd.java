/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 9.
 * @author : hb2009
 * @file : MonthEnd.java
 * @story : 달력어플
 */
public class MonthEnd {
	/**
	 * 월을 입력하면 말일이 며칠인지 알려주는 프로그램 단,2월은 29일로 한정함 1~12를 벗어난 숫자를 입력하면 잘못된 입력값입니다
	 * 라고 뜬다
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int wol = 0,end = 0;

		System.out.println("몇월?");
		wol = scanner.nextInt();

		switch (wol) {
		case 1:
			end = 31;
			break;
		case 2:
			end = 29;
			break;
		case 3:
			end = 31;
			break;
		case 4:
			end = 30;
			break;
		case 5:
			end = 31;
			break;
		case 6:
			end = 30;
			break;
		case 7:
			end = 31;
			break;
		case 8:
			end = 31;
			break;
		case 9:
			end = 30;
			break;
		case 10:
			end = 31;
			break;
		case 11:
			end = 30;
			break;
		case 12:
			end = 31;
			break;

		default:
			System.out.println("1~12월까지만");
			return;
		}

		System.out.println(wol + "월의 마지막날은" + end + "일입니다");

	}

}
