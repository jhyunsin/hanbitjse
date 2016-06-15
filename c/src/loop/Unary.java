/**
 * 
 */
package loop;

/**
 * @date : 2016. 6. 13.
 * @author : hb2009
 * @file : Unary.java
 * @story :
 */
public class Unary {
	public static void main(String[] args) {
		int c; // c는 주소값에 메모리를 생성해라
		c = 1; // c라는 메모리공간에 1을 할당하라
		int a = 5, b = 0;
		// k= k+1
		a++;

		// int k;
		System.out.printf("a++ =%d \n", a++);
		System.out.println(++a);
		System.out.printf("++b =%d ", ++b);
		System.out.println(b++);
	}
}
