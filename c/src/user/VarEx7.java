package user;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 신재현
 * @file   : Vard.java
 * @story  : double 예제
  */
public class VarEx7 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int x=0,y=0,z=0;
			System.out.println("x는");
	x = scanner.nextInt();
			System.out.println("y는");
	y = scanner.nextInt();
			z = x+y;
			System.out.println("x+y="+z);
}
	
	
}
