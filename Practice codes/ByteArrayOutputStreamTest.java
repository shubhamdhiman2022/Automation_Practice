package FileHandling;

import java.io.*;

public class ByteArrayOutputStreamTest {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 ByteArrayOutputStream bOutput = new ByteArrayOutputStream(20);
		FileOutputStream bOutput1 = new FileOutputStream("D:/new.txt");
	      while( bOutput.size()!= 19 ) {
	         // Gets the inputs from the user
	         bOutput.write(System.in.read()); 
	      }

	      byte b [] = bOutput.toByteArray();
	      System.out.println("Print the content");
	      for(int x= 0 ; x < b.length; x++) {
	         // printing the characters
	         System.out.print((char)b[x]  + "   "); 
	      }
	      System.out.println("   ");

	      int c;

	      ByteArrayInputStream bInput = new ByteArrayInputStream(b);

	      System.out.println("Converting characters to Upper case " );
	      for(int y = 0 ; y < 1; y++ ) {
	         while(( c= bInput.read())!= -1) {
	            //System.out.println(Character.toUpperCase((char)c));
	        	 bOutput1.write(Character.toUpperCase((char)c));
	        	 
	         }
	         bInput.reset();
	      }
	}

}
