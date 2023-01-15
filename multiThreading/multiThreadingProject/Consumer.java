class Consumer extends Thread{

Company c;

Consumer(Company c){  //to call the consumer_item method we need the object of company,,,,,,by constructor

	this.c=c;
}

	public void run() {  //overwritten method doesn,t throw exception
     //our work

		
		while(true){

			this.c.consume_item();
  
			try{Thread.sleep(2000);} catch(Exception e){}

			
		}
	}
}