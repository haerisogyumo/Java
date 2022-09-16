package sub03;



class king{
	private String name;
	private int year;
	
	public void k1(String name,int year) {
		this.name = name;
		this.year = year;
	}
	
	public void k2(String name) {
		this.name = name;
	}
	
	public void k3(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		System.out.println("name : "+name);
		System.out.println("year : "+year);
		
	}
}



public class Test02 {
	
	public static void main(String[] args) {
		king k1 = new king();
		king k2 = new king();
	
		k1.show();
		k2.show();
		
	}

}
