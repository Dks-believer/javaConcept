package polymorphism;

public class Bike {

	Integer speed=60;
	String name;
	 static String relation="love";
	
	public void jyoti(String name, Integer speed) {
		
		System.out.println("Jyoti's Bike--->"+name+"  "+speed);
	}
	
	public void Deepak() {
		System.out.println("Deepak's Bike--->"+name+" "+speed);
	}
	
	
	public static void main(String[] args) {
		
	Bike b1 =new Bike();
	b1.speed=80;
	b1.name="Honda";
	System.out.println(b1.speed+" "+b1.name);
	
	Bike b2 =new Bike();
	System.out.println(b2.speed+b2.name);
	
	
	System.out.println(120+"Noertqu");
	b1.Deepak();
	
	b1.jyoti("Passion", 40); //parametrized method,calling non static method from static area with the help of taking b1 object refrence
	

	Bike b3 = new Bike();
	b3.name="Bullet";
	b3.speed=120;
	b3.Deepak();
	
	System.out.println(relation);//accessing static method directly inside main kethod by 2 ways
	System.out.println(Bike.relation);
	
	
	}


   
}
