/**
 * 
 */
package exam;

import java.util.Random;
import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : 신재현
 * @file   : Odd.java
 * @story  : 
  */
public class OddEven {
/**
 * 개발자님, 홀짝 게임 하나 만들어주세요
 * 사용자가 홀인지 짝인지 맞추면
 * win 틀리면 loose가 출력되면 됩니다
 * */
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int num=random.nextInt(10)+1;
		
		System.out.println("개발자만 보는화면");
		System.out.println("랜덤수는"+num);
		
		int userNum = 0;
		String result="loose";
		System.out.println("돈을 거시는데 짝이라고 생각하면 0을 "
				+ "홀이라고 생각하면 1을 입력하세요");
	userNum = scanner.nextInt();
		
	if (userNum==num%2) {
		result = "win";
		
	} 
	System.out.println(result);
	
}
	
	
	
}
