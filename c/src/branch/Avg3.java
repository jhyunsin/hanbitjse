package branch;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 8.
 * @author : hb2009
 * @file   : Avg.java
 * @story  : 
  */
public class Avg3 {

	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다 
	 * 이름과 국 영 수 세과목 점수를 입력받아서 
	 * [홍길동 : 총점 ***점, 평균 ***점, 합격여부(불합격)]
	 * 을 출력하는 프로그램을 만들어 주세요 
	 * 단) 평균은 소수점이하는 절삭합니다
	 * 평균점수가 
	 * 80이상이면 B
	 * 70이상이면 C
	 * 60이상이면 D
	 * 50이상이면 E
	 * 50미만이면 F 
	 * 단 switch-case문으로 해결하세요
	 * 	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = "", score = "";
		int kor = 0, eng = 0, meth = 0, total = 0, avg = 0;
				System.out.println("이름");
		name = scanner.next();
		System.out.println("국어");
		kor = scanner.nextInt();
		System.out.println("영어");
		eng = scanner.nextInt();
		System.out.println("수학");
		meth = scanner.nextInt();
			total = kor + eng + meth;
		avg = total / 3;
		
		
		
		switch (avg/10) {
		case 9 : score = "a"; 
				break;
		case 8 : score = "b"; 
		break;
		case 7 : score = "c"; 
		break;
		case 6 : score = "D"; 
		break;
		case 5 : score = "e"; 
		break;
		case 4 : score = "f"; 
		break;
		
		
		default: score = "f";
		return;
			
		}
		
System.out.println(score);

		
		

	}
}

