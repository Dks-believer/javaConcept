package com.interface1;

public interface Shape {

	abstract void draw();
}

  class Circle implements Shape{

	@Override
	public void draw() {
	
		System.out.println("Drawing circle");
		
	}
  }
	
	class Rectangle implements Shape{

		@Override
		public void draw() {
		  
			System.out.println("Drawing Rectangle");
			
		}
	}
	
	class Main{

		public static void main(String[] args) {
			
			//Shape s0 = new Shape()  // can,t instantiate the interface
			
			Circle c = new Circle();
			c.draw();
			
			Rectangle r = new Rectangle();
			r.draw();
			
			
			Shape s1 = new Circle();
			s1.draw();
			
			
			Shape s2 = new Rectangle();
			s2.draw();
			
			Rectangle r2=(Rectangle)s2;
			r2.draw();
			
			
		
		}
	}
	

