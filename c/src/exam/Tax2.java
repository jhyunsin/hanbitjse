/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : hb2009
 * @file   : Taxjava2.java
 * @story  : 
  */
public class Tax2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
String x;
int y=0, z=0;
double taxRate = 0.097;

System.out.println("이름");
x = scanner.next();
System.out.println("연봉");
y = scanner.nextInt();
z = (int) (y * taxRate);
System.out.println("연봉을" + y + "받으시는" + x + "님이 납부할 세금은" + z + "입니다");









}
	
	
	
	
}
