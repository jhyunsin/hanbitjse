/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date   : 2016. 6. 14.
 * @author : hb2009
 * @file   : ArrBase.java
 * @story  : array(배열)의 기초 cf) num1
  */
public class ArrBase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
// int avg1=0  ----> avg[0]=0
		
		 int[]score = new int[3];
// int score1=0, score2=0, score3=0;
// int score[0]=0, score[1]=0, score[0]=0;

	     String[]name = new String[3];
		
	    System.out.println( "1번학생");
	    score[0]= scanner.nextInt();
	    System.out.println( "1번학생 점수는?" );
	   score[0]=scanner.nextInt();
	    System.out.println( "2번학생");
	           score[1]= scanner.nextInt();
	          System. out.println( "2번학생 점수는?" );
	           score[1]= scanner.nextInt();
	          System. out.println( "3번학생");
	    score[2]= scanner.nextInt();
	    System.out.println( "3번학생 점수는?" );
	    score[2]=scanner.nextInt();
/// for 문 안에 있는것을 밖으로 뺄 수도 있다 int i = 0;
	    for (int i = 0 ;  i <3; i++) {
			
		}
	    
	    
	    
	if (score[0] >score[1] && score[0] >score[2] && score[1] >score[2] ) {
	    System.out.println( "1등 "+ score[0]+ " 점수는 "+score[0] +"점" );
	    System.out.println( "2등 "+ score[1]+ " 점수는 "+score[1] +"점" );
	    System.out.println( "3등 "+ score[2]+ " 점수는 "+score[2] +"점" );
	} else if (score[0] >score[1] && score[0] >score[2] &&score[2] >score[1] ){
	    System.out.println( "1등 "+ score[0]+ " 점수는 "+score[0] +"점" );
	    System.out.println( "2등 "+ score[2]+ " 점수는 "+score[2] +"점" );
	    System.out.println( "3등 "+ score[1]+ " 점수는 "+score[1] +"점" );
	}  else if (score[1] >score[0] && score[1] >score[2] &&score[0] >score[2] ){
	    System.out.println( "1등 "+ score[1]+ " 점수는 "+score[1] +"점" );
	    System.out.println( "2등 "+ score[0]+ " 점수는 "+score[0] +"점" );
	    System.out.println( "3등 "+ score[2]+ " 점수는 "+score[2] +"점" );
	}else if (score[1] >score[0] && score[1] >score[2] &&score[2] >score[0] ){
	    System.out.println( "1등 "+ score[1]+ " 점수는 "+score[1] +"점" );
	    System.out.println( "2등 "+ score[2]+ " 점수는 "+score[2] +"점" );
	    System.out.println( "3등 "+ score[0]+ " 점수는 "+score[0] +"점" );
	}else if (score[2] >score[0] && score[2] >score[1] &&score[0] >score[1] ){
	    System.out.println( "1등 "+ score[2]+ " 점수는 "+score[2] +"점" );
	    System.out.println( "2등 "+ score[0]+ " 점수는 "+score[0] +"점" );
	    System.out.println( "3등 "+ score[1]+ " 점수는 "+score[1] +"점" );
	}else if (score[2] >score[0] && score[2] >score[1] &&score[1] >score[0] ){
	    System.out.println( "1등 "+ score[2]+ " 점수는 "+score[2] +"점" );
	    System.out.println( "2등 "+ score[1]+ " 점수는 "+score[1] +"점" );
	    System.out.println( "3등 "+ score[0]+ " 점수는 "+score[0] +"점" );
	}







		
		
}}
