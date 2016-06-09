/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author : hb2009
 * @file : Calc.java
 * @story :
 */
public class Calc3 {
	/*
	 * 두개의 정수를 입력 받아서 opcode 값이 1이면 덧셈 2면 뺼셈 3이면 곱셈 4면 나눗셈(몫) 5면 나머지 구하기 계산기
	 * syso 한번만 쓰기
	 **/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=0, b=0, op=0, sum=0;
				String cal= "";
		System.out.println("두개의정수를 입력하시오");
		a = scanner.nextInt();
				b = scanner.nextInt();
				System.out.println("opcode를 입력하시오 "
						+ "1덧셈 2뺄셈 3곱셈 4나눗셈 5 나머지");
				op = scanner.nextInt();
				switch (op) {
				case 1:sum = 	a + b;
				cal = "+";break;
				case 2:sum = a-b;
				cal = "-";break;
				case 3:sum = a*b;
				cal = "x";break;
				case 4:sum = a/b;
				cal = "/";break;
				case 5:sum = a%b;
				cal = "%";break;
					
				
				

				default:System.out.println("1~5까지만");
				return;
				}
				
				
				
				System.out.println("답은" + sum);
				System.out.println("왜냐면 "+a+" "+cal+" "+b+"= "+ sum);
				
	}
}
