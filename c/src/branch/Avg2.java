package branch;

import java.util.Scanner;

/**
 * @date : 2016. 6. 8.
 * @author : hb2009
 * @file : Avg.java
 * @story :
 */
public class Avg2 {

	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다 이름과 국 영 수 세과목 점수를 입력받아서 [홍길동 : 총점 ***점, 평균 ***점,
	 * 합격여부(불합격)] 을 출력하는 프로그램을 만들어 주세요 단) 평균은 소수점이하는 절삭합니다 평균점수가 80이상이면 B 70이상이면
	 * C 60이상이면 D 50이상이면 E 50미만이면 F
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = "",hj = "";
		int kor = 0, eng = 0, meth = 0, total = 0, avg = 0;
		System.out.println("이름");
		name = scanner.next();
		System.out.println("국어");
		kor = scanner.nextInt();
		if(kor >= 101|| kor<0){System.out.println("0 ~ 100까지만 입력해주세요"); 
			
		}
		System.out.println("영어");
		if(kor >= 101|| kor<0){System.out.println("0 ~ 100까지만 입력해주세요"); 
		
		}
		eng = scanner.nextInt();
		System.out.println("수학");
		if(kor >= 101|| kor<0){System.out.println("0 ~ 100까지만 입력해주세요"); 
		
		}
		meth = scanner.nextInt();
		if(kor >= 101|| kor<0){System.out.println("0 ~ 100까지만 입력해주세요"); 
		
		}
		total = kor + eng + meth;
		avg = total / 3;

		if (avg >= 90) {
			hj = "A";

		} else if (avg >= 80) {
			hj = "B";

		} else if (avg >= 70) {
			hj = "C";

		} else if (avg >= 60) {
			hj = "D";

		} else if (avg >= 50) {
			hj = "E";

		} else {
			hj = "F";

		}
System.out.println(hj);
	}
}
