package sub01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 진윤희
 * 내용 : Java 삼황연산자 연습문제 
 */
public class Test08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=0 ; i<n ; i++) {
			for(int j=n-1 ; j>i; j--) {
				System.out.print(" ");		//1개식 줄어야 함
			}
		
		for(int j=0 ; j<2*i+1  ; j++) {
			System.out.print("*");		//2개식 커져야 함
		}
		
		System.out.println();
		}
	}

}
