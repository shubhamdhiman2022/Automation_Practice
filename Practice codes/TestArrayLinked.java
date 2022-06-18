package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> al=new ArrayList<String>();//creating arraylist    
		  al.add("Ravi");//adding object in arraylist    
		  al.add("Vijay");    
		  al.add("Ravi");    
		  al.add("Ajay");    
		   System.out.println(al.size());
		   al.remove(2);
		   System.out.println("Values after removing index 2"+al);
		  List<String> al2=new LinkedList<String>();//creating linkedlist    
		  al2.add("James");//adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Junaid");    
		    
		   
		  System.out.println("linkedlist: "+al2);  
		 }    
	}


