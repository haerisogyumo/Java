package sub6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test07 {
	public static void main(String[] args) {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0, b = 0, c = 0;
		
		try {
			System.out.print("첫전째 수 : ");
			a = Integer.parseInt(br.readLine());
			
			System.out.print("두번째 수 : ");
			b = Integer.parseInt(br.readLine());
			System.out.println("세번째 수 : " );
			c = Integer.parseInt(br.readLine());
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("가장 큰 수는 %d입니다.", Larger(Larger(a,b),c));
	}
	
	public static int Larger(int a, int b) {
		return (a>=b) ? a : b;
	}

}
