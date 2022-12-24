package interfaceASSIGNMNT;

public interface Animal {
	
	abstract void makeNoise();
	
	

}

class Dog implements Animal{

	@Override
	public void makeNoise() {
	
		System.out.println("Bark");
	}

}

class Cat implements Animal{

	@Override
	public void makeNoise() {
		
		System.out.println("Meow");
	}

}

 class Main {
	public static void getNoise(Animal animal) {
		animal.makeNoise();
	}
		public static void main(String[] args) {
		Dog d = new Dog();
		d.makeNoise();
		
		
		
		Cat c =new Cat();
		c.makeNoise();	
		}
		
	
	//How to call the static method of main class i.e getNoise();
	
}
