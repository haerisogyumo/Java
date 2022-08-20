package step01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/20
 * 이름 : 진윤희
 * 내용 : 1단계 7번 :  A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램
 */

public class _07 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int A=sc.nextInt();
	int B=sc.nextInt();
	
	
	System.out.println(A+B);
	System.out.println(A-B);
	System.out.println(A*B);
	System.out.println(A/B);
	System.out.println(A%B);
	
	
}
}
