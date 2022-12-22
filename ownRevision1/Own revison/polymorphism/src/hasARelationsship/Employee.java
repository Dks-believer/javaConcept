package hasARelationsship;

public class Employee {
//
//	
//	String empId;
//	String empName;
//	double salary;
//	//Employee has Address
//	Address address;//as a instance variable,non static
//	public static void main(String[] args){
//	Employee emp1 = new Employee();
//	System.out.println(emp1); //Employee object hashcode i.e Employee@323232
//	System.out.println(emp1.empId); // null
//	System.out.println(emp1.empName); // null
//	System.out.println(emp1.salary); // 0.0
//	System.out.println(emp1.address); // null
//	Employee emp2 = new Employee();
//	emp2.empId = "Emp-01";
//	emp2.empName = "Ram";
//	emp2.salary = 60000.00;
//	emp2.address = new Address();
//	emp2.address.city = "Coimbator";
//	emp2.address.state = "Tamilnadu";
//	
//	emp2.address.pincode = "434322";
//	System.out.println(emp2); 
//	System.out.println(emp2.empId); 
//	System.out.println(emp2.empName); 
//	System.out.println(emp2.salary); 
//	System.out.println(emp2.address.city+" " +emp2.address.state+" "+emp2.address.pincode); 
//	//with the help to Employee class obj (emp2) we can access
////	the Address class obj(address), and through this we can enter
////	inside that object.(like city,state,pincode)
//	
////	note:- If  we try to reach any variable which is not initilised/assigned it will give NULL value
////    and if we try to go inside any ELEMENT  through this null value we get NULL POINTER EXCEPTION
////  THAT,S WHY we have created another object emp2 , to over come this null exception
////       emp1.address---null
////       emp1.adress.city-----null pointer exception
//	
//	
//}
	String empId;
	String empName;
	double salary;
	//defining Address class as a static member
	static Address address;//Address has a "has a relatioship" between employee class;
	public static void main(String[] args){
	Employee emp1 = new Employee();
	System.out.println(emp1); //Employee object hashcode i.e Employee@323232
	System.out.println(emp1.empId); // null
	System.out.println(emp1.empName); // null
	System.out.println(emp1.salary); // 0.0
	System.out.println(Employee.address); // null
	Employee emp2 = new Employee();
	emp2.empId = "Emp-01";
	emp2.empName = "Ram";
	emp2.salary = 60000.00;
	//Employee.address = new Address();
	address = new Address(); //within the same class we can access the static members directly
	//emp2.address=new Address(); we can access the static members with the help of object also
	
	Employee.address.city = "Coimbator";
	Employee.address.state = "Tamilnadu";
	Employee.address.pincode = "434322";
	System.out.println(emp2.empId); // Emp-01
	System.out.println(emp2.empName); // Ram
	System.out.println(emp2.salary); // 60000.00
	System.out.println(Employee.address); //Address object hashcode i.e Address@232423
	System.out.println(address.city); //Coimbator
	System.out.println(emp2.address.state); //Tamilnadu
	System.out.println(emp2.address.pincode); //434322
	}

}
