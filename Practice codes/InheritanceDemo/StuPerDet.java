package InheritanceDemo;

import java.util.Scanner;

public class StuPerDet {
int rollno;
String name;
Scanner sc=new Scanner(System.in);
//public void accept()
//{
//	System.out.println("Enter Rollno");
//	rollno=sc.nextInt();
//	
//	System.out.println("Enter Name");
//	name=sc.next();
//	//display();
//}
public StuPerDet()
{
	
		System.out.println("Enter Rollno");
		rollno=sc.nextInt();
		
		System.out.println("Enter Name");
		name=sc.next();
		//display();
	
}
public StuPerDet(int a,int b)
{
	
		System.out.println("Enter Rollno");
		rollno=sc.nextInt();
		
		System.out.println("Enter Name");
		name=sc.next();
		//display();
	
}
public void display()
{
	//accept();
	System.out.println("Rollno is:"+rollno);
	System.out.println("Name is:"+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
