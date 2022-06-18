package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();  
		
	    al.add(new Student(101,"Vijay",23));  
	    al.add(new Student(106,"Ajay",27));  
	    al.add(new Student(105,"Jai",21));  
	   System.out.println(al.size());
	    //System.out.println(al);
	   // System.out.println("Sorting by Name...");  
	      
	//   Collections.sort(al);  
	    for(Student st: al){  
	    System.out.println(st.rollno+" "+st.name+" "+st.age);  
    }  
	}

}
