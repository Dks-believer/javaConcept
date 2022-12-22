package downCasting;

public class Animal {
	public static void main(String[] args) {
		
		System.out.println("god");
	}


	void eat(){
		System.out.println("eating...");
		}

}

class Dog extends Animal{

	void eat() {
		System.out.println("Dog is Eating bread");
	
}
//specific method of child class
    void bark(){
       System.out.println("barking...");

}
    public static void main(String[] args)
    {
    	Animal parent = new Dog();
    	
    	parent.eat();//overridden method works fine with parent class variable
    	
    	//parent.bark();//for specific method ,it gives compiletime eeror,to overcome we  downcast
    	 
    	Dog d=(Dog)parent;
    	
    	d.bark(); // barking
    	
    	// for classcast exception
    	
//    	Animal parent1 = new Animal();  parent class  variable not pointing to child class variable
//    	Dog d1 = (Dog)parent1;
//    	d1.bark();
    	
    	
    	
    }
}




