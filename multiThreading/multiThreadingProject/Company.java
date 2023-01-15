
class Company{

	int n;

	boolean f = false;
	// f=false: chance--producer
	//f=true: chancem-- consumer
	synchronized public void produce_item(int n) throws Exception{  //we can throw exceotion or we can put them inside try and catch...we are doing  for wait()

		if(f){
			wait();     //threads are intercommunicating with eachother,it provides fully synchronisation
		}
		this.n=n;
		System.out.println("Produced :"+ this.n);
		f=true;
		notify();
	}

	synchronized public int consume_item() throws Exception{

		if(!f){
			wait();
		}
		System.out.println("consumed : "+this.n);
 		f=false;
 		notify();
		return this.n;
	}
}