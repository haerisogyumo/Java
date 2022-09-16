package sub03;


class Vehicle {
	private String name;
	private int price;
	
	public Vehicle() {
		this.name = name;
		this.price = price;
	}
	
	
	public void info() {
		System.out.println("=============");
		System.out.println("차량명 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("-------------");
	}
}


class CarFactory {
	private static Carfactory instance = new Carfactory();
	private CarFactory() {}
	
	
	public  createCar(String name, int price) {
		return new Vehicle(name, price);
	}
}



public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factory = new CarFactory;
		
		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle avante = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}

}
