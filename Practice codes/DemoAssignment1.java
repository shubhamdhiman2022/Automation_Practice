package Collections;

import java.util.Iterator;
import java.util.Vector;

public class DemoAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = new Integer(8); 
		Integer b = new Integer(4);
		Integer c = new Integer(4);     
		Vector vec = new Vector();     
		Iterator itr;
		vec.add(a);    
		vec.add(b);     
		vec.add(c); 
		itr = vec.iterator();
		while (itr.hasNext()) {
		System.out.println("" + itr.next());
		 }  }  
	}


