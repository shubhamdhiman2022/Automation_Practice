package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<Object> al=new HashSet<Object>();  
	        
	      al.add(20);  
	      al.add(10);  
	      al.add(20);  
	      al.add(10);  
	      al.add("yogesh");
	      al.add("Hira");
	      al.add(78);
	      
	      System.out.println("Size of Hashset:"+al.size());
	      System.out.println(al);
//	      for(Object a:al)
//	      {
//	    	  System.out.println(a);
//	    	  
//	      }
	    //  al.remove(1);
	      //System.out.println("Elements after removing");
	      //System.out.println("new size of collection is"+al.size());
	      Iterator<Object> itr=al.iterator();  
	      while(itr.hasNext())
	      {  
	       System.out.println(itr.next());  
	      }  
	}

}
