package FileHandling;
import java.io.*;
public class FileDEmooo {
public void accept() throws IOException
{
byte[] arr={11,24,44,66};
	//f.delete();
	//System.out.println("File is deleted");
	File f1=new File("D://Programmes");
	f1.mkdirs();
	
	File f=new File("D://Programmes//Richa.txt");
	f.createNewFile();
	System.out.println("File is created...");
	//Writing data into file
	FileOutputStream o=new FileOutputStream(f);
	for(int i=0;i<arr.length;i++)
	{
		o.write(arr[i]);
	}
	
	//Read Data from File
	 FileInputStream is = new FileInputStream("D://Programmes//Richa.txt");
     int size = is.available();

	      for(int i=0; i< size; i++){
	         System.out.print(is.read() + "  ");
	      }
	      is.close();
	   
	    
}
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileDEmooo oo=new FileDEmooo();
		oo.accept();
	}

}
