package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylistdemoo {

public void acc()
{
	//Arraylist<String>al=new Arraylist<String>();
	List<Integer> al=new ArrayList<Integer>();
	al.add(123);
	al.add(1235);
	al.add(123456);
	al.add(789);
	System.out.println(al);
	System.out.println(al.get(1));
	System.out.println("Collection after removing data");
	al.remove(1);
	System.out.println(al);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylistdemoo oo=new Arraylistdemoo();
		oo.acc();
	}

}
