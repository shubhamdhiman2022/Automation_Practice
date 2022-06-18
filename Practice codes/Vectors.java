package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();//creating vector
		//Vector v=new Vector<>();
		  v.add("umesh");//method of Collection  
		  v.add("irfan");//method of Vector  
		  v.add("kumar"); 
		  v.add("umesh");
		  //traversing elements using Enumeration 
		  System.out.println(v);
		  Enumeration<String> e=v.elements();  
		  while(e.hasMoreElements())
	{  
		   System.out.println(e.nextElement());  
		   
	}
		  
	}
}
