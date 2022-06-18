package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
public void accept()
{
	//ArrayList al=new ArrayList();//Non Generic
	ArrayList<String>al=new ArrayList<String>();//Generic List
	al.add("Abhishek");
	al.add("123");
	al.add("Pooja");
	al.add("Abhishek");
	for(Object a:al)
	{
		System.out.println(a);
	}
	System.out.println("Size of Array:"+al.size());
	System.out.println("Element at 2nd Location is:"+al.get(2));
	System.out.println("Remove element from 2nd location"+al.remove(2));
	 Iterator<String> itr=al.iterator();//getting Iterator from arraylist to traverse elements  
     while(itr.hasNext())
     {  
      System.out.println(itr.next());  
     }
	System.out.println("contains"+al.contains("Abhishek"));
	System.out.println(al.indexOf("Abhishek"));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayListDemo1 oo=new ArrayListDemo1();
oo.accept();
	}

}
