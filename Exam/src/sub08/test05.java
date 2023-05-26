package sub08;

@FunctionalInterface
interface NumericLamba {
	boolean test (int n);
}


public class test05 {
	public static void main(String[] args) {
		
		NumericLamba isEven = int(0);
		
		if(isEven.test(2)) {
			System.out.println("2는 짝수");
		}
		
		if(!isEven.test(3)) {
			System.out.println("3은 짝수 아님");
		}
		
		NumericLamba isNonNeg =		;
		
		if(isNonNeg.test(1)) {
			System.out.println("1은 양수");
		}
		
		if(!isNonNeg.test(-1)) {
			System.out.println("-은 음수");
		}
	}
}
