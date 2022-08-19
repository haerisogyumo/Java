package sub01;
/*
 * 날짜 : 2022/08/19
 * 이름 : 진윤희
 * 내용 : Java 삼황연산자 연습문제 
 */
public class Test07 {
	public static void main(String[] args) {
		
		int total = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			
			if(k % 2 == 0 || total % 3 == 0) {
				total += k;
			}
			
		}
		
		System.out.println("1 ~ 10까지 2와 3배수의 정수의 합 : "+total);
		
	}

}
