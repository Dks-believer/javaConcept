package enum1;

public enum Item {

	
		SUGER,RICE,SALT;
	// method inside Enum
	
		public void info(){
		System.out.println("This is grocerry item");
		}

}


//Main1S.java
    class Main1{
	   public static void main(String[] args) {
		   Item[] itr= Item.values();
		   for(Item item:itr){
			   System.out.println(item);
			   item.info();
}
}
}
