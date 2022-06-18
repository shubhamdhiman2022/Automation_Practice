package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentsData 
{
	int i,len;
	String name[]=new String[5];
	
	byte ar[]= new byte[5];
	
	Scanner sc= new Scanner(System.in);
	
	File f= new File("D://Stu.txt");
	
	public void create() throws IOException
	{
		f.createNewFile();
	}
	
	public void write() throws IOException 
	{
		len=name.length;
		for(i=0;i<len;i++)
		{
			System.out.println("Enter the name of "+i+" student: ");
			name[i]=sc.next();
		}
		FileWriter fw= new FileWriter(f);
		for(i=0;i<len;i++)
		{
			//str=name[i];
			//data=str;
				
		
		fw.write(name[i]);
		
		}fw.close();
		FileReader fr=new FileReader(f);
				for(i=0;i<len;i++)
				{
					System.out.println(fr.read());
					
				}
			//ar= str.getBytes();
			//FileOutputStream out=new FileOutputStream(f);
			//out.write(ar);
	}
	
	public static void main(String[] args) throws IOException 
	{
		StudentsData obj= new StudentsData();
		//obj.create();
		obj.write();
	}
}