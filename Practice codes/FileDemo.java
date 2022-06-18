package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
public void acc() throws IOException
{
	File path=new File("D://abc.txt");
	path.createNewFile();
	//f.delete();
	byte[] ar={11,44,11,65,98};
	
	FileOutputStream out=new FileOutputStream(path);
	for(int i=0;i<ar.length;i++)
	{
		out.write(ar[i]);
		
	}
	FileInputStream is=new FileInputStream(path);
	int size=is.available();
	for(int i=0;i<size;i++)
	{
		System.out.println(is.read());
	}
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileDemo oo=new FileDemo();
		oo.acc();
	}

}
