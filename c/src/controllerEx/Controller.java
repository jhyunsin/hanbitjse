/**
 * 
 */
package controllerEx;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 15.
 * @author : hb2009
 * @file : Controller.java
 * @story :
 */
public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			Calc calc = new Calc();
	MaxMin mm = new MaxMin();

		while (true) {
			System.out.println("[메뉴]" + ""
					+ "1 계산기" + ""
					+ "2 카우푸"+""
					+ "3최고최저" + ""
					+ "0 종료");

			switch (s.next()) {

			case "1":
				System.out.println("num1, opcode, num2 입력하세요");
				String a = calc.calc(s.nextInt(), s.next(), s.nextInt());
				System.out.println(a);

				break;
			case "2":
				break;
			case "3":
				System.out.println("학생수?");
				int count = s.nextInt();
				int[] scores = new int[count];
				System.out.println("점수");
				for (int i = 0; i < scores.length; i++) {
					scores[i] = s.nextInt();
				
				}
			System.out.println(mm.maxMin(scores));	
				
				break;
			case "0":

				JOptionPane.showConfirmDialog(null, "Closing OK?");

				return;

			default:
				break;
			}
		}

	
}}
