package CollectionDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
Vector<Object> v=new Vector<>();
public void addData()
{
	v.add(23);
	v.add("Pooja");
	System.out.println(v);
//	Iterator<Object> o=v.iterator();
//	while(o.hasNext())
//	{
//		System.out.println(o.next());
//	}
	Enumeration<Object> e=v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorDemo oo=new VectorDemo();
		oo.addData();
	}

}
