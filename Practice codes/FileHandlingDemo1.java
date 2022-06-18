package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingDemo1 {
	byte[] arr={12,44,11,4,54};
public void acc() throws IOException
{
	//File is class is used to Create/Delete/check size of file.
	File f=new File("D://Students.txt");
	//f.createNewFile();
	System.out.println(f.getAbsolutePath());
	
	//FileOutputStream is used to Write data in to the File.
	FileOutputStream fo=new FileOutputStream(f);
	for(int i=0;i<arr.length;i++)
	{
		fo.write(arr[i]);
	}
	
	//FileInputStream is used to read data from File.
	FileInputStream fis=new FileInputStream(f);
	int size=fis.available();
	System.out.println("Size of file is:"+size);
	for(int i=0;i<size;i++)
	{
		System.out.println(fis.read());
	}
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileHandlingDemo1 oo=new FileHandlingDemo1();
		oo.acc();
	}

}
