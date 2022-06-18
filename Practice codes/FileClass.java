package FileHandling;

import java.io.*;

public class FileClass {

	public void CreateFile() throws IOException
	{
		//File f=new File("D://Deepika//dd.txt");
	
		//f.createNewFile();
		//f.delete();
		//System.out.println(f.getAbsolutePath());
		
		//f.mkdir();
		//System.out.println(f.exists());
		byte[] ab={1,2,99,100};
		FileOutputStream fi=new FileOutputStream("D://vansh.txt");
		for(int i=0;i<ab.length;i++)
		{
			fi.write(ab[i]);
		}
FileInputStream ff=new FileInputStream("D://Deepika.txt");
		int size=ff.available();
				for(int i=0;i<size;i++)
				{
					System.out.println((int)ff.read());
				}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileClass oo=new FileClass();
		oo.CreateFile();
	}

}
