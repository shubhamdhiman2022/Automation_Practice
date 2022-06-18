package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
ArrayList<Object> al=new ArrayList<Object>();//derived from List Interface
ArrayList<Object> al1=new ArrayList<>();
public void addData()
{
	al.add(1);
	al.add("Shalini");
	al.add("SDET");
	al.add(2);
	
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.isEmpty());
	System.out.println("Get value from 2nd index:"+al.get(2));
//	al.remove(1);
//	System.out.println(al);
	//al.clear();
	//System.out.println(al);
	System.out.println(al.contains(2));
//	for(Object a:al)
//	{
//		System.out.println(a);
//	}
//	Iterator<Object> ii=al.iterator();
//	while(ii.hasNext())
//	{
//		System.out.println(ii.next());
//	}
	ListIterator<Object> li=al.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
		
	}
	System.out.println("Back loop");
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
		
	}
	li.remove();
	System.out.println(li);
	//System.out.println("Previous"+li.previous());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo oo=new ArrayListDemo();
		oo.addData();
	}

}
