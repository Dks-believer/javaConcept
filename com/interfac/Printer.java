package com.interfac;

//public interface Printer {
//	
//	int number=10;
//	void print();
//	}
//	//Java compiler auto converts it as follows:
//	
//}
public interface Printer{

	public static final int number=10;
	public abstract void print();
}

//ConsolePrinter.java
  class ConsolePrinter implements Printer{
     public void print(){
     System.out.println("Printing on the console.");
  }
}
//FilePrinter.java
   class FilePrinter implements Printer{
     public void print(){
     System.out.println("Printing on the File.");
  }
}
//Main.java
   class Main{
    public static void main(String args[]){
   ConsolePrinter cp = new ConsolePrinter();
    Printer p1 = new ConsolePrinter();
   Printer p2 = new FilePrinter();
   cp.print();
    p1.print();
	p2.print();
}
}