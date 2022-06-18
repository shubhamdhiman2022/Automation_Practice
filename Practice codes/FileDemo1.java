package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo1 {
	int c;
	byte[] arr={12,33,3,11,1};
public void acc() throws IOException
{
	File f=new File("D://harman.txt");
	f.createNewFile();
	FileOutputStream fo=new FileOutputStream(f);
	for(int i=0;i<arr.length;i++)
	{
		fo.write(arr);
	}
	fo.close();
	FileInputStream fi=new FileInputStream(f);
	//int size=fi.available();
	//for(int i=0;i<fi.available();i++)
	 while ((c = fi.read()) != -1) {
        System.out.println(c);
     }
//	while ((fi.available()!=0))
//	{
//		System.out.println(fi.read());
//		
//	}
	fi.close();
	
	
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileDemo1 oo=new FileDemo1();
		oo.acc();
	}

}
