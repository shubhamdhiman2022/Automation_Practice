package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm=new HashMap<Integer,String>();  
	      
	      hm.put(1,"Sony TV");  
	      hm.put(11,"Colors");  
	      hm.put(15,"Zee Tv");  
	      hm.put(15,"Star Plus"); 
	     // hm.put("D", "Discovery");
	     // for(String s:hm)
//	      for(Map.Entry m:hm.entrySet()){  
//	       System.out.println(m.getKey()+" "+m.getValue());  
	      Iterator trav=hm.entrySet().iterator();
	      while(trav.hasNext())
	      {
	    	  System.out.println(trav.next());
	    	  
	    	  //String value=(String)trav.next();  // will give next Value
	    	 // System.out.println(value);
	      }  
	      
	}

}
