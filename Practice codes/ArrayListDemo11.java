package Collections;

import java.util.ArrayList;

public class ArrayListDemo11 {
	public void acc() {
		ArrayList<Object> al = new ArrayList<Object>();

		al.add("Shruti");
		al.add("sam@gmail.com");
		al.add("Deepika");
		al.add(123);
		//al.add("Deepika");
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(1));
		al.remove(1);
	System.out.println("After Removing element from 1 location...");
		System.out.println(al);
		System.out.println(al.contains("Sh"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo11 oo = new ArrayListDemo11();
		oo.acc();
	}

}
