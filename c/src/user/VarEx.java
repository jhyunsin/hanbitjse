package user;

import java.util.Scanner;

public class VarEx {
/**
 * @param args
 */
public static void main(String[] args) {
	/*
	 * 원시변수의 종류 : 총 8종류 4가지로 정리됨
	 * int, double, char, boolean
	 * */
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("정수 x :[  ]");
	int x = scanner.nextInt();
	System.out.println("정수 y :[  ]");
	int y = scanner.nextInt();
	int z = x + y;
	System.out.println("x+y =" + z);
	
	
	
	
}
}
