package superKeyword;

public class Dog extends Animal {

	String color="black";
	
	void printColor(){
		System.out.println(color);//prints color of Dog class
		System.out.println(super.color);//prints color of Animal class
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.printColor();

	}

}
