package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader {
	

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		File f = new File("D://readdata.txt");
        System.out.println(f.exists());
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(97);
        bw.newLine();
        char[] ch1 = { 'a', 'b', 'c', 'd' };
        bw.write(ch1);
        bw.newLine();
        bw.write("TECH");
        bw.newLine();
        bw.write("software");
        bw.flush();
        bw.close();
        }
	}



