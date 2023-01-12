
class MyAnotherThread extends Thread{

	public void run(){

		for(int i=10;i>1;i--){

			System.out.println("Another thraed i=" +i);
			try{
				Thread.sleep(1000);
		}
		catch(Exception e){

		}
		
	}
}

	// public static void main(String args[]){

	// 	MyAnotherThread mat2 = new MyAnotherThread();

	// 	mat2.start();

	
	// }
}