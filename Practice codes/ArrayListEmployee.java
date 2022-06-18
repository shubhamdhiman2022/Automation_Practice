package Collections;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListEmployee {

	public void acc()
	{
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(1, "Yogesh",23));
		al.add(new Student(2, "Hira",34));
		al.add(new Student(3, "Vaibhav",45));
		al.add(new Student(4, "Aman",23));
		al.add(new Student(5, "Richa",23));
		al.add(new Student(5, "Richa",23));
		System.out.println("Size of ArrayList is:"+al.size());
		//System.out.println(al);
		for(Student e:al)
		{
			//System.out.print(e.rollno+" "+e.name," "+e.age);
			System.out.println(e.rollno+" "+e.name+" "+e.age);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListEmployee oo=new ArrayListEmployee();
		oo.acc();

	}

}
