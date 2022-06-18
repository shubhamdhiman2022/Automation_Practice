package OOPS;

import java.io.*;


public class BufferedReaderDemo {
	int num;
	String name;
public void input() throws IOException
{
	InputStreamReader rd=new InputStreamReader(System.in);
	BufferedReader bd=new BufferedReader(rd);
	System.out.println("Enter name");
	name=bd.readLine();
	
	System.out.println();
	
}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReaderDemo oo=new BufferedReaderDemo();
        oo.input();
	}

}
