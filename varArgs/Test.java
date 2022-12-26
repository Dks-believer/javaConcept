package varArgs;

public class Test {

	
		static void display(String... values){
			
		System.out.println("display method invoked ");
		
		//accessing the elements from var-args
		
		for(String s:values){
		System.out.println(s);
		}
		}
		public static void main(String args[]){
		display();//zero argument //display methjod invoked
		display("my","name","is","varargs");//four arguments //disply method invokew  + strings are printed
		}
		

}
