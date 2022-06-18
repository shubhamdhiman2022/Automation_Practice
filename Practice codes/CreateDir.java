package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateDir {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 String dirname = "D://Sudeep";
	      File d = new File(dirname);
	      // Create directory now.
	      d.mkdir();
	      
	}
}
