package oneClassImpltwoInterface;

public interface Printable2 {

	void print();
	}
	//Showable.java
	interface Showable extends Printable2{
	void show();
	}
	//Main.java
	class Run implements Showable{
	public void print(){
	System.out.println("Hello");
	}
	public void show(){
	System.out.println("Welcome");
	}
	public static void main(String args[]){
	Run obj = new Run();
	obj.print();
	obj.show();
	}

}
