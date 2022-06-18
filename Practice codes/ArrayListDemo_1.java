package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al=new ArrayList<Object>();//creating arraylist  
	      al.add("Ravi");//adding object in arraylist  
	      al.add("Vijay");  
	      al.add("Ravi");  
	      al.add("Ajay"); 
	     // System.out.println(al);
	    //  System.out.println(al.get(2));
	      //al.add(1);
//	      for(Object a:al)
//	      {
//	    	  System.out.println(a);
//	      }
	//      System.out.println(al.remove(2));
	 //     System.out.println(al);
//		ArrayList al=new ArrayList();
//		al.add(123);
//		al.add("Harpreet");
//		al.add(123.22);
//		System.out.println(al);
//	      ArrayList<Object> al=new ArrayList<Object>();
//	      al.add("Kamal");
//	      al.add("Kamal");
//	      al.add(134);
//	      al.add('c');
//	      for(Object aa:al)
//	      {
//	    	  System.out.println(aa);
//	      }
      Iterator<Object> itr=al.iterator();//getting Iterator from arraylist to traverse elements  
      while(itr.hasNext()){  
    System.out.println(itr.next());  
	      
 
	}
	}
}
//}




