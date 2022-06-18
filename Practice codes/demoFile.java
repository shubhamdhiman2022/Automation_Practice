package FileHandling;

import java.io.*;

public class demoFile {
public void accept() throws IOException
{
	File f=new File("D://Demob1//Aman.txt");
	f.createNewFile();
	//f.mkdir(); 
	byte[] ar={11,44,11,65,98};
	
	FileOutputStream out=new FileOutputStream(f);
	for(int i=0;i<ar.length;i++)
	{
		out.write(ar[i]);
		
	}
	FileInputStream is=new FileInputStream(f);
	int size=is.available();
	System.out.println(size);
	System.out.println("Read Data");
	for(int i=0;i<size;i++)
	{
		System.out.println(is.read());
	}
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		demoFile oo=new demoFile();
		oo.accept();

	}

}
