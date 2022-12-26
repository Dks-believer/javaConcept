package enum1;

import java.util.Scanner;

public enum EnumAllin1CITY {

	
	DELHI{
	public void message(){ // overriden method
	System.out.println("welcome user..");
	System.out.println("you are in capital");
	}
	},
	MUMBAI,
	CHENNAI("50 towers"),
	KOLKATA;
	
	//variables in enum
	public String numberofTowers;
	
	//constructor
	EnumAllin1CITY(){
	this.numberofTowers="100 towers";
	}
	EnumAllin1CITY(String numberofTowers){ //overloaded constructor

	this.numberofTowers=numberofTowers;
	}
	public void message(){
	System.out.println("welcome user..");
	}
	}
	//Main3.java
	 class Main3{
	 public void printCity( EnumAllin1CITY city){
	if(city != null){
	System.out.println("our service is available ");
	city.message();
	System.out.println(city.numberofTowers);
	}
	else
	System.out.println("invalid city");
	}
	public static void main(String[] args) {
	Main3 m1=new Main3();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name of city");
	
	m1.printCity(EnumAllin1CITY.valueOf(sc.next().toUpperCase())); //.valueOf(changes the type to String
	}
	}

