/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : hb2009
 * @file   : Taxjava3.java
 * @story  : 
  */
public class Tax3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String name;
	int sal=0, money=0;
	double taxRate = 0.097;
	
	System.out.println("이름");
	name = scanner.next();
	System.out.println("연봉");
	sal = scanner.nextInt();
	money = (int) (sal * taxRate);
	
	System.out.println("연봉 "+sal+"만원을 받으시는 "+name+"님께서 납부할 세금은 "
	+money+"만원입니다");
			
			
		
	
	
	
}
	
	
	
}
