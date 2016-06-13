/**
 * 
 */
package loop;

/**
 * @date   : 2016. 6. 13.
 * @author : hb2009
 * @file   : ForLoopEx.java
 * @story  : 3의배수를 제외한 
 *           1부터 10까지  수열 
 *           공차는 1, f 사용금지
  */
public class ForLoopEx5_3 {
public static void main(String[] args) {
	int i = 0;
	
	
	for ( i = 1; i <=10; i++) {
	if (i%3 ==0) {
		return;// ---> continue, break , return 구분 용례
	}	         // ---> !을 못써서 continue를 썼다
	System.out.println(i);
		
	}
		System.out.println("for loop 바깥");
	
	
}}

