import java.io.File;
import java.util.*;
import java.io.*;
class Readfile{

	public static void main (String[] args){

		File f =new File("C:\\Users\\deepak\\OneDrive\\Desktop\\a.txt");   //file class object

		
 		// Scanner myReader = new Scanner(f);

 		


		if(f.exists()){

			System.out.println("File name:"+ f.getName());
			System.out.println("FileLocation:"+f.getAbsolutePath());
			System.out.println("File writable:"+ f.canWrite());
			System.out.println("File Readable:"+ f.canRead());
			System.out.println("File size:"+ f.length());
			// try{
			// 	for(int i=0;i<directoryList.length();i++){
			// 	System.out.println("File data:"+ i +" "+ directoryList[i] );
			// }
			// }
			// catch(Exception e){

			// }
	// 		 try {
     
    //         while (myReader.hasNextLine()) {
    //       String data = myReader.nextLine();
    //        System.out.println(data);
    //   }
    //   myReader.close();
    // } catch (FileNotFoundException e) {
    //   System.out.println("An error occurred.");
    //   e.printStackTrace();
    // }
			
			

			System.out.println("File delete:"+ f.delete());

		}
		
		else{
			System.out.println("FIle already exists");
		}
	
	
	}
}