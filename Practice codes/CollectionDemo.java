package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
public void accept()
{
	ArrayList<Object> al=new ArrayList<Object>();
	al.add("Pooja");
	al.add(123);
	al.add("sjain@btes.co.in");
	al.add(2);
	al.add(3);
	al.add(3);
	System.out.println("Size of collection is:"+al.size());
	System.out.println("Get element from 1st index"+al.get(1));
	al.remove(2);
	
//	for(Object a:al)
//	{
//		System.out.println(a);
//	}
Iterator<Object> it=al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionDemo oo=new CollectionDemo();
		oo.accept();
	}

}
