
class Producer extends Thread{

Company c;

Producer(Company c){  //to call the produce_item method we need the object of company,,,,,,by constructor

	this.c=c;
}

	public void run() {
     //our work

		int i=1;

		while(true){

			this.c.produce_item(i);
  
			try{Thread.sleep(1000);} catch(Exception e){}

			i++;
		}
	}
}