package superKeyword2;

public class Dog extends Animal {

	void eat(){
		System.out.println("eating bread...");
		}
	
		void bark(){
		System.out.println("barking...");
		}
		
		void work(){
		super.eat();//calls the imediate parent class metjod
		bark();
		}
		
		Dog(){
			System.out.println("dog is created");
		}
		public static void main(String args[]){
			Animal d1=new Animal();//Animal is created
			Dog d = new Dog(); //Animal is created(invoking parent class constructor by default) and dog is created
			d.work();//Animal Should be created two times,but created only one time.why?			         //and eating(calling parent method using super) and barking
//			d.eat();
		}
	
}
