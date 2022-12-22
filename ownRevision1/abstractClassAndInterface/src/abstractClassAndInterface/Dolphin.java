package abstractClassAndInterface;

public class Dolphin implements Animal {
 
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Swmming and jump");
	}
	
	public static void main(String[] args) {
		
		Dolphin d1= new Dolphin();
		d1.move();
		
		Animal a1= new Dolphin();
		a1.move();
	}

	
}
