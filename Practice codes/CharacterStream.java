package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileReader inputStream=null;
	        FileWriter outputStream;

	        try {
	            inputStream = new FileReader("D://vansh.txt");
	            outputStream = new FileWriter("D://vansh1.txt");

	            int c;
	            while ((c = inputStream.read()) != -1) {
	                outputStream.write(c);
	            }
	        } finally {
	           
	                inputStream.close();
	            }
	           
	                outputStream.close();
	            }
	        
	}

	    

