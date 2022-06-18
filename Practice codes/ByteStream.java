package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D://prince.txt");
            out = new FileOutputStream("D://avineet.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
           
                in.close();
                out.close();
            }
            
                
            
        }
	}


