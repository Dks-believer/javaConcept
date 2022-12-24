package instanceOfwithDowncasting;
 class Animal {
//	public static void main(String[] args) {
//		System.out.println("God");
//	}
	
	void eat(){
		System.out.println("eating...");
		}
}

 class Dog extends Animal{
	
	void eat() {
		System.out.println("Dog is eating bread");
	}
	
	//specific method of child class
	void bark(){
	System.out.println("barking...");
	
}
	
}
 
 class Main{
	 
	 void doSomething(Animal a){
	 a.eat();
	 
	 if(a instanceof Dog){
	 Dog d = (Dog)a;
	 d.bark();
	 }
	 }
	 
	 public static void main(String args[]){
		 Main main = new Main();
		 main.doSomething(new Animal());//eating...
		 main.doSomething(new Dog()); //Dog is eating ..barking...
		 }

 }
