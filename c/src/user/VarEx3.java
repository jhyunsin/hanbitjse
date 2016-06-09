package user;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 신재현
 * @file   : As.java
 * @story  : double 예제
  */
public class VarEx3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("x는 실수");
	double x = scanner.nextDouble();
	System.out.println("y는 정수");
	double y = scanner.nextDouble();
	double z = x +y;
	System.out.println("실수 x + y = "+z);


			
		
}
}
