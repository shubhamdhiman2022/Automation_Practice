package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemonew {
	Scanner sc=new Scanner(System.in);
	byte[] arr={10,2,4,2};
	public void acc() throws IOException
	{
		File f=new File("D://Shubhain//shubhin.txt");
		f.createNewFile();
		//f.mkdir();
//		f.delete();
//		FileOutputStream fo=new FileOutputStream(f);
//		for(int i=0;i<arr.length;i++)
//		{
//			fo.write(arr[i]);
//		}
//		FileInputStream fis=new FileInputStream(f);
//		fis.read(arr);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileDemonew oo=new FileDemonew();
		oo.acc();

	}

}
