package test;
/*
 * 날짜 : 2022/08/30
 * 이름 : 진윤희
 * 문제3 : 아래 그림과 같이 출력하는 프로그램을 작성하시오.
 */
public class test4 {
	public static void main(String[] args) {


		
		
		for(int i=0 ; i<4 ; i++) {
			for(int j=4-1 ; j>i ; j--) {
				System.out.print("☆");
			}
			for(int j=0 ; j<2*i+1 ; j++) {
				System.out.print("★");
			}
			for(int j=4-1 ; j>i ; j--) {
				System.out.print("☆");
			}
		System.out.print("\n");
		}	
	}	
}
						
				
	



