package sub3;

public class Car {

	
	// 속성
	private String name;
	private String color;
	private int speed;
	public static int count; //따로 관리가 됨
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}
	
	
	
	// 기능
	public void speedUp(int speed) {
		this.speed =+ speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색 : "+color);
		System.out.println("현재속도 : "+speed);	
		System.out.println("차량번호 : "+count);
	
		
		
	// 싱글톤(Singleton) 실습 -(오직 하나의 인스턴스만 만드는 것)
	Calc cal = Calc.getInstance();
	
	int r1 = cal.plus(1,2);
	int r2 = cal.minus(1,2);
	System.out.println("r1 : "+r1);
	System.out.println("r2 : "+r2);

		
	
		
		
		
		
	}
}
