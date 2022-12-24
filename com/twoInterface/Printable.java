package com.twoInterface;



public interface Printable {

	void print();
	}
	//Showable.java
	interface Showable{
	void show();
	//void print();
	}
	
	//Demo.java
	class Demo implements Printable, Showable{  //a class implementing two interface
	
		public void print(){
			System.out.println("Hello print");
	}
	
		public void show(){
			System.out.println("Welcome show");
	}
	public static void main(String args[]){
	Demo obj = new Demo();
	obj.print();
	obj.show();
	Printable p = new Demo();
	p.print();
	Showable s = new Demo();
	s.show();
	//s.print();
	}

}
