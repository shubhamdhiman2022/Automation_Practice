package InheritanceDemo;

import java.util.Scanner;

public class StuMarksDet extends StuPerDet{
	int eng,hindi,total,rollno;
	public StuMarksDet()
	{
		//super.accept();
	//	super();
		super(10,30);
		super.rollno=12;
		System.out.println("Enter marks in English");
		eng=sc.nextInt();
		
		System.out.println("Enter marks in Hindi");
		hindi=sc.nextInt();
		
		total=eng+hindi;
		System.out.println("Total is:"+total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StuMarksDet oo=new StuMarksDet();
		//oo.accept();
	}

}
//class StuPerDet1 {
//int rollno;
//String name;
//Scanner sc=new Scanner(System.in);
//public void accept()
//{
//	System.out.println("Enter Rollno");
//	rollno=sc.nextInt();
//	
//	System.out.println("Enter Name");
//	name=sc.next();
//}
//public void display()
//{
//	//accept();
//	System.out.println("Rollno is:"+rollno);
//	System.out.println("Name is:"+name);
//}
	
//}

