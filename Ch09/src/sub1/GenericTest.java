package sub1;
/*
 * 날짜 : 022/09/08
 * 이름 : 진윤희
 * 내용 : Generic 제네릭 실습하기
 * 
 * 제네릭(Generic)
 * - 클래스 내부의 속성타입을 동적으로 일반화 시키는 문법
 * - 제네릭 문법으로 클래스를 범용성을 갖도록 활용
 */
public class GenericTest {
	public static void main(String[] args) {
		
		
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("대만", 2500);
		
		FruitBox<Apple> box1 = new FruitBox<>();			//얘는 이제 Apple박스가 됨
		FruitBox<Banana>box2 = new FruitBox<>();
		
		box1.setFruit(apple);
		box2.setFruit(banana);
		
		box1.getFruit().show();
		box2.getFruit().show();
		
		
		
		
	}
}
