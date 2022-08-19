package sub3;
/*
 * 날짜 : 2022/08/17
 * 이름 : 진윤희
 * 내용 : Java 반복문 For 실습하기
 */
public class ForTest {
	public static void main(String[] args) {
		
		
		
	//for
		for(/*초기식 ; 조건식 ; 증가식*/ 
		    int i=1 ; i<=5 ; i++ ) {
			
			System.out.println("i : "+i);						
		} System.out.println();
		
		
		
	// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1; k<=10; k++) {
				sum += k;
			}
		System.out.println("11부터 10까지의 합 : "+sum);
		System.out.println();
		
		
	// 1부터 10까지 짝수합
		int tot = 0;		
		for(int k=1; k<=10; k++) {			
			if(k % 2 == 0) {
				tot += k;
			}			
		}
		System.out.println("1부터 10까지의 짝수 합 : "+tot);
		System.out.println();
		
		
	// 중첩 for
		
		for(int a=1; a<=3; a++) {
			System.out.println("a : "+a);
			for(int b=1; b<=5; b++) {
				System.out.println("b = "+b);	
			}		
		}
		System.out.println();
		
		
		
	// 구구단
		for(int x=2; x<=9; x++) {			
			System.out.println(x + "단");
			for(int y=1; y<=9; y++) {				
				int z = x * y;				
				System.out.println(x + " x " + y + " = " + z);				
			}			
		}
		System.out.println();
		
		
		
		
	// 별삼각형
		for(int start = 1; start <= 10; start++) {
			
			for(int end = 1; end <= start; end++) {
				
				System.out.print("☆");
				
			}			
			System.out.print("\n"); //개행(줄바꿈)
		}
		
		
	// 역별삼각형
			for(int start = 10; start >= 1; start--) {			
			for(int end = 1; end <= start; end++) {				
				System.out.print("☆");				
			}			
			System.out.print("\n"); //개행(줄바꿈)
				}		
			}
		}
