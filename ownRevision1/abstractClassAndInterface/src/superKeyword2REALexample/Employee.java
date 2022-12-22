package superKeyword2REALexample;

public class Employee extends Person {

	float salary;
	
		
	public Employee(int id, String name, float salary) {
		super(id, name);  //this super keyword by default
		this.salary = salary;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+salary);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Employee e1= new Employee(1,"Dks",43500);
       e1.display();
       
       
       
	}

}
