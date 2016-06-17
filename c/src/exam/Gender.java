/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 10.
 * @author : 신재현
 * @file   : Gender.java
 * @story  : 
  */
public class Gender {
/**
 * 주민번호 앞자리와 성별판별번호만 입력합니다
 * 예를 들어 소비자가 800101-1까지만 입력하면
 * 소비자가 자신이 남자인지 여자인지 밝히지 않아도
 * 자동으로 DB에 저장되는 시스템을 개발해주세요*
 * [출력문] 홍길동(남) 아이유(여)*/
	/*1,2 : 국내 1900년대생 남,녀
	3,4 : 국내 2000년대생 남,녀
	5,6 : 외국 1900년대생 남,녀
	7,8 : 외국 2000년대생 남,녀*/

/*String name = "abc";
	char c = name.charAt(2) ;
	System.out.println("name의 0번째 값 " +c);*/
	
	
	public static void main(String[] args) {
//-------------init-----------------
		Scanner scanner = new Scanner(System.in);
String name="", ssn="", gender="";		

///-----------op------
	System.out.println("이름");
name = scanner.next();
	System.out.println("SSN입력");
ssn = scanner.next();
char c = ssn.charAt(7);
		if (c=='0'||c=='9') {
			System.out.println("ssn에는 0,9 없습니다..");
			return;			
		}
		
		switch (c) {
		case '1' :case '3' :case '5' :case '7' :
			gender = "남";
			break;
		case '2' :case '4' :case '6' :case '8' :
			gender = "여";
			break;
		
			
		default:
			
			break;
		}
		
		System.out.println(name +"("+gender+")");
		
}
}
