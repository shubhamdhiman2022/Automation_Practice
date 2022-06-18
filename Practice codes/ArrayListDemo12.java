package Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo12 {
public void accept()
{
	List<Object> al=new ArrayList<Object>();
	ArrayList<Object> al1=new ArrayList<Object>();
	//Vector <Object>al=new Vector<Object>();
	al.add(123);
	al.add(123);
	al.add(3423);
	al.add("Vaibhav");
	al.add("Hira");
	al.remove(2);
	//al.addAll(c)
	al.add("123");
//	System.out.println("Size of Array List is:"+al.size());
	al.add(89.87);
	al1.add("hello");
	al1.add("Yogesh");
	al1.addAll(al);
	
	//al1.removeAll(al);
	al1.clear();
//	for(int i=0;i<=5;i++)
//	{
//		System.out.println(al.get(i));
//	}
	//Using Iterator
	Iterator <Object> itr=al1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	
	}
	
	
	//using Enumeration
//	Enumeration<Object> e=al.elements();  
//	  while(e.hasMoreElements())
//{  
//	   System.out.println(e.nextElement());  
//}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo12 oo=new ArrayListDemo12();
		oo.accept();
	}

}
