/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : hb2009
 * @file   : WhileLoopebase.java
 * @story  : 
  */
public class WhileLoopeBase {
public static void main(String[] args) {
// 컨트롤러 서버
	Scanner scanner =new Scanner(System.in);
	
	
while (true) {
System.out.println("메뉴를 선택하세요");
System.out.println("1출력 2종료");
switch (scanner.nextInt()) {
case 1:
	for (int i = 0; i < 10; i++) {
		System.out.printf("%s",(i+1));
	}
	break;

case 2: 
	System.out.println("종료합니다");
return;

default:
	System.out.println("1~2에서 선택하세요");
	break;
	
}
System.out.println();

}





}}
