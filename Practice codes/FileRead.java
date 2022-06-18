package FileHandling;

import java.io.*;

public class FileRead {
	public static void main(String[] ar) throws IOException {
		BufferedWriter bf = null;
		try {
		//	File ff = new File("D://Demob1//Aman.txt");
		//	ff.createNewFile();
			FileWriter fw = new FileWriter("D://Stu.txt");
			bf = new BufferedWriter(fw);
			char[] aa = { 'a', 'b' };
			for (int i = 0; i < aa.length; i++) {
				bf.write(aa[i]);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		bf.close();
		}
	//	BufferedReader rd=new BufferedReader();
		
	}
}
