package sub01;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/19
 * 이름 : 진윤희
 * 내용 : 자바 입출형 연습문제
 */

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int	 year ;
		int	 birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = sc.nextInt();
				
		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt();//숫자를 입력받는 명령문
		
		System.out.print("이름 입력 : ");
		name = sc.next();

				
		int age = year - birth;
		
		System.out.printf("%s/*포맷문자(문자열)*/님 안녕하세요.\n당신은 올해 만 %d세 입니다.", name, age);
		
		sc.close();
		
		
		
		
		
		
	}

}
