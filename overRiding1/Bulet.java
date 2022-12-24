package overRiding1;
class Bike{
	 Integer speed=123;
	
	 void run() {
		System.out.println("Bike is running ...hurhurgur");
	}
	void cc() {
		System.out.println("125cc");
	}
}

public class Bulet extends Bike {
 Integer speed=200;
	
	 void run() {
		System.out.println("Bullet is runing");
	}
	
	void cc() {
		System.out.println("350cc");
	}
	
	void price() {
		System.out.println("High price");
	}
	public static void main(String[] args) {
		
        Bike b0= new Bike();
        b0.run();
        b0.cc();
        System.out.println(b0.speed);
        
		System.out.println("******************");
		
		Bulet b1 = new Bulet();
		b1.run();
		b1.cc();
		System.out.println(b1.speed);
		b1.price();
		
		System.out.println("******************");
		
        System.out.println("****upcasting Starts****");
        
		Bike b2 = new Bulet();  //creating parent object with help of child,need parent data but overridden ultimately gives child data
		b2.run();                //Bullet is runing(overridden parent method gives child metho
		b2.cc();                         // 350cc (overridden parent speed gives child speed
		System.out.println(b2.speed);    //123     (as datamembers can't be overriden ,,so giving parent speed
//		b2.price();    this system is for parent object and there are no price() method in it,,,so givew compile time eror;
		
		
		System.out.println("******************");
		
//		Bulet b21 = new Bike();  //Type mismatch cannot convert child to parent
//		b21.run();
		
		System.out.println("******Downcasting Starts*****");
        //Bike b3 = new Bulet(); 
        Bulet b3 =(Bulet)b2;  //need childs data from parent object refrence
//        b4.run();
//        b4.cc();
        b3.run();
        b3.cc();
        b3.price();
        System.out.println(b3.speed);
        //b4.price();   //specific meethod
        
	}

}
//we get all the same result as creating a object of same class then why we downcasting which is tougher concept...
//i.e what are the advantage of downcasting over object creating