package sub3;
/*
 * 날짜 : 20022/08/23
 * 이름 : 진윤희
 * 내용 : Java 메서드 실습하기
 * 
 * 메서드(Method)
 * - 자주 사용하는 코드로직을 모듈화한 구조체
 * - 메서드에 선언한 변수는 지역변수이고 해당 메서드가 끝나면 메모리에서 소멸
 */
public class MethodTest {
	
	/*전역변수, main밖 class부분에 적용된 변수, class의 멤버로 멤버변수라고도 함*/
	int num = 1;
	
	
	public static void main(String[] args) {
		
		
		// 메서드 호출(실행)
		int r1 = f(1);
		int r2 = f(2);		
		int r3 = f(3);
		
		System.out.println("r1 : "+r1 );
		System.out.println("r2 : "+r2 );
		System.out.println("r3 : "+r3 );
		
		
		
		// 메서드 지역변수와 스택
		int t1 = sum(1, 10/*인자값,Argument*/);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : "+r1 );
		System.out.println("t2 : "+r2 );
		
		
		
	}// main end
	
	
	
	
	// 메서드 정의
	public static int f(int x) {		
		int y = 2 * x + 3;		
		return y;		
	}
	
	
	
	// 메서드 정의
	public static int sum(int start, int end/*매개변수, parameter*/) {
		/*sum 매소드에 종속된 변수값을 지역변수라고 한다*/
		int total = 0;
		
		for(int k=start; k<=end; k++) {
			total += k;
		}
		
		return total;
	}
	
	
	
	

}
