/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 신재현
 * @file   : Taxjava4.java
 * @story  : 세금계산예제
 *   */
public class Tax4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int sal=0, money=0;
		double taxRate = 0.077;
		
		System.out.println("name");
		name = scanner.nextLine();
		System.out.println("sal");
		sal = scanner.nextInt();
		money = (int) (sal * taxRate);
		System.out.println("연봉을 "+sal+"원 받으시는 "+name+"님께서 "
				+ "납부할 세금은 "+money+"원 입니다");
		
				
				
		
				
	}
	
	
	
}
