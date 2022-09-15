package inheritance;

 class Car {

	int wheels;
	String modelName;

	void show(int wheels, String modelName) {
		this.wheels = wheels;
		this.modelName = modelName;
		System.out.println(" wheel"+wheels);
		System.out.println("name is "+modelName);

	}

	class Bike extends Car {
		String name;

		void display(String name) {
			super.show(12,"asc");
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car b = new Car();
		b.show(12, "abc");
		
		
	}
}
