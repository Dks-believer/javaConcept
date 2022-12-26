package varArgs;

public class Main {

	static void display(String... values){
		
		System.out.println("display method invoked ");
	}
	public static void main(String args[]){
	
		display();//zero argument
	
		display("my","name","is","varargs");//four arguments
		
		display("Deepak");
		
		//display(76); compile error
		
		
		//when we pass any argument it will invoke the desired method ,but it shuld be of 
		//same data type or null
	}
	
}
