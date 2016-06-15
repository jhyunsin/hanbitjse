/**
 * 
 */
package loop;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * @date   : 2016. 6. 9.
 * @author : hb2009
 * @file   : num1.java
 * @story  : 
  */
public class ForLoopNum {
/** 
 * 저희반은 학생수가 3명입니다
 * 학생의 평균 점수는 0~100점사이입니다
 * 3명의 평균점수를 입력하면
 * 1등 홍길동
 * 2등 김유신
 * 3등 김구
 * 이렇게 나오도록 해주세요 동점은 없습니다
 * 단, 학생 이름은 스캐너로 받습니다
 * 1등 김구 96점
 * 2등 김유신 78점
 * 3등 홍길동 49점**/
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int score1 =0, score2 =0, score3 =0;
    String name1, name2, name3;
    
    System.out.println( "1번학생");
    name1= scanner.next();
    System.out.println( "1번학생 점수는?" );
    score1=scanner.nextInt();
    System.out.println( "2번학생");
           name2= scanner.next();
          System. out.println( "2번학생 점수는?" );
           score2= scanner.nextInt();
          System. out.println( "3번학생");
    name3= scanner.next();
    System.out.println( "3번학생 점수는?" );
    score3=scanner.nextInt();
    
if (score1 >score2 && score1 >score3 && score2 >score3 ) {
    System.out.println( "1등 "+ name1+ " 점수는 "+score1 +"점" );
    System.out.println( "2등 "+ name2+ " 점수는 "+score2 +"점" );
    System.out.println( "3등 "+ name3+ " 점수는 "+score3 +"점" );
} else if (score1 >score2 && score1 >score3 &&score3 >score2 ){
    System.out.println( "1등 "+ name1+ " 점수는 "+score1 +"점" );
    System.out.println( "2등 "+ name3+ " 점수는 "+score3 +"점" );
    System.out.println( "3등 "+ name2+ " 점수는 "+score2 +"점" );
}  else if (score2 >score1 && score2 >score3 &&score1 >score3 ){
    System.out.println( "1등 "+ name2+ " 점수는 "+score2 +"점" );
    System.out.println( "2등 "+ name1+ " 점수는 "+score1 +"점" );
    System.out.println( "3등 "+ name3+ " 점수는 "+score3 +"점" );
}else if (score2 >score1 && score2 >score3 &&score3 >score1 ){
    System.out.println( "1등 "+ name2+ " 점수는 "+score2 +"점" );
    System.out.println( "2등 "+ name3+ " 점수는 "+score3 +"점" );
    System.out.println( "3등 "+ name1+ " 점수는 "+score1 +"점" );
}else if (score3 >score1 && score3 >score2 &&score1 >score2 ){
    System.out.println( "1등 "+ name3+ " 점수는 "+score3 +"점" );
    System.out.println( "2등 "+ name1+ " 점수는 "+score1 +"점" );
    System.out.println( "3등 "+ name2+ " 점수는 "+score2 +"점" );
}else if (score3 >score1 && score3 >score2 &&score2 >score1 ){
    System.out.println( "1등 "+ name3+ " 점수는 "+score3 +"점" );
    System.out.println( "2등 "+ name2+ " 점수는 "+score2 +"점" );
    System.out.println( "3등 "+ name1+ " 점수는 "+score1 +"점" );
}




}}
	
	


