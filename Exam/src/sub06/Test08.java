package sub06;

public class Test08 {
	public static void main(String[] args) {
		
		
		int count = 0;
		
		for (int i = 2; i <= 100; i++)
		{
			if (isPrime(i)) 
			{
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.printf("\n2~100까지 소수는 모두 %d개 입니다.", count);
	}
	
	public static boolean isPrime(int x) {
		for(int i =  2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

}
