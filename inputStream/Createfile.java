import java.io.*;
class CreateFile{

	public static void main (String[] args){

		File f =new File("C:\\Users\\deepak\\OneDrive\\Desktop\\a.txt");   //file class object
 		
 		try{


		if(f.createNewFile()){

			System.out.println("File sussessfully created");
		}
		
		else{
			System.out.println("FIle already exists");
		}
	}
	catch(IOException I){
 
 	System.out.println("Exception hndled");
	}
	}
}