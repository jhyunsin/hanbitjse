package user;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : 신재현
 * @file   : C.java
 * @story  : 스캐너예제
  */
public class ScannerEx {
public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
	
System.out.println("이름?");
System.out.println("저는" + scanner.next());
System.out.println("나이?");
System.out.println("어느덧" + scanner.next());
}
}
