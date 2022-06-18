package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemoo1 {
	List<Object> al=new ArrayList<Object>();
public void acc()
{
	al.add("Gaurav");
	al.add("Harpreet");
	al.add("Aman");
	al.add(1);
	al.add(1.22);
	al.remove(3);
	System.out.println(al.size());
//	for(Object a:al)
//	{
//		System.out.println(a);
//	}
	ListIterator<Object> i=al.listIterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	System.out.println("Display Previous List");
	while(i.hasPrevious())
	{
		System.out.println(i.previous());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemoo1  oo=new ArrayListDemoo1();
		oo.acc();
	}

}
