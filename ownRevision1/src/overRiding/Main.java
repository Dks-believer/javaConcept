package overRiding;

public class Main {

	
	
	public static void main(String [] args) {
		
		SBI s =new SBI();  //1st method
		System.out.println(s.getRateOfInterest());
		
		Bank a = new Axis(); // 2nd mrethod(upcasting)
		System.out.println(a.getRateOfInterest());
	}
}
