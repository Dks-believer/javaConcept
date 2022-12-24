package defaultINterface;

public interface Interface {

	
		//abstract method
		void method1();
		
		//default method
		default void method2()
		{
		System.out.println("hello");
		}
	}
		//IntrImpl1.java
		class IntrImpl implements Interface{
		public void method1(){
		System.out.println("inside method1 of Interfacermpl");
		}
		
	}
		//Main.java
		class Main{
		public static void main(String[] args){
		IntrImpl i1 = new IntrImpl();		
		i1.method1();
		i1.method2(); //calling default method of interfce with its class impl object
		}
}
