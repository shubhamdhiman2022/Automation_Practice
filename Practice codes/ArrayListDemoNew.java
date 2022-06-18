package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemoNew {
ArrayList<Integer> al=new ArrayList<>();
ArrayList<Object>al1=new ArrayList<Object>();
public void accept()
{
	al.add(1234);
	//al.add("Arvind");
	//al.add(45.22);
	al.add(645);
	
	
	int c=al.get(0)+al.get(1);
	//al.add(c);
	al.add(0, c);
	//System.out.println(al.get(0));
	//System.out.println("value at 0 index:"+al.get(1));
	//System.out.println("size of collection is:"+al.size());
	
//	for(Object a:al)
//	{
//		System.out.println(a);
//	}
	al.remove(0);
	
	Iterator<Integer> it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemoNew oo=new ArrayListDemoNew();
		oo.accept();
	}

}
