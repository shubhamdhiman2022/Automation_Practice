package OOPS;

import java.util.Scanner;

public class EmployeeDemo {
//Data Members
int empid;
float salary;
String name;
Scanner s=new Scanner(System.in);
 protected void EnterDetails()//Method
{
	System.out.println("Enter Id");
	empid=s.nextInt();
	
	System.out.println("Enter Name");
	name=s.next();
	
	System.out.println("Enter Salary");
	salary=s.nextFloat();
}
public void display()
{
	
	System.out.println("emp id is:"+empid);
	System.out.println("name is:"+name);
	System.out.println("Salary is:"+salary);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDemo obj=new EmployeeDemo();
		obj.EnterDetails();
		obj.display();
		System.out.println(obj.empid);

	}

}
