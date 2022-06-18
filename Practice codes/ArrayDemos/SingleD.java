package ArrayDemos;

import java.util.Scanner;

import OOPS.EmployeeDemo;

public class SingleD {
public void acc()
{
	EmployeeDemo oo=new EmployeeDemo();
	EnterDetails();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] rollno={1,2,3,4,5,6,7,8};//Declaration  + Initialization
		int[] rollno=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("eNTER rOLLNO");
		for(int i=0;i<rollno.length;i++)
		{
			rollno[i]=s.nextInt();
		}
//		for(int i=0;i<rollno.length;i++)
//		{
//			System.out.print(rollno[i]+" ");
//		}
		for(int b:rollno)//Enhanced For Loop
		{
			System.out.println(b);
		}
		
		
	}

}
