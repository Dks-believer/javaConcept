package enum1;

public enum ItemOverride {

	
		SUGER,RICE  
		{        // overwritten method
		public void info(){
		System.out.println("This is Rice");  //This is grocerry item
		}
		},SALT;
		public void info(){
		System.out.println("This is grocery item");
		}
		
}
//Main.java
 class Main2{
public static void main(String[] args) {
Item[] itr= Item.values();
for(Item item:itr){
	System.out.println(item);
item.info();
}
}
}
//We can’t create enum objects explicitly and hence we can’t invoke enum
 /*constructor directly.
 The constructor of enum type is private. If you don't declare private, compiler
 internally creates private constructor.*/