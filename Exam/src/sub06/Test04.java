package sub06;

public class Test04 {
	public static void main(String[] args) {
		
		System.out.printf("%7s %10s %5s %6s\n", "10진수", "2진수", "8진수", "16진수");
		
		for (int num = 1; num <= 128; num++)
        {
			System.out.printf("%7s %10s %5s %6s\n", num,
                               					    Integer.toBinaryString(num),
                               					    Integer.toOctalString(num),
                               					    Integer.toHexString(num));
        }
	}
}