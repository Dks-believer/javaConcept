package overRiding1;
class Bike{
	
	void run() {
		System.out.println("Bike is running ...hurhurgur");
	}
}
public class Bulet extends Bike {

//	void run() {
//		System.out.println("Bullet is runing");
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bulet b1 = new Bulet();
		b1.run();
		
		Bike b2 = new Bulet();
		b2.run();
		
	}

}
