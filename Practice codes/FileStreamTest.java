package FileHandling;

import java.io.*;


public class FileStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		      byte bWrite [] = {97,98,3,40,5};
		      FileOutputStream os = new FileOutputStream("D://test.txt");
		     
		      for(int x=0; x < bWrite.length ; x++){
		         os.write( bWrite[x] ); // writes the bytes
		      }
		      os.close();
		     
	      FileInputStream is = new FileInputStream("D://test.txt");
	      int size = is.available();

		      for(int i=0; i< size; i++){
		         System.out.print((int)is.read() + "  ");
		      }
		      is.close();
		   }catch(IOException e){
		      System.out.print("Exception");
		   }    
	}

}
