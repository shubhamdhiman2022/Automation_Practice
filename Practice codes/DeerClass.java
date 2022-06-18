package Abstraction;

public class DeerClass extends AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeerClass oo=new DeerClass();
		oo.perdet();
		oo.eat();
		AnimalDemo oo=new AnimalDemo();
	}

	
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Deer eats Non Veg");
		
	}

	void perdet() {
		System.out.println("Personal Det");
		drink();
		a=100;
		System.out.println(a);
	}

}
