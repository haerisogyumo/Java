package test;
/*
 * 날짜 : 2022/08/30
 * 이름 : 진윤희
 * 문제3 : 아래 그림과 같이 출력하는 프로그램을 작성하시오.
 */
public class test3 {
	public static void main(String[] args) {

		int count = 5;
		for(int start = 0; start<count; start++) {
			for(int j = 1; j<count-start; j++) {
				System.out.print("☆");
			}
			for(int end=0; end<start+1; end++) {
				System.out.print("★");	
			}
			System.out.print("\n");
		} 
		System.out.print("\n");
	}
}
	



