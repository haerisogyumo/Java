package sub4;
/*
 * 날짜 : 20022/08/23
 * 이름 : 진윤희
 * 내용 : Java 메서드 타입 실습하기
 */
public class MethodTypeTest {
	
	public static void main(String[] args) {
		
		double r1 = type1(1.1);
		double r2 = type1(1.2);
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		
		type2(true); /*리턴이 없어서 대입연산자 안나옴*/
		type2(false);
		
		boolean r3 = type3();
		System.out.println("r3 : "+r3);
		
		type4();

	}// main end
	
	
	
	
	
	// type1: 매개변수 O, 리턴값 O
	public static double type1(double x) {
		
		double y = x + 3.14;
		return y;
	}
	
	
	// type2: 매개변수 O, 리턴값 X
	public static void type2(boolean status) {
		
		if(status) {
				System.out.println("참 입니다.");
		}else {
				System.out.println("거짓 입니다.");
		}
	}
	
	
	// type3: 매개변수 X, 리턴값 O
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
	}
	
	
	// type4: 매개변수 X, 리턴값 X
	public static void type4() {
		System.out.println("type result : "+type1(1.2));
	}
	
	
	
	
	
	
}
