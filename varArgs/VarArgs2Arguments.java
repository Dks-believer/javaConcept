package varArgs;

public class VarArgs2Arguments {

	
		static void display(int num, String... values){
			
		System.out.println("number is "+num);
		
		for(String s:values){
		System.out.println(s);
		}
		}
		public static void main(String args[]){
		display(200);//zero var-arg
		display(500,"hello");//one var-args
		display(1000,"my","name","is","varargs");//four var-args
		}
		
//note:- we can pass only one var args type but multple arguments
}
