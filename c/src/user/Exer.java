/**
 * 
 */
package user;

import java.util.Random;
import java.util.Scanner;

/**
 * @date   : 2016. 6. 13.
 * @author : hb2009
 * @file   : Exer.java
 * @story  : 
  */
public class Exer {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	int num=0, userNum=0;
	String result="";
	num = random.nextInt(10)+1;
	
	System.out.println("개발자만보는화면");
	System.out.println("랜덤수는"+num);
	System.out.println("홀짝을 입력하세요");
userNum = scanner.nextInt();

if (num==userNum%2) {
	result = "Win";
} else {
result = "loose";
	
}

System.out.println(result);
}
}
