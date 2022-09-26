package test;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/30
 * 이름 : 진윤희
 * 문제1 : 첫째 줄에는 별1개, 둘째 줄에는 별2개, N번째 줄에는 별 N개를 찍는 문제
 * 입력조건 : 첫째 줄에 N(1<=N<=100)이 주어진다.
 * 출력조건 : 첫쨰 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */

public class test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int start = 1; start <= N; start++) {
			for(int end = 1; end <= start; end++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}






